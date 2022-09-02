package shop;

import fruits.Apple;
import fruits.Bowl;
import fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<Product> productList;

    public Shop(){
        productList = new ArrayList<>();
    }

    public void addProduct(Product... productsToAdd){
        for(Product product : productsToAdd){

            productList.add(product);
        }
    }

    public int getProductCount() {
        return productList.size();
    }

    public Shop getAllProductsHasGST(){


            Shop productsWithGSt = new Shop();

            for(Product product: productList){
                if(product.getHasGSTForProduct()){
                    productsWithGSt.addProduct(product);
                }
            }
            return productsWithGSt;

    }

    public Shop getAllProductsHasGSTWithMRPMoreThanTwoThousand(){


        Shop productsWithGSt = new Shop();

        for(Product product: productList){
            if(product.getHasGSTForProduct() && (product.getproductMRP() > 2000)){
                productsWithGSt.addProduct(product);
            }
        }
        return productsWithGSt;

    }
}
