package nl.saxion.cos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ExpressionsTest extends TestBase
{

    /*
     * Expected same output to be the same
     */
    @Test
    public void expressionTest() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            " numar a<-(1+1)*2 " +
                            " numar b<- 1 + 2 - 2 * (7-2) " +
                            " printeaza(a)" +
                            " printeaza(b)" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"expressionTest");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "4", "-7"
        }, output.toArray());

    }

    /*
     * Expected same output to be the same
     */
    @Test
    public void expressionParenTest() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                " numar a<-3 + 5 * 6 / (5 * 2) -6" +
                " printeaza(a)" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"expressionParenTest");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "0"
        }, output.toArray());

    }


}
