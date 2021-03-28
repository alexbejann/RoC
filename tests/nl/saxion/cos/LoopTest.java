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
    public void forLoopWithIfStatement() throws IOException, AssembleException
    {
        /*String codeString = "functia main()\n" +
                            "{\n" +
                            "   numar a<-2*3\n" +
                            "   a<-a+1\n" +
                            "   cat timp(a < 10) executa\n" +
                            "   {\n" +
                            "       a<-a+1\n" +
                            "       daca(a > 8)\n" +
                            "       {\n" +
                            "           printeaza(a)\n" +
                            "       }\n" +
                            "   }\n" +
                            "}";*/
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   numar a<-3\n" +
                            "   a<-a+1\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"decisionStatementsIf");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "4"
        }, output.toArray());

    }
}
