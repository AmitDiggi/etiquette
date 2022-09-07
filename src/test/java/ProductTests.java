import org.testng.Assert;
import org.testng.annotations.Test;
import shop.Product;
import shop.Shop;

import java.util.List;

public class ProductTests {

    @Test
    public void verifyProductsCount() {

        Product bag = new Product("Laptop Bag", "Bags", "Nice Bag, Water Proof, etc.", false, 2000, 0);
        Product dellLaptop = new Product("Dell Laptop", "Laptops", "Nice Laptop, 8GB RAM, etc.", true, 62000, 18);
        Product macbookAir = new Product("Macbook Air", "Laptops", "Nice Laptop, 16GB RAM, etc.", true, 120000, 18);
        Product stove = new Product("Stove", "Kitchen Utensils", "Nice Stove,reliable, etc.", true, 1000, 18);
        Product tShirt = new Product("T-Shirt", "Apparels", "Nice shirt, Water Proof, etc.", false, 1000, 0);
        Product drillingMachine = new Product("Drilling machine", "Electronics", "Reliable, Water Proof, etc.", true, 2000, 12);

        Shop products = new Shop();
        products.addProduct(bag, dellLaptop, macbookAir, stove, tShirt, drillingMachine);
        Assert.assertEquals(products.getProductCount(), 6);


    }


    @Test
    public void verifyProductsWithGSTCount() {

        Product bag = new Product("Laptop Bag", "Bags", "Nice Bag, Water Proof, etc.", false, 2000, 0);
        Product dellLaptop = new Product("Dell Laptop", "Laptops", "Nice Laptop, 8GB RAM, etc.", true, 62000, 18);
        Product macbookAir = new Product("Macbook Air", "Laptops", "Nice Laptop, 16GB RAM, etc.", true, 120000, 18);
        Product stove = new Product("Stove", "Kitchen Utensils", "Nice Stove,reliable, etc.", true, 1000, 18);
        Product tShirt = new Product("T-Shirt", "Apparels", "Nice shirt, Water Proof, etc.", false, 1000, 0);
        Product drillingMachine = new Product("Drilling machine", "Electronics", "Reliable, Water Proof, etc.", true, 2000, 12);

        Shop products = new Shop();
        products.addProduct(bag, dellLaptop, macbookAir, stove, tShirt, drillingMachine);

        List<Product> productWithGST = products.getAllProductsHasGST();
        Assert.assertEquals(productWithGST.size(), 4);

    }

    @Test
    public void verifyProductsWithGSTANDWithMRPMoreThanTwoThousand() {

        Product bag = new Product("Laptop Bag", "Bags", "Nice Bag, Water Proof, etc.", false, 2000, 0);
        Product dellLaptop = new Product("Dell Laptop", "Laptops", "Nice Laptop, 8GB RAM, etc.", true, 62000, 18);
        Product macbookAir = new Product("Macbook Air", "Laptops", "Nice Laptop, 16GB RAM, etc.", true, 120000, 18);
        Product stove = new Product("Stove", "Kitchen Utensils", "Nice Stove,reliable, etc.", true, 1000, 18);
        Product tShirt = new Product("T-Shirt", "Apparels", "Nice shirt, Water Proof, etc.", false, 1000, 0);
        Product drillingMachine = new Product("Drilling machine", "Electronics", "Reliable, Water Proof, etc.", true, 2000, 12);

        Shop products = new Shop();
        products.addProduct(bag, dellLaptop, macbookAir, stove, tShirt, drillingMachine);

        List<Product> productWithGST = products.getAllProductsHasGSTWithMRPMoreThanTwoThousand();
        Assert.assertEquals(productWithGST.size(), 3);

    }
}
