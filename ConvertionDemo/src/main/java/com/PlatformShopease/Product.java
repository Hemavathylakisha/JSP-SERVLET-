package com.PlatformShopease;

import java.util.List;

public class Product {

    private String productId;
    private String title;
    private Specs specs;
    private String author;
    private Double price;
    private List<Review> reviews;

    public Product() {}

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Specs getSpecs() { return specs; }
    public void setSpecs(Specs specs) { this.specs = specs; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public List<Review> getReviews() { return reviews; }
    public void setReviews(List<Review> reviews) { this.reviews = reviews; }
}
