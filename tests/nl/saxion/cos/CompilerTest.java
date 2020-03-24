package nl.saxion.cos;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompilerTest {

	@Test
	void helloFileShouldCompileAndOutputHello() throws Exception {
		// Compile and assemble testFiles/hello.exlang
		Compiler c = new Compiler();
		JasminBytecode code = c.compileFile("testFiles/hello.exlang", "HelloWorld");
		assertNotNull(code);
		AssembledClass aClass = AssembledClass.assemble(code);

		// Run the class
		SandBox s = new SandBox();
		s.runClass(aClass);
		List<String> output = s.getOutput();

		// Check that output matches what we expect
		assertArrayEquals(new String[] {
				"Hello from ExampleLang!"
		}, output.toArray());
	}

	@Test
	void weCanAlsoCompileFromString() throws Exception {
		// Compile and assemble the string 'hello; hi;'
		Compiler c = new Compiler();
		JasminBytecode code = c.compileString("hello; hi;", "HelloWorld");
		assertNotNull(code);
		AssembledClass aClass = AssembledClass.assemble(code);

		// Run the class
		SandBox s = new SandBox();
		s.runClass(aClass);
		List<String> output = s.getOutput();

		// Check that output matches what we expect
		assertArrayEquals(new String[] {
				"Hello from ExampleLang!"
		}, output.toArray());
	}

	@Test
	void checkingForCorrectByteCode() throws Exception {
		// Compile the file testFiles/hello.exlang
		Compiler c = new Compiler();
		JasminBytecode code = c.compileFile("testFiles/hello.exlang", "HelloWorld");
		assertNotNull(code);

		// Check that the bytecode matches what we expect
		assertArrayEquals(new String[] {
			".bytecode 49.0",
			".class public HelloWorld",
			".super java/lang/Object",
			"",
			".method public static main([Ljava/lang/String;)V",
			".limit stack 2",
			".limit locals 1",
			"",
			"getstatic java/lang/System/out Ljava/io/PrintStream;",
			"ldc \"Hello from ExampleLang!\"",
			"invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V",
			"return",
			".end method"
		}, code.getLines().toArray());
	}

	@Test
	void syntaxErrorsAreFound() throws Exception {
		// Try to compile a file with syntax errors. The compiler should detect this and should
		// return null.
		// (N.B. We could also check if the error matches what we expect if our compiler supports
		// that).
		Compiler c = new Compiler();
		JasminBytecode code = c.compileString("dfsgkjs;", "HelloWorld");
		assertNull(code);
	}
}
