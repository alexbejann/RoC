package nl.saxion.cos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NegativeIntTest extends TestBase
{
    @Test
    public void negativeNumberPrint() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a <- $2\n" +
                "   printeaza(a)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"nestedIfLvL1");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "-2"
        }, output.toArray());

    }

    @Test
    public void negativeNumberMUL() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a <- $2\n" +
                "   printeaza(a*2)\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"nestedIfLvL1");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "-4"
        }, output.toArray());

    }

    @Test
    public void negativeNumberDIV() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a <- $2\n" +
                "   daca(a*2 < 2)\n" +
                "   {" +
                "       printeaza(a/2)\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"nestedIfLvL1");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "-1"
        }, output.toArray());

    }


    @Test
    public void negativeNumberMODULO() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a <- $2\n" +
                "   daca(a*2 < 2)\n" +
                "   {" +
                "       printeaza(a%2)\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"nestedIfLvL1");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "0"
        }, output.toArray());

    }

    @Test
    public void negativeNumberBoolEXPR() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   bool a <- $2 > $5 && $10*10 > 10\n" +
                "   daca(a = ADEVARAT)\n" +
                "   {" +
                "       printeaza(30*($10))\n" +
                "   }" +
                "   altfel daca\n" +
                "   {\n" +
                "       printeaza(10*$10)\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"nestedIfLvL1");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "-100"
        }, output.toArray());

    }
}
