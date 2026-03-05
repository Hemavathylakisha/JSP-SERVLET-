package com.Realestate;

import java.util.List;

public class PropertyPlatform {

    private String city;
    private List<Listing> listings;

    public PropertyPlatform() {}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }
}
