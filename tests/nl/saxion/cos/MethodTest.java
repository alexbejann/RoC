package nl.saxion.cos;

import nl.saxion.cos.exceptions.CompilerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MethodTest extends TestBase
{

    /**
     *
     */
    @Test
    public void printHelloFromMethod() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   sdc hello<-\"Hello\"\n" +
                            "   printeaza(hello)\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"printHello");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "Hello"
        }, output.toArray());

    }

    /**
     * Expected to b and a to be printed in the console
     * Also for testing the scope
     */
    @Test
    public void printIfFromMethod() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   numar a<-2\n" +
                            "   numar b<-2*3\n" +
                            "   numar c<-2*a\n" +
                            "   daca(b > 3)\n" +
                            "   {\n" +
                            "       printeaza(b)\n" +
                            "       printeaza(a)\n" +
                            "       printeaza(c)\n" +
                            "   }\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"printIfHello");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "6","2","4"
        }, output.toArray());

    }

    /**
     * Tests everything from the {@link CodeGenerator#visitComparator(RoCParser.ComparatorContext)}
     */
    @Test
    public void comparator() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a<-2\n" +
                "   numar b<-5\n" +
                "   daca(b > 3)\n" +
                "   {\n" +
                "       printeaza(\"b>3\")\n" +
                "   }\n" +
                "   daca(b < 6)\n" +
                "   {\n" +
                "       printeaza(\"b<6\")\n" +
                "   }\n" +
                "   daca(b <= 5)\n" +
                "   {\n" +
                "       printeaza(\"b<=5\")\n" +
                "   }\n" +
                "   daca(b >= 3)\n" +
                "   {\n" +
                "       printeaza(\"b>=3\")\n" +
                "   }\n" +
                "   daca(b = 5)\n" +
                "   {\n" +
                "       printeaza(\"b=5\")\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"printIfHello");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "b>3","b<6","b<=5","b>=3","b=5"
        }, output.toArray());

    }

    /**
     * Expected error because trying to access variable from another block
     * For scope testing
     */
    @Test
    public void printFromAnotherBlock() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a<-2\n" +
                "   numar b<-2*3\n" +
                "   daca(b > 3)\n" +
                "   {\n" +
                "       numar c<-2\n" +
                "       printeaza(b)\n" +
                "       printeaza(a)\n" +
                "   }\n" +
                "   printeaza(c)\n" +
                "}";

        Compiler c = new Compiler();

        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"printFromAnotherBlock");
        });
        String expectedMessage = "Variable c not defined";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    /**
     * Test if statement
     */
    @Test
    public void decisionStatementsIf() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar b<-2*3\n" +
                "   daca(b > 3)\n" +
                "   {\n" +
                "       printeaza(b)\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"decisionStatementsIf");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "6"
        }, output.toArray());

    }

    /**
     * Test else statement
     */
    @Test
    public void decisionStatementsElse() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   numar b<-2\n" +
                            "   daca(b < 3)\n" +
                            "   {\n" +
                            "       printeaza(b)\n" +
                            "   }\n" +
                            "   altfel daca\n" +
                            "   {\n" +
                            "       numar c<-2\n" +
                            "       printeaza(c)\n" +
                            "   }\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"decisionStatementsIfElseIfElse");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "2"
        }, output.toArray());

    }

    /**
     * Test else if statement
     */
    @Test
    public void decisionStatementsElseIf() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar b<-10\n" +
                "   daca(b < 1)\n" +
                "   {\n" +
                "       printeaza(b)\n" +
                "   }\n" +
                "   altfel daca\n" +
                "   {\n" +
                "       numar c<-2\n" +
                "       printeaza(c)\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"decisionStatementsIfElseIfElse");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "2"
        }, output.toArray());

    }

    /**
     * Test method call
     */
    @Test
    public void declareMethodVoid() throws IOException, AssembleException
    {
        String codeString = "functia foo2(numar a, sdc s, bool b)" +
                            "{\n" +
                            "   printeaza(2)\n" +
                            "}\n" +
                            "functia main()" +
                            "{\n" +
                            "   foo2(2, \"Alex\", FALS)\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"Test");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "2"
        }, output.toArray());

    }

    /**
     * Test method call
     */
    @Test
    public void useParameterDeclaredMethodVoid() throws IOException, AssembleException
    {
        String codeString = "functia foo2(numar a, sdc s, bool b)" +
                "{\n" +
                "   printeaza(a)\n" +
                "   printeaza(s)\n" +
                "   printeaza(b)\n" +
                "}\n" +
                "functia main()" +
                "{\n" +
                "   foo2(2, \"Alex\", FALS)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"Test");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "2","Alex","false"
        }, output.toArray());

    }

    /**
     * Test method call
     */
    @Test
    public void returnIntegerMethod() throws IOException, AssembleException
    {
        String codeString = "functia foo2(numar a, sdc s, bool b) returneaza numar" +
                            "{\n" +
                            "   numar b<-2+a" +
                            "   returneaza b" +
                            "}\n" +
                            "functia main()" +
                            "{\n" +
                            "   numar a<-foo2(2, \"Alex\", FALS)\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"Test");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "4"
        }, output.toArray());

    }

    /**
     * Test method call
     */
    @Test
    public void returnStringMethod() throws IOException, AssembleException
    {
        String codeString = "functia foo2(numar a, sdc s, bool b) returneaza sdc" +
                "{\n" +
                "   numar b<-2+a" +
                "   returneaza s" +
                "}\n" +
                "functia main()" +
                "{\n" +
                "   automat a<-foo2(2, \"Alex\", FALS)\n" +
                "   printeaza(a)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"Test");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "Alex"
        }, output.toArray());

    }

    /**
     * Test method call
     */
    @Test
    public void returnBooleanMethod() throws IOException, AssembleException
    {
        String codeString = "functia foo2(numar a, sdc s, bool b) returneaza bool" +
                "{\n" +
                "   automat b<-ADEVARAT" +
                "   returneaza b" +
                "}\n" +
                "functia main()" +
                "{\n" +
                "   automat a<-foo2(2, \"Alex\", FALS)\n" +
                "   printeaza(a)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"Test");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "true"
        }, output.toArray());

    }

    /**
     * Test method call
     */
    @Test
    public void errorNoReturnMethod() throws IOException, AssembleException
    {
        String codeString = "functia foo2(numar a, sdc s, bool b) returneaza numar" +
                            "{\n" +
                            "   numar b<-2+a" +
                            "}\n" +
                            "functia main()" +
                            "{\n" +
                            "   numar a<-foo2(2, \"Alex\", FALS)\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"mismatchType");
        });
        String expectedMessage = "The method should return: numar type!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Test method call
     */
    @Test
    public void errorReturnDifferentTypeMethod() throws IOException, AssembleException
    {
        String codeString = "functia foo2(numar a, sdc s, bool b) returneaza numar" +
                "{\n" +
                "   numar b<-2+a" +
                "   returneaza ADEVARAT" +
                "}\n" +
                "functia main()" +
                "{\n" +
                "   bool a<-foo2(2, \"Alex\", FALS)\n" +
                "   printeaza(a)\n" +
                "}";

        Compiler c = new Compiler();
        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"mismatchType");
        });
        String expectedMessage = "The method should return: numar type! Not BOOL";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Test method call
     */
    @Test
    public void errorNoReturnButReturnsMethod() throws IOException, AssembleException
    {
        String codeString = "functia foo2(numar a, sdc s, bool b)" +
                            "{\n" +
                            "   numar b<-2+a" +
                            "   returneaza b" +
                            "}\n" +
                            "functia main()" +
                            "{\n" +
                            "   numar a<-foo2(2, \"Alex\", FALS)\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"mismatchType");
        });
        String expectedMessage = "You can't return in a void method!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


    /**
     * Test method call
     */
    @Test
    public void expressionCallMethod() throws IOException, AssembleException
    {
        String codeString = "functia foo2(numar a) returneaza numar" +
                "{\n" +
                "   numar b<-2+a" +
                "   returneaza b" +
                "}\n" +
                "functia main()" +
                "{\n" +
                "   automat a<-foo2(2*3+1)\n" +
                "   printeaza(a)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"Test");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "9"
        }, output.toArray());

    }

    @Test
    public void callNonExistentMethod() throws IOException, AssembleException
    {
        String codeString = "functia main()" +
                            "{\n" +
                            "   automat a<-foo(2*3+1)\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"noExistingMethodCall");
        });
        String expectedMessage = "Method was not defined, or the parameters don't match!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    /**
     * Test method call
     */
    @Test
    public void expressionCallWithMultipleArgumentsMethod() throws IOException, AssembleException
    {
        String codeString = "functia foo2(numar a, sdc s, bool b) returneaza numar" +
                "{\n" +
                "   numar b<-2+a" +
                "   returneaza b" +
                "}\n" +
                "functia main()" +
                "{\n" +
                "   automat a<-foo2(2*3, \"Alex\", FALS)\n" +
                "   printeaza(a)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"Test");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "8"
        }, output.toArray());

    }

    /**
     * Test method call
     */
    @Test
    public void returnExpressionResultMethod() throws IOException, AssembleException
    {
        String codeString = "functia foo2(numar a, sdc s, bool b) returneaza numar" +
                "{\n" +
                "   returneaza 2+a" +
                "}\n" +
                "functia main()" +
                "{\n" +
                "   automat a<-foo2(2*3, \"Alex\", FALS)\n" +
                "   printeaza(a)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"Test");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "8"
        }, output.toArray());

    }
}
