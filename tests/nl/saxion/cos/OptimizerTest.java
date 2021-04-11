package nl.saxion.cos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OptimizerTest extends TestBase
{
    /**
     * Test if statement
     */
    @Test
    public void addOptimizer() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar b<-2+3\n" +
                "   daca(b > 3)\n" +
                "   {\n" +
                "       printeaza(b)\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString, "decisionStatementsIf");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[]{
                "5"
        }, output.toArray());
    }

    /**
     * Test if statement
     */
    @Test
    public void subOptimizer() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar b<-8-3\n" +
                "   daca(b > 3)\n" +
                "   {\n" +
                "       printeaza(b)\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString, "decisionStatementsIf");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[]{
                "5"
        }, output.toArray());
    }
}
