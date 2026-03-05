package com.StoreEcommerce;

import java.util.List;

public class Product {

    private String id;
    private String name;
    private String brand;
    private Specs specs;
    private double price;
    private String weight;
    private String quantity;
    private List<Review> reviews;

    public Product() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public Specs getSpecs() { return specs; }
    public void setSpecs(Specs specs) { this.specs = specs; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getWeight() { return weight; }
    public void setWeight(String weight) { this.weight = weight; }

    public String getQuantity() { return quantity; }
    public void setQuantity(String quantity) { this.quantity = quantity; }

    public List<Review> getReviews() { return reviews; }
    public void setReviews(List<Review> reviews) { this.reviews = reviews; }
}
