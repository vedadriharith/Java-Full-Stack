package com.project.product;

public class Product {
    private Long productId;
    private String productName;
    private Double productPrice;
    private String productMadeIn;
    private String productLocation;
    
    public Long getProductId() {
        return productId;
    }
    
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public Double getProductPrice() {
        return productPrice;
    }
    
    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
    
    public String getProductMadeIn() {
        return productMadeIn;
    }
    
    public void setProductMadeIn(String productMadeIn) {
        this.productMadeIn = productMadeIn;
    }
    
    public String getProductLocation() {
        return productLocation;
    }
    
    public void setProductLocation(String productLocation) {
        this.productLocation = productLocation;
    }
}