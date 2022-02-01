package com.revature.models;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private int productId;
    private String productName;
    private float price;
    private Person admin;
    private List<Person> buyers;
    private List<Person> sellers;

    public Product(){
        this.buyers = new ArrayList<>();
        this.sellers = new ArrayList<>();
    }

    public Product(int productId, String productName, float price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.buyers = new ArrayList<>();
        this.sellers = new ArrayList<>();
    }

    public Product(int productId, String productName, float price, Person admin, List<Person> buyers, List<Person> sellers) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.admin = admin;
        this.buyers = buyers;
        this.sellers = sellers;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Person getAdmin() {
        return admin;
    }

    public void setAdmin(Person admin) {
        this.admin = admin;
    }

    public List<Person> getBuyers() {
        return buyers;
    }

    public void setBuyers(List<Person> buyers) {
        this.buyers = buyers;
    }

    public List<Person> getSellers() {
        return sellers;
    }

    public void setSellers(List<Person> sellers) {
        this.sellers = sellers;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", admin=" + admin +
                ", buyers=" + buyers +
                ", sellers=" + sellers +
                '}';
    }
}
