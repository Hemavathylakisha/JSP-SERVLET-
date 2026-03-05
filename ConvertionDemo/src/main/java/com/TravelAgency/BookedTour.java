package com.TravelAgency;

public class BookedTour {

    private String tourId;
    private String travelDate;
    private Payment payment;

    public BookedTour() {}

    public String getTourId() { return tourId; }
    public void setTourId(String tourId) { this.tourId = tourId; }

    public String getTravelDate() { return travelDate; }
    public void setTravelDate(String travelDate) { this.travelDate = travelDate; }

    public Payment getPayment() { return payment; }
    public void setPayment(Payment payment) { this.payment = payment; }
}
