package com.java.oop.exceptions;

public class Main {
    public static void main(String[] args) {
        ProductController controller = new ProductController();

        try {

            Product p1 = new Product("P101","Laptop",10);
            Product p2 = new Product("P102","Mobile",15.0f);


            controller.save(p1);
            controller.save(p2);

            System.out.println("Products saved successfully");

            System.out.println(controller.getProductById("P101"));


            Product updatedProduct = new Product("P101","Gaming Laptop",20.0f);
            controller.update("P101",updatedProduct);

            System.out.println("Product updated successfully");


            controller.delete("P102");

            System.out.println("Product deleted successfully");

        } catch (ProductExistsException e) {

            System.out.println(e.getMessage());

        }

    }

}