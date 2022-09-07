import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void checkStringLength() {

        System.out.println("Hello String Length");
        int length = getStringLength("Hello");
        Assert.assertEquals(length, 5);
    }

    @Test
    public void verifyAdditionOfTwoNumbers() {

        System.out.println("Hello addition of two numbers");
        int result = new Calculator().addTwoNumbers(10, 20);
        Assert.assertEquals(result, 30);
    }

    @Test
    public void verifyMultiplicationOfTwoNumbers() {
        System.out.println("Hello multiplication of two numbers");
        int result = new Calculator().multiplyTwoNumbers(10, 5);
        Assert.assertEquals(result, 50);
    }

    @Test
    public void verifyDivisionofTwoNumbers() {

        System.out.println("Hello division of two numbers");
        int result = new Calculator().divisionOfNumbers(10, 5);
        Assert.assertEquals(result, 2);
    }

    private int getStringLength(String s) {
        return s.length();
    }

}
