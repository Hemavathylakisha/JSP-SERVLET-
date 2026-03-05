package com.SmartCity;

import java.util.List;

public class SmartCity {

    private String city;
    private List<Initiative> initiatives;

    public SmartCity() {}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Initiative> getInitiatives() {
        return initiatives;
    }

    public void setInitiatives(List<Initiative> initiatives) {
        this.initiatives = initiatives;
    }
}
