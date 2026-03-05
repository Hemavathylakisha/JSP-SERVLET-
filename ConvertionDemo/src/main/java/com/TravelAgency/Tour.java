package com.TravelAgency;

public class Tour {

    private String tourId;
    private String destination;
    private int durationDays;
    private PackageDetails packageDetails;

    public Tour() {}

    public String getTourId() { return tourId; }
    public void setTourId(String tourId) { this.tourId = tourId; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public int getDurationDays() { return durationDays; }
    public void setDurationDays(int durationDays) { this.durationDays = durationDays; }

    public PackageDetails getPackageDetails() { return packageDetails; }
    public void setPackageDetails(PackageDetails packageDetails) { this.packageDetails = packageDetails; }
}
