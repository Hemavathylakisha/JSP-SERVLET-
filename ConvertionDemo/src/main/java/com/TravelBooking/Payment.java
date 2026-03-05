package com.TravelBooking;

public class Payment {

    private String date;
    private int amount;
    private String currency;
    private String mode;

    public Payment() {}

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getMode() { return mode; }
    public void setMode(String mode) { this.mode = mode; }
}
