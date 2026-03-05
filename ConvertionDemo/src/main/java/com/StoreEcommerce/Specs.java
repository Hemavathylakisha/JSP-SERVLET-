package com.StoreEcommerce;

import java.util.List;

public class Specs {

    private String ram;
    private String storage;
    private List<String> color;
    private String size;
    private String resolution;

    public Specs() {}

    public String getRam() { return ram; }
    public void setRam(String ram) { this.ram = ram; }

    public String getStorage() { return storage; }
    public void setStorage(String storage) { this.storage = storage; }

    public List<String> getColor() { return color; }
    public void setColor(List<String> color) { this.color = color; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public String getResolution() { return resolution; }
    public void setResolution(String resolution) { this.resolution = resolution; }
}
