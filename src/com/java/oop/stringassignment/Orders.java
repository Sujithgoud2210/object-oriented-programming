package com.java.oop.stringassignment;

import java.util.HashSet;
import java.util.Objects;

public class Orders {
    private String id;
    private HashSet<Product> productHashSet;
    private String status;

    public Product[] getProducts(HashSet<Product> productHashSet) {
        return productHashSet.toArray(new Product[0]);
    }

    public Orders() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        Orders orders = (Orders) o;
        return Objects.equals(id, orders.id) && Objects.equals(productHashSet, orders.productHashSet) && Objects.equals(status, orders.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productHashSet, status);
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", productHashSet=" + productHashSet +
                ", status='" + status + '\'' +
                '}';
    }

//    String[] orders = {
//            "order-101, new Product[]{products[0],"ORDERED", "SHIPPED";
//
//    }
}