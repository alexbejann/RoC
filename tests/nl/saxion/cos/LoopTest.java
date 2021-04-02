package nl.saxion.cos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LoopTest extends TestBase
{

    /**
     * Test while loop
     */
    @Test
    public void whileLoop() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   numar a<-2*3\n" +
                            "   a<-a+1\n" +
                            "   cat timp(a < 10) executa\n" +
                            "   {\n" +
                            "       a<-a+1\n" +
                            "   }\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"forLoopWithIfStatement");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "10"
        }, output.toArray());

    }

    /**
     * Test do while loop
     */
    @Test
    public void doWhileLoop() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a<-2*3\n" +
                "   a<-a+1\n" +
                "   executa {\n" +
                "       a<-a+1\n" +
                "   }cat timp(a < 10)\n" +
                "   printeaza(a)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"doWhileLoop");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "10"
        }, output.toArray());

    }

    /**
     * Test do while and while together
     */
    @Test
    public void doWhileAndWhileTogetherLoop() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a<-2*3\n" +
                "   a<-a+1\n" +
                "   executa {\n" +
                "       a<-a+1\n" +
                "   }cat timp(a < 10)\n" +
                "   numar b<-5\n" +
                "   cat timp(b < 20) executa\n" +
                "   {\n" +
                "       b<-b+1\n" +
                "   }\n" +
                "   printeaza(a)\n" +
                "   printeaza(b)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"doWhileLoop");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "10","20"
        }, output.toArray());

    }
}
