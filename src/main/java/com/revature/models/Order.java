package com.revature.models;

import java.util.Date;

public class Order {

    private int orderId;
    private Person buyers;
    private float total;
    private boolean orderComplete;
    private boolean accountActive;
    private Date orderDate;

    public Order() {
    }

    public Order(int orderId, Person buyers, float total, boolean orderComplete, boolean accountActive, Date orderDate) {
        this.orderId = orderId;
        this.buyers = buyers;
        this.total = total;
        this.orderComplete = orderComplete;
        this.accountActive = accountActive;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Person getBuyers() {
        return buyers;
    }

    public void setBuyers(Person buyers) {
        this.buyers = buyers;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public boolean isOrderComplete() {
        return orderComplete;
    }

    public void setOrderComplete(boolean orderComplete) {
        this.orderComplete = orderComplete;
    }

    public boolean isAccountActive() {
        return accountActive;
    }

    public void setAccountActive(boolean accountActive) {
        this.accountActive = accountActive;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", buyers=" + buyers +
                ", total=" + total +
                ", orderComplete=" + orderComplete +
                ", accountActive=" + accountActive +
                ", orderDate=" + orderDate +
                '}';
    }
}
