package com.TravelBooking;

public class Flight {

    private String flightNumber;
    private String from;
    private String to;
    private String departure;
    private String arrival;
    private String seat;

    public Flight() {}

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getFrom() { return from; }
    public void setFrom(String from) { this.from = from; }

    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }

    public String getDeparture() { return departure; }
    public void setDeparture(String departure) { this.departure = departure; }

    public String getArrival() { return arrival; }
    public void setArrival(String arrival) { this.arrival = arrival; }

    public String getSeat() { return seat; }
    public void setSeat(String seat) { this.seat = seat; }
}
