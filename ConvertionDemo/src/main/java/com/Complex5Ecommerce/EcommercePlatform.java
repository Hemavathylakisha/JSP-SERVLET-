package com.Complex5Ecommerce;

import java.util.List;

public class EcommercePlatform {

    private String ecommercePlatform;
    private List<User> users;

    public EcommercePlatform() {}

    public String getEcommercePlatform() {
        return ecommercePlatform;
    }

    public void setEcommercePlatform(String ecommercePlatform) {
        this.ecommercePlatform = ecommercePlatform;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
