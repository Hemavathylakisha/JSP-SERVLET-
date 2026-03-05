package com.TravelBooking;

public class Traveler {

    private String firstName;
    private String lastName;
    private String passportNumber;
    private String nationality;
    private Contact contact;

    public Traveler() {}

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    public Contact getContact() { return contact; }
    public void setContact(Contact contact) { this.contact = contact; }
}