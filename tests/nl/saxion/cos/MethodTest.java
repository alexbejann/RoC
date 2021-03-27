package nl.saxion.cos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
     *
     */
    @Test
    public void printIfFromMethod() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   numar a<-3\n" +
                            "   numar b<-3*2\n" +
                            "   daca(a < b)\n" +
                            "   {\n" +
                            "       printeaza(b)\n" +
                            "   }\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"printIfHello");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "6"
        }, output.toArray());

    }
}
