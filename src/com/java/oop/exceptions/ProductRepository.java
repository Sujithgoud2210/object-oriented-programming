package com.java.oop.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    List<Product> products;

    public ProductRepository() {
        products=new ArrayList<>();
    }

    public Product save(Product product){
        products.add(product);
        return product;
    }
    public Product getProductById(String id){
        for(Product product:products){
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }
    public boolean exists(String id){
        boolean exists=false;
        if(getProductById(id)!=null){
         exists=true;
        }
        return exists;
    }


    public Product update(String id,Product product){
        Product ids=getProductById(id);
        if(ids==null){
            return null;
        }
        else {
            int index=products.indexOf(ids);
            products.set(index,product);
            return product;
        }
    }
    public void deleteProduct(String id) {
        products.removeIf(product -> product.getId().equals(id));
    }

}
