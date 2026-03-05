package com.SupplyChain;

import java.util.List;

public class Product {

    private String productId;
    private String name;
    private List<Supplier> suppliers;
    private List<Warehouse> warehouses;
    private Distribution distribution;

    public Product() {}

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Supplier> getSuppliers() { return suppliers; }
    public void setSuppliers(List<Supplier> suppliers) { this.suppliers = suppliers; }

    public List<Warehouse> getWarehouses() { return warehouses; }
    public void setWarehouses(List<Warehouse> warehouses) { this.warehouses = warehouses; }

    public Distribution getDistribution() { return distribution; }
    public void setDistribution(Distribution distribution) { this.distribution = distribution; }
}
