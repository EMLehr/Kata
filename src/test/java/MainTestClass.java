import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTestClass
{
    @Test
    public void testConverterOne()
    {
        Converter test = new Converter();
        int i = 1;
        String romanNumeral = test.intToRoman(i);
        Assertions.assertEquals("I",romanNumeral);
    }

    @Test
    public void testConverterTwo()
    {
        Converter test = new Converter();
        int i = 2;
        String romanNumeral = test.intToRoman(i);
        Assertions.assertEquals("II",romanNumeral);
    }

    @Test
    public void testConverterThree()
    {
        Converter test = new Converter();
        int i = 3;
        String romanNumeral = test.intToRoman(i);
        Assertions.assertEquals("III",romanNumeral);
    }

    @Test
    public void testConverterFive()
    {
        Converter test = new Converter();
        int i = 5;
        String romanNumeral = test.intToRoman(i);
        Assertions.assertEquals("V",romanNumeral);
    }

    @Test
    public void testConverterSix()
    {
        Converter test = new Converter();
        int i = 6;
        String romanNumeral = test.intToRoman(i);
        Assertions.assertEquals("VI",romanNumeral);
    }

    @Test
    public void testConverterTen()
    {
        Converter test = new Converter();
        int i = 10;
        String romanNumeral = test.intToRoman(i);
        Assertions.assertEquals("X",romanNumeral);
    }


    @Test
    public void testConverterFour()
    {
        Converter test = new Converter();
        int i = 4;
        String romanNumeral = test.intToRoman(i);
        Assertions.assertEquals("IV",romanNumeral);
    }


}
