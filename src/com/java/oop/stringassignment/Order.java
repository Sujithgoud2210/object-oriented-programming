package com.java.oop.stringassignment;

import java.util.HashSet;
import java.util.Objects;

public class Order {
    private String id;
    private String customerName;
    private HashSet<Product> productHashSet;
    private String status;

    public Product[] getProducts(HashSet<Product> productHashSet) {
        return productHashSet.toArray(new Product[0]);
    }

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public HashSet<Product> getProductHashSet() {
        return productHashSet;
    }

    public void setProductHashSet(HashSet<Product> productHashSet) {
        this.productHashSet = productHashSet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order orders = (Order) o;
        return Objects.equals(id, orders.id) && Objects.equals(customerName, orders.customerName) && Objects.equals(productHashSet, orders.productHashSet) && Objects.equals(status, orders.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, productHashSet, status);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", customerName='" + customerName + '\'' +
                ", productHashSet=" + productHashSet +
                ", status='" + status + '\'' +
                '}';
    }
    //    String[] orders = {
//            "order-101, new Product[]{products[0],"ORDERED", "SHIPPED";
//
//    }
}