package com.Realestate;

import java.util.List;

public class Listing {

    private String id;
    private String type;
    private double price;
    private Location location;
    private Details details;
    private List<String> amenities;
    private Owner owner;

    public Listing() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public Details getDetails() { return details; }
    public void setDetails(Details details) { this.details = details; }

    public List<String> getAmenities() { return amenities; }
    public void setAmenities(List<String> amenities) { this.amenities = amenities; }

    public Owner getOwner() { return owner; }
    public void setOwner(Owner owner) { this.owner = owner; }
}
