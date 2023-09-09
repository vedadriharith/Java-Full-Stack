package com.project.product;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class ProductService {
	private List<Product> products = new ArrayList<>(); // class-level variable

    public ProductService() {
        // initialize the products list in the constructor
        Product product1 = new Product();
        product1.setProductId(1L);
        product1.setProductName("Iphone 14 Pro Max");
        product1.setProductPrice(139900.00);
        product1.setProductMadeIn("USA");
        product1.setProductLocation("New York");

        Product product2 = new Product();
        product2.setProductId(2L);
        product2.setProductName("ASUS ROG Phone 7");
        product2.setProductPrice(74999.00);
        product2.setProductMadeIn("Taiwan");
        product2.setProductLocation("Taipei City");

        products.add(product1);
        products.add(product2);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }
    public Product getProductById(Long productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }
}
