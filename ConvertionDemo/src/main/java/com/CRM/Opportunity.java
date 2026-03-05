package com.CRM;

public class Opportunity {

    private String id;
    private double value;
    private String stage;
    private String expectedCloseDate;
    private String assignedTo;

    public Opportunity() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }

    public String getStage() { return stage; }
    public void setStage(String stage) { this.stage = stage; }

    public String getExpectedCloseDate() { return expectedCloseDate; }
    public void setExpectedCloseDate(String expectedCloseDate) { this.expectedCloseDate = expectedCloseDate; }

    public String getAssignedTo() { return assignedTo; }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }
}
