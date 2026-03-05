package com.InsurancePolicy;

public class PaymentHistory {

    private String date;
    private int amount;
    private String mode;

    public PaymentHistory() {}

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public String getMode() { return mode; }
    public void setMode(String mode) { this.mode = mode; }
}
