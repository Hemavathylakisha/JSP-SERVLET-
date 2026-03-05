package com.TravelAgency;

import java.util.List;

public class PackageDetails {

    private int price;
    private List<String> inclusions;

    public PackageDetails() {}

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public List<String> getInclusions() { return inclusions; }
    public void setInclusions(List<String> inclusions) { this.inclusions = inclusions; }
}
