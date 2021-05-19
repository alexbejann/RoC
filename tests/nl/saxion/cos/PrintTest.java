package nl.saxion.cos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrintTest extends TestBase
{
    /**
     * Test while loop
     */
    @Test
    public void whileLoop() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   printeaza(2*3)\n" +
                "   printeaza(3 + 5 * 6 / (5 * 2) -6)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"printExpression");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "6","0"
        }, output.toArray());

    }
}
