package com.example.kriti.inventoryapp.data;

public class Product {
    /**
     * Tag for the log messages
     */
    public static final String LOG_TAG = Product.class.getSimpleName();

    private final String productName;
    private final String productPrice;
    private final int productQuantity;
    private final String supplierName;
    private final String supplierPhone;
    private final String productImage;

    public Product(String productName, String price, int quantity, String supplierName, String supplierPhone, String supplierEmail, String image) {
        this.productName = productName;
        this.productPrice = price;
        this.productQuantity = quantity;
        this.supplierName = supplierName;
        this.supplierPhone = supplierPhone;
        this.productImage = image;
    }

    public String getProductName() {
        return productName;
    }

    public String getPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return productQuantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public String getImage() {
        return productImage;
    }

  /*  @Override
    public String toString() {
        return "StockItem{" +
                "productName='" + productName + '\'' +
                ", price='" + productPrice + '\'' +
                ", quantity=" + productQuantity +
                ", supplierName='" + supplierName + '\'' +
                ", supplierPhone='" + supplierPhone + '\'' +
                '}';
    }*/
}
