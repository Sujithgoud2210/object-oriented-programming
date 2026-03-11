package com.java.oop.productassignment;

import java.util.ArrayList;

public class ProductRepository {
//    ArrayList<Product> productArrayList;
//
//    public ProductRepository() {
//        productArrayList = new ArrayList<>();
//    }
//
//    public ArrayList<Product> loadProducts(String[] productsData) {
//        for (String productData : productsData) {
//            String[] split = productData.split(",");
//            Product product = new Product();
//            product.setId(split[0]);
//            product.setName(split[1]);
//            product.setMaxRetailPrice(Double.parseDouble(split[2]));
//            product.setDiscountPercentage(Float.parseFloat(split[3]));
//            productArrayList.add(product);
//        }
//        return productArrayList;
//    }
//    public Product save(Product product){
//        productArrayList.add(product);
//        return product;
//    }
//    public Product getProductById(String id){
//        for (Product product:productArrayList){
//            if(product.getId().equals(id)){
//                return product;
//            }
//        }
//        return null;
//    }
//    public Product update(String id,Product product){
//        Product ids=getProductById(id);
//        if(ids==null){
//            return null;
//        }
//        else {
//            int index=productArrayList.indexOf(ids);
//            productArrayList.set(index,product);
//            return product;
//        }
//    }
//    public Product delete(String id){
//        return null;
//    }
//    public void displayUsingForEach() {
//        for (Product product : productArrayList) {
//            System.out.println(product);
//        }
//    }
//
//    // Display using Iterator
//    public void displayUsingIterator() {
//        Iterator<Product> iterator = productArrayList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }
//
//    // Update
//    public Product update(String id, Product product) {
//        for (int i = 0; i < productArrayList.size(); i++) {
//            if (productArrayList.get(i).getId().equals(id)) {
//                productArrayList.set(i, product);
//                return product;
//            }
//        }
//        return null;
//    }
//
//    // Delete
//    public Product delete(String id) {
//        Iterator<Product> iterator = productArrayList.iterator();
//        while (iterator.hasNext()) {
//            Product product = iterator.next();
//            if (product.getId().equals(id)) {
//                iterator.remove();
//                return product;
//            }
//        }
//        return null;
//    }
//
//    // Sort Ascending (Manual)
//    public void sortByPriceAscending() {
//        for (int i = 0; i < productArrayList.size() - 1; i++) {
//            for (int j = i + 1; j < productArrayList.size(); j++) {
//                if (productArrayList.get(i).getMaxRetailPrice() >
//                        productArrayList.get(j).getMaxRetailPrice()) {
//
//                    Product temp = productArrayList.get(i);
//                    productArrayList.set(i, productArrayList.get(j));
//                    productArrayList.set(j, temp);
//                }
//            }
//        }
//    }
//
//    // Sort Descending (Manual)
//    public void sortByPriceDescending() {
//        for (int i = 0; i < productArrayList.size() - 1; i++) {
//            for (int j = i + 1; j < productArrayList.size(); j++) {
//                if (productArrayList.get(i).getMaxRetailPrice() <
//                        productArrayList.get(j).getMaxRetailPrice()) {
//
//                    Product temp = productArrayList.get(i);
//                    productArrayList.set(i, productArrayList.get(j));
//                    productArrayList.set(j, temp);
//                }
//            }
//        }
//    }
//
//    // Highest Price Product
//    public Product getHighestPriceProduct() {
//        Product max = productArrayList.get(0);
//        for (Product product : productArrayList) {
//            if (product.getMaxRetailPrice() > max.getMaxRetailPrice()) {
//                max = product;
//            }
//        }
//        return max;
//    }
//
//    // Least Price Product
//    public Product getLeastPriceProduct() {
//        Product min = productArrayList.get(0);
//        for (Product product : productArrayList) {
//            if (product.getMaxRetailPrice() < min.getMaxRetailPrice()) {
//                min = product;
//            }
//        }
//        return min;
//    }
//
//    // Max Discount Product
//    public Product getMaxDiscountProduct() {
//        Product max = productArrayList.get(0);
//        for (Product product : productArrayList) {
//            if (product.getDiscountPercentage() > max.getDiscountPercentage()) {
//                max = product;
//            }
//        }
//        return max;
//    }
//
//    // Total Value
//    public double getTotalValue() {
//        double total = 0;
//        for (Product product : productArrayList) {
//            total += product.getMaxRetailPrice();
//        }
//        return total;
//    }
//
//    // Average Price
//    public double getAveragePrice() {
//        return getTotalValue() / productArrayList.size();
//    }
//
//    // Count Above Price
//    public int countProductsAbovePrice(double price) {
//        int count = 0;
//        for (Product product : productArrayList) {
//            if (product.getMaxRetailPrice() > price) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    // Discount Above
//    public ArrayList<Product> getProductsWithDiscountAbove(float discount) {
//        ArrayList<Product> result = new ArrayList<>();
//        for (Product product : productArrayList) {
//            if (product.getDiscountPercentage() > discount) {
//                result.add(product);
//            }
//        }
//        return result;
//    }
}
