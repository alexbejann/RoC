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
     */
    @Test
    public void printIfFromMethod() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   numar a<-2\n" +
                            "   numar b<-2*3\n" +
                            "   daca(b > 3)\n" +
                            "   {\n" +
                            "       printeaza(b)\n" +
                            "       printeaza(a)\n" +
                            "   }\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"printIfHello");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "6","2"
        }, output.toArray());

    }

    /**
     * Expected error because trying to access variable from another block
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
}
