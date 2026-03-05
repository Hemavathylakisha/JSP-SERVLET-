package com.TravelAgency;

import java.util.List;

public class Customer {

    private String customerId;
    private String name;
    private List<BookedTour> bookedTours;

    public Customer() {}

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<BookedTour> getBookedTours() { return bookedTours; }
    public void setBookedTours(List<BookedTour> bookedTours) { this.bookedTours = bookedTours; }
}
