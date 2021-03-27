package nl.saxion.cos;

import nl.saxion.cos.exceptions.CompilerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CodeGeneratorTest extends TestBase
{

    /*
     * Expected same output to be the same
     */
    @Test
    public void printNumbersAndString() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{" +
                            "   printeaza(345)\n" +
                            "   printeaza(\"helloWorld\")\n" +
                            "   printeaza(ADEVARAT)\n" +
                            "   printeaza(FALS)\n" +
                            "   printeaza(3)\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"printNumbersAndString");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "345","helloWorld", "true","false","3"
        }, output.toArray());

    }

    /**
     * Expected a CompilerException because a was not defined
     */
    @Test
    public void printUndeclaredNumber()
    {
        String codeString = "functia main()" +
                            "{" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"printNumberDeclared");
        });
        String expectedMessage = "Variable a not defined";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    /**
     * Expected a CompilerException because a was already defined
     */
    @Test
    public void alreadyDeclaredVar()
    {
        String codeString = "functia main()" +
                            "{\n" +
                            "   numar a<-3\n" +
                            "   numar a<-2\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"alreadyDeclaredVar");
        });
        String expectedMessage = "Variable a already defined!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    /**
     * Expected a CompilerException because a was already defined
     */
    @Test
    public void alreadyDeclaredVarBool()
    {
        String codeString = "functia main()" +
                            "{\n" +
                            "   bool a<-ADEVARAT\n" +
                            "   bool a<-FALS\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"alreadyDeclaredVarBool");
        });
        String expectedMessage = "Variable a already defined!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    /**
     * Expected a CompilerException because was expected numar(number) not sdc(string)
     */
    @Test
    public void mismatchType()
    {
        String codeString = "functia main()\n" +
                            "{" +
                            "   numar a<-\"hello\"\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"mismatchType");
        });
        String expectedMessage = "Type mismatch expected numar!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    /**
     * Expected a CompilerException because was expected bool(boolean) not sdc(string)
     */
    @Test
    public void mismatchTypeBool()
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   bool a<-\"hello\"\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"mismatchTypeBool");
        });
        String expectedMessage = "Type mismatch expected bool!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    /**
     * Expected a CompilerException because was expected sdc(string) not numar(number)
     */
    @Test
    public void mismatchTypeSDC()
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   sdc a<-12\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        CompilerException exception = assertThrows(CompilerException.class, () -> {
            c.compileString(codeString,"mismatchTypeSDC");
        });
        String expectedMessage = "Type mismatch expected sdc!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    /**
     * Expected a CompilerException because a was already defined
     */
    @Test
    public void alreadyDeclaredAuto() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   automat a<-3\n" +
                            "   automat b<-\"hello\"\n" +
                            "   automat c<-FALS\n" +
                            "   automat d<-ADEVARAT\n" +
                            "   sdc e<-\"sdc\"\n" +
                            "   printeaza(a)\n" +
                            "   printeaza(b)\n" +
                            "   printeaza(c)\n" +
                            "   printeaza(d)\n" +
                            "   printeaza(e)" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"alreadyDeclaredAuto");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "3","hello","false", "true", "sdc"
        }, output.toArray());
    }

    /**
     * Expected 2 because a was defined as 2 and it will print 2 in the console
     */
    @Test
    public void printNumberDeclared() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   numar a<-2\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"printNumberDeclared");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "2"
        }, output.toArray());

    }

    /**
     * Expected 2 because a was defined as 2 and it will print 2 in the console
     */
    @Test
    public void printNumberCalculated() throws IOException, AssembleException
    {
        String codeString = "functia main()\n" +
                            "{\n" +
                            "   numar c<-6%3\n" +
                            "   numar b<-2*3\n" +
                            "   numar a<-2+2\n" +
                            "   numar d<-6/2\n" +
                            "   numar f<-10-2\n" +
                            "   automat e<-6-2\n" +
                            "   printeaza(f)\n" +
                            "   printeaza(e)\n" +
                            "   printeaza(d)\n" +
                            "   printeaza(c)\n" +
                            "   printeaza(b)\n" +
                            "   printeaza(a)\n" +
                            "}";

        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(codeString,"printNumberCalculated");
        Assertions.assertNotNull(code);

        List<String> output = runCode(code);

        assertArrayEquals(new String[] {
                "8","4","3","0","6","4"
        }, output.toArray());

    }


}
