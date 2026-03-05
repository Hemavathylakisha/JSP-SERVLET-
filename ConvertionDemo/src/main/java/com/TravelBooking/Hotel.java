package com.TravelBooking;

public class Hotel {

    private String hotelName;
    private String location;
    private String checkIn;
    private String checkOut;
    private String roomType;

    public Hotel() {}

    public String getHotelName() { return hotelName; }
    public void setHotelName(String hotelName) { this.hotelName = hotelName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getCheckIn() { return checkIn; }
    public void setCheckIn(String checkIn) { this.checkIn = checkIn; }

    public String getCheckOut() { return checkOut; }
    public void setCheckOut(String checkOut) { this.checkOut = checkOut; }

    public String getRoomType() { return roomType; }
    public void setRoomType(String roomType) { this.roomType = roomType; }
}
