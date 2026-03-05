package com.TravelBooking;

import java.util.List;

public class Itinerary {

    private List<Flight> flights;
    private List<Hotel> hotels;

    public Itinerary() {}

    public List<Flight> getFlights() { return flights; }
    public void setFlights(List<Flight> flights) { this.flights = flights; }

    public List<Hotel> getHotels() { return hotels; }
    public void setHotels(List<Hotel> hotels) { this.hotels = hotels; }
}
