package com.java.oop.stringassignment;

import java.util.HashSet;

public class ProductService {
    HashSet<Product> getProducts(String[] productsData) {
//        splitting the product data
        HashSet<Product> productHashSet = new HashSet<>();
        for (String productData : productsData) {
            String[] split = productData.split(",");
            Product product = new Product();
            product.setId(split[0]);
            product.setName(split[1]);
            product.setMaxRetailPrice(Double.parseDouble(split[2]));
            product.setDiscountPercentage(Float.parseFloat(split[3]));
            productHashSet.add(product);
        }
        return productHashSet;
    }

    public double calculateFinalPrice(Product product) {
        String finalPrice;
        return product.getMaxRetailPrice() - (product.getMaxRetailPrice() * product.getDiscountPercentage() / 100);
    }

    public void displayProductDetails(Product product) {

        System.out.println("Id : " + product.getId());
        System.out.println("name : " + product.getName());
        System.out.println("Max retail price : " + product.getMaxRetailPrice());
        System.out.println("Discount percentage : " + product.getDiscountPercentage());
        System.out.println("Final price : "+calculateFinalPrice(product));
    }
}
