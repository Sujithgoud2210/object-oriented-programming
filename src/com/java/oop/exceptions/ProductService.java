package com.java.oop.exceptions;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService() {
        productRepository = new ProductRepository();
    }

    public Product save(Product product) throws ProductExistsException {
        if (productRepository.exists(product.getId())) {
            throw new ProductExistsException("product already exists with this id : " + product.getId());
        }
        return productRepository.save(product);
    }

    public Product getProductById(String id) throws ProductNotFoundException {
        Product product = productRepository.getProductById(id);

        if (product == null) {
            throw new ProductNotFoundException("Product not found" + id);
        }

        return product;
    }

    public Product update(String id, Product product) throws ProductNotFoundException {

        Product existingProduct = productRepository.getProductById(id);

        if (existingProduct == null) {
            throw new ProductNotFoundException("Product not found to update with id: " + id);
        }

        return productRepository.update(id, product);
    }

    public void delete(String id) throws ProductNotFoundException{

        Product product = productRepository.getProductById(id);

        if (product == null) {
            throw new ProductNotFoundException("Product not found to delete with id: " + id);
        }

        productRepository.deleteProduct(id);
    }
}
