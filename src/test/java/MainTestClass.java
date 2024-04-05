import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTestClass
{
    @Test
    public void testConverterOne()
    {
        ConverterTwo test = new ConverterTwo();
        int i = 1;
        String romanNumeral = test.use(i);
        Assertions.assertEquals("I",romanNumeral);
    }

    @Test
    public void testConverterTwo()
    {
        ConverterTwo test = new ConverterTwo();
        int i = 2;
        String romanNumeral = test.use(i);
        Assertions.assertEquals("II",romanNumeral);
    }

    @Test
    public void testConverterThree()
    {
        ConverterTwo test = new ConverterTwo();
        int i = 3;
        String romanNumeral = test.use(i);
        Assertions.assertEquals("III",romanNumeral);
    }

    @Test
    public void testConverterFive()
    {
        ConverterTwo test = new ConverterTwo();
        int i = 5;
        String romanNumeral = test.use(i);
        Assertions.assertEquals("V",romanNumeral);
    }

    @Test
    public void testConverterSix()
    {
        ConverterTwo test = new ConverterTwo();
        int i = 6;
        String romanNumeral = test.use(i);
        Assertions.assertEquals("VI",romanNumeral);
    }

    @Test
    public void testConverterTen()
    {
        ConverterTwo test = new ConverterTwo();
        int i = 10;
        String romanNumeral = test.use(i);
        Assertions.assertEquals("X",romanNumeral);
    }


    @Test
    public void testConverterFour()
    {
        ConverterTwo test = new ConverterTwo();
        int i = 4;
        String romanNumeral = test.use(i);
        Assertions.assertEquals("IV",romanNumeral);
    }

    @Test
    public void testTwoNineNineNine()
    {
        ConverterTwo test = new ConverterTwo();
        String output=test.use(2999);
        Assertions.assertEquals("MMCMXCIX",output);
    }

    @Test
    public void testNineNineNine()
    {
        ConverterTwo test = new ConverterTwo();
        String output=test.use(999);
        Assertions.assertEquals("CMXCIX",output);
    }

    @Test
    public void testNineNine()
    {
        ConverterTwo test = new ConverterTwo();
        String output=test.use(99);
        Assertions.assertEquals("XCIX",output);
    }


}
