package com.java.oop.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();
        productSet.add(new Product("1","apple",100,20));
        productSet.add(new Product("2","banana",200,20));
        productSet.add(new Product("3","grapes",300,20));
        productSet.add(new Product("4","pineapple",400,20));
        productSet.add(new Product("1","apple",100,20));

//        Iterator<Product> productIterator=productSet.iterator();
//        while (productIterator.hasNext()){
//            Product product=productIterator.next();
//            System.out.println(product);
//        }
//        productSet.remove(new Product("2","banana",200,20));
        System.out.println(productSet);
//        System.out.println(productSet.isEmpty());
//        System.out.println(productSet.size());
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        String id= sc.next();
//        productSet.removeIf(product -> product.getId().equals(id));
//        System.out.println(productSet);

        Iterator<Product> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId().equals(id)) {
                iterator.remove();
            }
        }
        System.out.println(productSet);
        }
    }
