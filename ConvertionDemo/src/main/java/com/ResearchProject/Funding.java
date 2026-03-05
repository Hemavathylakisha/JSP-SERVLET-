package com.ResearchProject;

public class Funding {

    private String agency;
    private double amount;
    private String currency;
    private int durationYears;

    public Funding() {}

    public String getAgency() { return agency; }
    public void setAgency(String agency) { this.agency = agency; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public int getDurationYears() { return durationYears; }
    public void setDurationYears(int durationYears) { this.durationYears = durationYears; }
}
