import fruits.Apple;
import fruits.Banana;
import fruits.Bowl;
import fruits.Orange;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FruitBowlTests {

    public FruitBowlTests() {

    }


    @Test
    public void verifyNumberOfFruitsInBowl() {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();
        Bowl mixedFruitBowl = new Bowl();
        mixedFruitBowl.addFruit(apple1, apple2, orange1, orange2, banana1, banana2);

        Assert.assertEquals(mixedFruitBowl.getNumberOfFruitsInBowl(), 6);

    }


    @Test
    public void verifyNumberOfApplesInBowl() {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();

        Bowl mixedFruitBowl = new Bowl();
        mixedFruitBowl.addFruit(apple1, apple2, orange1, orange2, banana1, banana2);


        Bowl bowlOfApples = mixedFruitBowl.getAllApplesInBowl();
        Assert.assertEquals(bowlOfApples.getNumberOfFruitsInBowl(), 2);
    }
}
