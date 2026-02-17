package com.java.oop.stringassignment;

import java.util.HashSet;

public class OrderService {
    private HashSet<Orders> orders = new HashSet<>();

    public HashSet<Orders> getOrders(String[] ordersData) {

        for (String data : ordersData) {

            String[] split = data.split(",");

            String orderId = split[0];
            String status = split[1];

            HashSet<Product> productSet = new HashSet<>();

            Orders order = new Orders(orderId, productSet, status);
            orders.add(order);
        }

        return orders;
    }

    public double totalOrderValue(Orders order) {

        double total = 0;

        for (Product product : orders) {

            total += product.getMaxRetailPrice()
                    - (product.getMaxRetailPrice()
                    * product.getDiscountPercentage() / 100);
        }

        return total;
    }

    public HashSet<Orders> ordersByState(String orderStatus) {

        HashSet<Orders> result = new HashSet<>();

        for (Orders order : orders) {
            if (order.getStatus().equalsIgnoreCase(orderStatus)) {
                result.add(order);
            }
        }

        return result;
    }
}
