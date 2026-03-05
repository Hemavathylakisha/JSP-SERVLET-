package com.SupplyChain;

import java.util.List;

public class SupplyChain {

    private String chainId;
    private String company;
    private List<Product> products;

    public SupplyChain() {}

    public String getChainId() { return chainId; }
    public void setChainId(String chainId) { this.chainId = chainId; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }
}
