package com.TravelAgency;

import java.util.List;

public class Agency {

    private String name;
    private List<Branch> branches;
    private List<Tour> tours;
    private List<Customer> customers;

    public Agency() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Branch> getBranches() { return branches; }
    public void setBranches(List<Branch> branches) { this.branches = branches; }

    public List<Tour> getTours() { return tours; }
    public void setTours(List<Tour> tours) { this.tours = tours; }

    public List<Customer> getCustomers() { return customers; }
    public void setCustomers(List<Customer> customers) { this.customers = customers; }
}
