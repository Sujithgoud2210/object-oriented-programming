package com.java.oop.Basics;

public class Product {

    int id, productPrice, quantity, shippingCharges;
    String productName;
    float discountPercentage, finalPrice, stateTax, centralTax,
            discountedPrice, discountAmount, stateTaxAmount, centralTaxAmount,
            finalBill, totalSaved, savedAmount, max_Retail_Price;
//    id,mrp,name,discountpercentage,st,ct;
//    Product(int id, int productPrice, int quantity, float max_Retail_Price, String productName, float discountPercentage, float finalPrice, float stateTax, float centralTax, float discountedPrice, float discountAmount, float stateTaxAmount, float centralTaxAmount, float finalBill, float totalSaved, float savedAmount) {
//        this.id = id;
//        this.productPrice = productPrice;
//        this.quantity = quantity;
//        this.max_Retail_Price = max_Retail_Price;
//        this.productName = productName;
//        this.discountPercentage = discountPercentage;
//        this.finalPrice = finalPrice;
//        this.stateTax = stateTax;
//        this.centralTax = centralTax;
//        this.discountedPrice = discountedPrice;
//        this.discountAmount = discountAmount;
//        this.stateTaxAmount = stateTaxAmount;
//        this.centralTaxAmount = centralTaxAmount;
//        this.finalBill = finalBill;
//        this.totalSaved = totalSaved;
//        this.savedAmount = savedAmount;
//    }


    public Product(int id, int productPrice, float max_Retail_Price, float discountPercentage, String productName, float stateTax, float centralTax, int shippingCharges) {
        this.id = id;
        this.productPrice = productPrice;
        this.max_Retail_Price = max_Retail_Price;
        this.discountPercentage = discountPercentage;
        this.productName = productName;
        this.stateTax = stateTax;
        this.centralTax = centralTax;
        this.shippingCharges = shippingCharges;
    }
    void displayProduct() {
        System.out.println("id                  : " + id);
        System.out.println("product price       : " + productPrice);
        System.out.println("max retail price    : " + max_Retail_Price);
        System.out.println("Product name        : " + productName);
        System.out.println("Discount percentage : " + discountPercentage);
        System.out.println("State Tax           : " + stateTax);
        System.out.println("Central Tax         : " + centralTax);
        System.out.println("Shipping Charges    : " + shippingCharges);
        System.out.println("final price         : " + calculateFinalPrice());
        System.out.printf("%-5s  %-15s  %-10s  %-15s %-10s %-10s %-10s %-10s %-10s%n", "id", "product pice", "MRP", "productName", "discount percentage","State Tax","Central Tax", "Shipping Charges","final price");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-5d   %-5d           %-5f        %-5s          %-5f   %-5f &-5f %-5f %-5d   %-5f %n", id, productPrice, max_Retail_Price, productName, discountPercentage,stateTax,centralTax,shippingCharges, calculateFinalPrice());
    }

    float calculateDiscount() {
        return max_Retail_Price * discountPercentage / 100;
    }

    float priceAfterDiscount() {
        return max_Retail_Price - calculateDiscount();
    }

    float calculateStateTax() {
        return priceAfterDiscount() * stateTax / 100;
    }

    float calculateCentralTax() {
        return priceAfterDiscount() * centralTax / 100;
    }

    float calculateFinalPrice() {
        return priceAfterDiscount() + calculateStateTax() + calculateCentralTax() + shippingCharges;
    }
}
