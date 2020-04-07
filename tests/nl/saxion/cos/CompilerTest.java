package nl.saxion.cos;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This file shows a few different ways you can do automated tests:
 *
 *  - checkByteCode():        Shows how to compile a file and check that the bytecode that was
 *                            generated matches your expectations.
 *  - checkByteCode2():       Same as above, but now the output is stored in a file.
 *  - syntaxErrorsAreFound(): Checks that a file with syntax errors stops compilation.
 *  - checkOutputFile():      This test shows how to compile a file, run it and check if the output
 *                            matches your expectations.
 *  - checkOutputString():    Same as above, but now the source code is coming from a string within
 *                            the test.
 *
 * Not shown is a test where the file contains no syntax errors, but the checker should find some
 * error. You can of course add that yourself.
 */
class CompilerTest {

	/**
	 * Helper method that takes some compiled Jasmin byte code, assembles it and
	 * runs the class. It returns the output of the execution, which you can use
	 * to check in an assert.
	 */
	private List<String> runCode( JasminBytecode code ) throws AssembleException {
		// Turn the Jasmin code into a (hopefully) working class file
		if( code == null ) {
			throw new AssembleException("No valid Jasmin code to assemble");
		}
		AssembledClass aClass = AssembledClass.assemble(code);

		// Run the class and return the output
		SandBox s = new SandBox();
		s.runClass(aClass);
		return s.getOutput();
	}

	@Test
	void checkByteCode() throws Exception {
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
	void checkByteCode2() throws Exception {
		// Compile the file testFiles/hello.exlang
		Compiler c = new Compiler();
		JasminBytecode code = c.compileFile("testFiles/hello.exlang", "HelloWorld");
		assertNotNull(code);

		// Check that the bytecode matches what we expect
		List<String> expectedOutput = Files.readAllLines(Paths.get("testFiles/hello.expected_j"));
		assertArrayEquals(expectedOutput.toArray(), code.getLines().toArray());
	}

	@Test
	void syntaxErrorsAreFound() throws Exception {
		// Try to compile a file with syntax errors. The compiler should detect this and should
		// return null.
		Compiler c = new Compiler();
		JasminBytecode code = c.compileString("dfsgkjs;", "HelloWorld");
		assertNull(code);
	}

	@Test
	void checkOutputFile() throws Exception {
		// Compile and assemble testFiles/hello.exlang
		Compiler c = new Compiler();
		JasminBytecode code = c.compileFile("testFiles/hello.exlang", "HelloWorld");
		assertNotNull(code);

		// Check that output matches what we expect
		List<String> output = runCode(code);
		assertArrayEquals(new String[] {
				"Hello from ExampleLang!"
		}, output.toArray());
	}

	@Test
	void checkOutputString() throws Exception {
		// Compile and assemble the string 'hello; hi;'
		Compiler c = new Compiler();
		JasminBytecode code = c.compileString("hello; hi;", "HelloWorld");
		assertNotNull(code);

		// Check that output matches what we expect
		List<String> output = runCode(code);
		assertArrayEquals(new String[] {
				"Hello from ExampleLang!"
		}, output.toArray());
	}
}
