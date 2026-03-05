package com.PlatformShopease;

import java.util.List;

public class Specs {

    private String brand;
    private List<String> storageOptions;
    private List<String> colors;
    private String batteryLife;
    private List<String> features;

    public Specs() {}

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public List<String> getStorageOptions() { return storageOptions; }
    public void setStorageOptions(List<String> storageOptions) { this.storageOptions = storageOptions; }

    public List<String> getColors() { return colors; }
    public void setColors(List<String> colors) { this.colors = colors; }

    public String getBatteryLife() { return batteryLife; }
    public void setBatteryLife(String batteryLife) { this.batteryLife = batteryLife; }

    public List<String> getFeatures() { return features; }
    public void setFeatures(List<String> features) { this.features = features; }
}
