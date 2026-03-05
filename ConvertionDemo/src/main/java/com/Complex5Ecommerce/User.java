package com.Complex5Ecommerce;

import java.util.List;

public class User {

    private String userId;
    private String name;
    private String email;
    private Address address;
    private List<Order> orders;

    public User() {}

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public List<Order> getOrders() { return orders; }
    public void setOrders(List<Order> orders) { this.orders = orders; }
}
