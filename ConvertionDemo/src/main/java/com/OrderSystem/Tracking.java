package com.OrderSystem;

import java.util.List;

public class Tracking {

    private String id;
    private String courier;
    private List<History> history;

    public Tracking() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCourier() { return courier; }
    public void setCourier(String courier) { this.courier = courier; }

    public List<History> getHistory() { return history; }
    public void setHistory(List<History> history) { this.history = history; }
}
