package com.java.oop.exceptions;

public class ProductController {
    private final ProductService productService;

    public ProductController() {
        productService = new ProductService();
    }

    public Product save(Product product) throws ProductExistsException {
        return productService.save(product);
    }

    public Product getProductById(String id) throws  ProductNotFoundException {
        return productService.getProductById(id);
    }

    public Product update(String id, Product product) throws  ProductNotFoundException {
        return productService.update(id, product);
    }

    public void delete(String id) throws ProductExistsException {
        productService.delete(id);
    }

}
