package nl.saxion.cos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    @Test
    public void printExpressionFileOutputCheck() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   printeaza(2*3)\n" +
                "   printeaza(3 + 5 * 6 / (5 * 2) -6)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"printExpression");
        Assertions.assertNotNull(code);

        // Check that the bytecode matches what we expect
        List<String> expectedOutput = Files.readAllLines(Paths.get("testFiles/printExpression.expected_j"));
        assertArrayEquals(expectedOutput.toArray(), code.getLines().toArray());
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
