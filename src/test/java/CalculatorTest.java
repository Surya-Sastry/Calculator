import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
    private Main calculator;

    @Before
    public void setup()
    {
        calculator = new Main();
    }

    @Test
    public void test_add_positive()
    {
        double a = 1;
        double b = 2;
        double expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.add(a, b), 0.001);
    }
    
    @Test
    public void test_add_negative()
    {
        double a = 1;
        double b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b), 0.001);
    }

    @Test
    public void test_sub_positiive()
    {
        double a = 1;
        double b = 2;
        double expectedResult = -1;
        Assert.assertEquals(expectedResult, calculator.sub(a, b), 0.001);
    }

    @Test
    public void test_sub_negative()
    {
        double a = 1;
        double b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.sub(a, b), 0.001);
    }

    @Test
    public void test_mul_positive()
    {
        double a = 1;
        double b = 2;
        double expectedResult = 2;
        Assert.assertEquals(expectedResult, calculator.mul(a, b), 0.001);
    }

    @Test
    public void test_mul_negative()
    {
        double a = 1;
        double b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.mul(a, b), 0.001);
    }

    @Test
    public void test_div_positive()
    {
        double a = 16;
        double b = 2;
        double expectedResult = 8;
        Assert.assertEquals(expectedResult, calculator.div(a, b), 0.001);
    }

    @Test
    public void test_div_negative()
    {
        double a = 16;
        double b = 2;
        double expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.div(a, b), 0.001);
    }
}
