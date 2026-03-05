package com.SupplyChain;

public class Supplier {

    private String supplierId;
    private String name;
    private String country;
    private Contact contact;

    public Supplier() {}

    public String getSupplierId() { return supplierId; }
    public void setSupplierId(String supplierId) { this.supplierId = supplierId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public Contact getContact() { return contact; }
    public void setContact(Contact contact) { this.contact = contact; }
}
