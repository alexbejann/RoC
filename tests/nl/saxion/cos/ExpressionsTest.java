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
                            " printeaza(a)" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"expressionTest");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "4"
        }, output.toArray());

    }
}
