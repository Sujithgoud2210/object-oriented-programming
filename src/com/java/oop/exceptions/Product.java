package com.java.oop.exceptions;

import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private float discountPercantage;

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiscountPercantage() {
        return discountPercantage;
    }

    public void setDiscountPercantage(float discountPercantage) {
        this.discountPercantage = discountPercantage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(discountPercantage, product.discountPercantage) == 0 && Objects.equals(id, product.id) && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, discountPercantage);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", discountPercantage=" + discountPercantage +
                '}';
    }
}
