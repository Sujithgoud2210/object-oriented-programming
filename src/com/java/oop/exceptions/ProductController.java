package com.java.oop.exceptions;

public class ProductController {
    private final ProductService productService;
    public ProductController() {
        productService=new ProductService();
    }

    Product save(Product product){
        System.out.println("product saved sucessfully");
        return product;
    }
}
