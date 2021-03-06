package nl.saxion.cos;

import nl.saxion.cos.exceptions.CompilerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    /*
     * Expected same output to be the same
     */
    @Test
    public void expressionConcatenationTest() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                " sdc a<- \"hello\" +2" +
                " printeaza(a)" +
                "}";

        Compiler c = new Compiler();

        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"expressionConcatenationTest");
        });
        String expectedMessage = "Unsupported operation: \"hello\"+2";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    /*
     * Expected same output to be the same
     */
    @Test
    public void expressionBooleanTest() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                " bool a<- 1 > 2 || 4 < 5" +
                " printeaza(a)" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"expressionBooleanTest");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "true"
        }, output.toArray());
    }

    @Test
    public void assignNumarToSCURTTest() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                " scurt a<- 10" +
                " printeaza(a)" +
                "}";
        Compiler c = new Compiler();

        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"expressionConcatenationTest");
        });
        String expectedMessage = "Type mismatch expected short! scurt can hold numbers from 0 to 9, negatives as well.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void assignSCURTToNUMARTest() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                " scurt b<- 3" +
                " numar a<- b + $20" +
                " printeaza(a)" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"expressionBooleanTest");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "-17"
        }, output.toArray());
    }

    @Test
    public void expressionBooleanIDENTIFIERTest() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                " numar b<- 3" +
                " bool a<- b > 2" +
                " printeaza(a)" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"expressionBooleanTest");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "true"
        }, output.toArray());
    }

    @Test
    public void expressionBooleanIDENTIFIERWithAndTest() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                " numar b<- 3" +
                " bool a<- b > 2 && b*2 = 6" +
                " printeaza(a)" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"expressionBooleanTest");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "true"
        }, output.toArray());
    }

    @Test
    public void expressionBooleanIDENTIFIERWithORTest() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                " numar b<- 3" +
                " numar c<- 200" +
                " bool a<- 4+b < b - 100 || c = 200" +
                " printeaza(a)" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"expressionBooleanTest");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "true"
        }, output.toArray());
    }


}
