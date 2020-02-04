package nl.saxion.cos;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompilerTest {

	@Test
	void helloFileShouldCompileAndOutputHello() throws Exception {
		Compiler c = new Compiler();
		JasminBytecode code = c.compileFile("testFiles/hello.exlang", "HelloWorld");
		AssembledClass aClass = AssembledClass.assemble(code);

		SandBox s = new SandBox();
		s.runClass(aClass);
		List<String> output = s.getOutput();

		assertArrayEquals(new String[] {
				"Hello World!"
		}, output.toArray());
	}

	@Test
	void weCanAlsoCompileFromString() throws Exception {
		Compiler c = new Compiler();
		JasminBytecode code = c.compileString("hello;", "HelloWorld");
		AssembledClass aClass = AssembledClass.assemble(code);

		SandBox s = new SandBox();
		s.runClass(aClass);
		List<String> output = s.getOutput();

		assertArrayEquals(new String[] {
				"Hello World!"
		}, output.toArray());
	}

	@Test
	void syntaxErrorsAreFound() throws Exception {
		Compiler c = new Compiler();
		JasminBytecode code = c.compileString("dfsgkjs;", "HelloWorld");
		assertNull(code);
	}
}
