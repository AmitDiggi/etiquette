package shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Product> productList;

    public Shop() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product... productsToAdd) {
        for (Product product : productsToAdd) {

            productList.add(product);
        }
    }

    public int getProductCount() {
        return productList.size();
    }

    public List<Product> getAllProductsHasGST() {

        List<Product> productsWithGSt = new ArrayList<>();
        for (Product product : productList) {
            if (product.getHasGSTForProduct()) {
                productsWithGSt.add(product);
            }
        }
        return productsWithGSt;

    }

    public List<Product> getAllProductsHasGSTWithMRPMoreThanTwoThousand() {


        List<Product> productsWithGSt = new ArrayList<>();

        for (Product product : productList) {
            if (product.getHasGSTForProduct() && (product.getProductMRP() > 2000)) {
                productsWithGSt.add(product);
            }
        }
        return productsWithGSt;

    }
}
