package CodeTestCoverJava;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
       //  assertTrue(Soundex.generateSoundex("")=="");
    }

    @Test
    public void testSingleCharacter() {
         //assertTrue(Soundex.generateSoundex("A")=="A000");
    }

    
    @Test
    public void ExpectZeroForEmptyInput()
    {
        int expectedResult = 0;
        String input = "";
        StringCalculator objUnderTest = new StringCalculator();
        int result = objUnderTest.add(input);

       assertTrue(expectedResult==result);
    }

  @Test
    public void ExpectZeroForSingleZero()
    {
        int expectedResult = 0;
        String input = "0";
        StringCalculator objUnderTest = new StringCalculator();
        int result = objUnderTest.Add(input);
        assertTrue(expectedResult==result);

    }

   @Test
    public void ExpectSumForTwoNumbers()
    {
        int expectedResult = 3;
        String input = "1,2";
        StringCalculator objUnderTest = new StringCalculator();
        int result = objUnderTest.Add(input);
        assertTrue(expectedResult==result);
    }

   @Test
    public void ExpectSumWithNewlineDelimiter()
    {
        int expectedResult = 6;
        String input = "1\n2,3";
        StringCalculator objUnderTest = new StringCalculator();
        int result = objUnderTest.Add(input);
        assertTrue(expectedResult==result);
    }

 
    @Test
    public void ignoreNumbersGreaterThan1000() {
        int expectedResult = 1;
        String input = "1,1001";
        StringCalculator objUnderTest = new StringCalculator();
        int result = objUnderTest.Add(input);

        assertTrue(expectedResult==result);
    }
    @Test
    public void ExpectSumWithCustomDelimiter()
    {
        int expectedResult = 3;
        String input = "//;\n1;2";
        StringCalculator objUnderTest = new StringCalculator();
        int result = objUnderTest.Add(input);

       assertTrue(expectedResult==result);
    }
}
