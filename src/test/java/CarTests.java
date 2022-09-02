import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTests {


    @Test
    public void VerifyIsCarStarted() {
        boolean isCarStarted = new Car().startCar();
        Assert.assertTrue(isCarStarted, "Car is started!!");
    }
}
