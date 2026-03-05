package com.OrderSystem;

public class Item {

    private String productId;
    private String name;
    private int quantity;
    private double price;
    private Warranty warranty;

    public Item() {}

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Warranty getWarranty() { return warranty; }
    public void setWarranty(Warranty warranty) { this.warranty = warranty; }
}
