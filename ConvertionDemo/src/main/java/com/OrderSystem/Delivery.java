package com.OrderSystem;

public class Delivery {

    private String status;
    private String expectedDate;
    private Tracking tracking;

    public Delivery() {}

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getExpectedDate() { return expectedDate; }
    public void setExpectedDate(String expectedDate) { this.expectedDate = expectedDate; }

    public Tracking getTracking() { return tracking; }
    public void setTracking(Tracking tracking) { this.tracking = tracking; }
}
