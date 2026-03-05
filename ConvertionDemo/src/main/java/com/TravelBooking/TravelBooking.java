package com.TravelBooking;

import java.util.List;

public class TravelBooking {

    private String bookingId;
    private Traveler traveler;
    private Itinerary itinerary;
    private List<Payment> payments;
    private String status;

    public TravelBooking() {}

    public String getBookingId() { return bookingId; }
    public void setBookingId(String bookingId) { this.bookingId = bookingId; }

    public Traveler getTraveler() { return traveler; }
    public void setTraveler(Traveler traveler) { this.traveler = traveler; }

    public Itinerary getItinerary() { return itinerary; }
    public void setItinerary(Itinerary itinerary) { this.itinerary = itinerary; }

    public List<Payment> getPayments() { return payments; }
    public void setPayments(List<Payment> payments) { this.payments = payments; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
