package com.java.oop.exceptions;

public class ProductController {
    private final ProductService productService;

    public ProductController() {
        productService = new ProductService();
    }

    public Product saveProduct(Product product) throws ProductExistsException {
        return productService.save(product);
    }

    public Product getProduct(String id) throws ProductExistsException {
        return productService.getProduct(id);
    }

    public Product updateProduct(String id, Product product) throws ProductExistsException {
        return productService.update(id, product);
    }

    public void deleteProduct(String id) throws ProductExistsException {
        productService.delete(id);
    }

}
