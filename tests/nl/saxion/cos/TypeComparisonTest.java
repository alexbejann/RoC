package nl.saxion.cos;

import nl.saxion.cos.exceptions.CompilerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TypeComparisonTest extends TestBase
{
    /**
     * Test logical and
     */
    @Test
    public void stringComparison() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   sdc a<-\"alex\"\n" +
                            "   daca(a = \"alex\")" +
                            "   {\n" +
                            "       printeaza(a)\n" +
                            "   }\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"test");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "alex"
        }, output.toArray());
    }

    /**
     * Integer test
     */
    @Test
    public void integerComparison() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   automat a<-12" +
                            "   daca(a = 12)" +
                            "   {\n" +
                            "       printeaza(a)\n" +
                            "   }\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"integer");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "12"
        }, output.toArray());
    }

    /**
     * Mismatch test
     */
    @Test
    public void typeMismatchComparison() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   automat a<-12" +
                            "   daca(a > \"alex\")" +
                            "   {\n" +
                            "       printeaza(a)\n" +
                            "   }\n" +
                            "}";

        Compiler c = new Compiler();
        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"mismatchType");
        });
        String expectedMessage = "You can't compare NUMAR with SDC";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
