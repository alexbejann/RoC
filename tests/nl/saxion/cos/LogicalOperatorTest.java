package nl.saxion.cos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LogicalOperatorTest extends TestBase
{

    /**
     * Test logical and
     */
    @Test
    public void logicalAnd() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   numar a<-2*3\n" +
                            "   a<-a+1\n" +
                            "   daca(a > 1 && a < 100 && a*2 > 5)" +
                            "   {\n" +
                            "       printeaza(a)\n" +
                            "   }\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"logicalAnd");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "7"
        }, output.toArray());
    }

    /**
     * Test logical and
     */
    @Test
    public void logicalOr() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a<-7\n" +
                "   daca(a > 10 || a = 7)" +
                "   {\n" +
                "       printeaza(a)\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"logicalOr");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "7"
        }, output.toArray());
    }
}
