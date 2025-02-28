package com.greedy.stream;

import java.util.List;

public class Order {
    private String orderId;
    private String customerName;
    private List<String> items;
    private double totalAmount;
    private String status;

    public Order(String orderId, String customerName, List<String> items, double totalAmount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
        this.totalAmount = totalAmount;
        this.status = status;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
