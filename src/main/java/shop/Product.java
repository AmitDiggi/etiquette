package shop;

import java.util.List;

public class Product {

    private String productName;
    private String productCategory;
    private String productDescription;
    private boolean hasGST;
    private int basePrice;
    private int GST;
    private int MRP;


    public Product(String productName, String productCategory, String productDescription, boolean hasGST, int basePrice, int GST) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.basePrice = basePrice;
        this.hasGST = hasGST;
        this.GST = GST;
        this.MRP = (basePrice + (basePrice * GST / 100));

    }


    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public boolean getHasGSTForProduct() {
        return hasGST;
    }

    public int getProductMRP() {
        return MRP;
    }

}
