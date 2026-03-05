package com.Complex5Ecommerce;

public class Payment {

    private String method;
    private String transactionId;
    private double amount;

    public Payment() {}

    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
