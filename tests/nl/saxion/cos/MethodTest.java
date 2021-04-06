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
     * Tests everything from the {@link CodeGenerator#visitComparator(RoCParser.ComparatorContext)}
     * todo implement the logical operators and uncomment this
     */
    /*@Test
    public void visitLogicalExpressionAndOr() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a<-2\n" +
                "   numar b<-5\n" +
                "   daca(b > 3 && a=2)\n" +
                "   {\n" +
                "       printeaza(\"b>3\")\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"visitLogicalExpressionAndOr");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "b>3"
        }, output.toArray());

    }*/

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
                "   daca nu(b = 10)\n" +
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
                "10"
        }, output.toArray());

    }

    /**
     * Test method call
     */
    @Test
    public void declareMethod() throws IOException, AssembleException
    {
        String codeString = "functia main()" +
                            "{\n" +
                            "   foo()\n" +
                            "}" +
                            "functia foo()" +
                            "{\n" +
                            "   numar a<- 2\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"Test");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "2"
        }, output.toArray());

    }
}
