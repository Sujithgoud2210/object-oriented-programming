package com.java.oop;

public class Product {

    int id, productPrice, quantity, max_Retail_Price;
    String productName;
    float  discountPercentage, finalPrice,stateTax,centralTax,
            discountedPrice, discountAmount, stateTaxAmount, centralTaxAmount,
            finalBill, totalSaved, savedAmount;

    Product(int id,int productPrice,int quantity,int max_Retail_Price,String productName,float discountPercentage,float finalPrice,float stateTax,float centralTax,float discountedPrice,float discountAmount,float stateTaxAmount,float centralTaxAmount,float finalBill,float totalSaved,float savedAmount){
        this.id=id;
        this.productPrice=productPrice;
        this.quantity=quantity;
        this.max_Retail_Price=max_Retail_Price;
        this.productName=productName;
        this.discountPercentage = discountPercentage;
        this.finalPrice = finalPrice;
        this.stateTax = stateTax;
        this.centralTax = centralTax;
        this.discountedPrice = discountedPrice;
        this.discountAmount = discountAmount;
        this.stateTaxAmount = stateTaxAmount;
        this.centralTaxAmount = centralTaxAmount;
        this.finalBill = finalBill;
        this.totalSaved = totalSaved;
        this.savedAmount = savedAmount;
    }
    void displayProduct(){
        System.out.println("id                 : " + id);
        System.out.println("product price      : "+productPrice);
        System.out.println("quantity           : " + quantity);
        System.out.println("max retail price   : " + max_Retail_Price);
        System.out.println("Product name       : " + productName);
        System.out.println("id                 : " + id);
        System.out.println("product price      : "+productPrice);
        System.out.println("quantity           : " + quantity);
        System.out.println("max retail price   : " + max_Retail_Price);
        System.out.println("Product name       : " + productName);
        System.out.printf("%-5s  %-15s  %-10s  %-15s %10s%n", "id", "productPrice", "quantity", "max_Retail_Price","productName");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-5d   %-5d           %-5d        %-5d            %-5s%n",id,productPrice,quantity,max_Retail_Price,productName);
    }

}
