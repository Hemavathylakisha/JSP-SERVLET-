package com.OnlineShoppingCart;

public class Delivery {

    private String type;
    private int estimatedDays;
    private Tracking tracking;

    public Delivery() {}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEstimatedDays() {
		return estimatedDays;
	}

	public void setEstimatedDays(int estimatedDays) {
		this.estimatedDays = estimatedDays;
	}

	public Tracking getTracking() {
		return tracking;
	}

	public void setTracking(Tracking tracking) {
		this.tracking = tracking;
	}

    // Getters and Setters
}