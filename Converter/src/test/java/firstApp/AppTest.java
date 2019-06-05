package firstApp;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    /** TESTOWANIE METOD Z KILOGRAMS **/
    @Test
    public void shouldAnswerWithTrueKgToLb()
    {
        Kilograms kilograms = new Kilograms(5);
        TestCase.assertEquals(11.0231131,kilograms.kilogramsToPounds());
    }
    @Test
    public void shouldAnswerWithFalseKgToLb()
    {
        Kilograms kilograms = new Kilograms(5);
        TestCase.assertEquals(11.0231121,kilograms.kilogramsToPounds());
    }
    @Test
    public void shouldAnswerWithTrueKgToOz()
    {
        Kilograms kilograms = new Kilograms(5);
        TestCase.assertEquals(176.36980950000003,kilograms.kilogramsToOunces());
    }
    @Test
    public void shouldAnswerWithFalseKgToOz()
    {
        Kilograms kilograms = new Kilograms(5);
        TestCase.assertEquals(176.36912950000003,kilograms.kilogramsToOunces());
    }
    /** TESTOWANIE METOD Z OUNCES **/
    @Test
    public void shouldAnswerWithTrueOzToKg()
    {
        Ounces ounces = new Ounces(2);
        TestCase.assertEquals(0.0566990462,ounces.ouncesToKilograms());
    }
    @Test
    public void shouldAnswerWithFalseOzToKg()
    {
        Ounces ounces = new Ounces(2);
        TestCase.assertEquals(0.0566990412,ounces.ouncesToKilograms());
    }
    @Test
    public void shouldAnswerWithTrueOzToLb()
    {
        Ounces ounces = new Ounces(2);
        TestCase.assertEquals(0.125
                ,ounces.ouncesToPounds());
    }
    @Test
    public void shouldAnswerWithFalseOzToLb()
    {
        Ounces ounces = new Ounces(2);
        TestCase.assertEquals(0.135
                ,ounces.ouncesToPounds());
    }
    /** TESTOWANIE METOD Z POUNDS **/
    @Test
    public void shouldAnswerWithTrueLbToKg()
    {
        Pounds pounds = new Pounds(7);
        TestCase.assertEquals(3.17514659
        ,pounds.poundsToKilograms());
    }
    @Test
    public void shouldAnswerWithFalseLbToKg()
    {
        Pounds pounds = new Pounds(7);
        TestCase.assertEquals(3.17114659
                ,pounds.poundsToKilograms());
    }
    @Test
    public void shouldAnswerWithTrueLbToOz()
    {
        Pounds pounds = new Pounds(7);
        TestCase.assertEquals(112.0,pounds.poundsToOunces());
    }
    @Test
    public void shouldAnswerWithFalseLbToOz()
    {
        Pounds pounds = new Pounds(7);
        TestCase.assertEquals(111,pounds.poundsToOunces());
    }


}
