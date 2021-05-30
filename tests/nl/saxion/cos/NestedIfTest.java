package nl.saxion.cos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NestedIfTest extends TestBase
{

    @Test
    public void nestedIfStatementsLvL1() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   numar a <- 2\n" +
                            "   daca (a > 1)\n" +
                            "   {\n" +
                            "       daca(a = 1)\n" +
                            "       {" +
                            "           printeaza(\"equals to 1\")" +
                            "       }" +
                            "   }\n" +
                            "   daca(a*2 > 2)\n" +
                            "   {" +
                            "       printeaza(\"a*2=2\")\n" +
                            "   }\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"nestedIfLvL1");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "a*2=2"
        }, output.toArray());

    }

    @Test
    public void nestedIfStatementsLvL1Easy() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a <- 2\n" +
                "   daca (a < 5)\n" +
                "   {\n" +
                "       daca(a = 1)\n" +
                "       {\n" +
                "           printeaza(\"if nested\")\n" +
                "       }\n" +
                "       altfel daca\n" +
                "       {\n" +
                "           printeaza(\"else nested\")\n" +
                "       }\n" +
                "   }\n" +
                "   altfel daca\n" +
                "   {\n" +
                "       printeaza(\"else\")\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"nesteIfLvL1");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "else nested"
        }, output.toArray());

    }

    @Test
    public void normalIfStatementsEasy() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a <- 2\n" +
                "   daca (a > 1)\n" +
                "   {\n" +
                "       printeaza(\"equals to 1\")" +
                "   }\n" +
                "   daca(a*2 = 4)\n" +
                "   {" +
                "       printeaza(\"a*2=2\")\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"nesteIfLvL1");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "equals to 1", "a*2=2"
        }, output.toArray());

    }

    @Test
    public void ifStatementsVeryNested() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a <- 2\n" +
                "   daca (a > 1)\n" +
                "   {\n" +
                "       daca(a*2 > 2)\n" +
                "       {" +
                "           daca(a*2 < 6)\n" +
                "           {" +
                "               printeaza(\"nested very nested\")\n" +
                "           }\n" +
                "       }\n" +
                "   }\n" +
                "   daca(a*2 = 4)\n" +
                "   {" +
                "       printeaza(\"a*2=2\")\n" +
                "   }\n" +
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"nesteIfLvL1");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "nested very nested", "a*2=2"
        }, output.toArray());

    }

    @Test
    public void ifNested() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                "{\n" +
                "   numar a <- 2\n" +
                "   daca (a > 1)\n" +// L1
                "   {\n" +
                "       daca(a*2 = 4)\n" +// L1
                "       {" +
                "           printeaza(\"a*2=2\")\n" +
                "        }\n" +
                "   }\n" +// L1
                "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"nesteIfLvL1");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "a*2=2"
        }, output.toArray());

    }

}
