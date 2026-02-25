package com.java.oop.productassignment;

import java.util.ArrayList;

public class ProductRepository {
    ArrayList<Product> productArrayList;

    public ProductRepository() {
        productArrayList = new ArrayList<>();
    }

    public ArrayList<Product> loadProducts(String[] productsData) {
        for (String productData : productsData) {
            String[] split = productData.split(",");
            Product product = new Product();
            product.setId(split[0]);
            product.setName(split[1]);
            product.setMaxRetailPrice(Double.parseDouble(split[2]));
            product.setDiscountPercentage(Float.parseFloat(split[3]));
            productArrayList.add(product);
        }
        return productArrayList;
    }
    public Product save(Product product){
        productArrayList.add(product);
        return product;
    }
    public Product getProductById(String id){
        for (Product product:productArrayList){
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }
    public Product update(String id,Product product){
        Product ids=getProductById(id);
        if(ids==null){
            return null;
        }
        else {
            int index=productArrayList.indexOf(ids);
            productArrayList.set(index,product);
            return product;
        }
    }
    public Product delete(String id){
        return null;
    }
}
