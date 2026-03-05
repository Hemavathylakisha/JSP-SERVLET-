package com.StudentInformationSystem;

import java.util.Map;

public class Attendance {

    private int percentage;
    private Map<String, Integer> monthlyRecord;

    public Attendance() {}

    public int getPercentage() { return percentage; }
    public void setPercentage(int percentage) { this.percentage = percentage; }

    public Map<String, Integer> getMonthlyRecord() { return monthlyRecord; }
    public void setMonthlyRecord(Map<String, Integer> monthlyRecord) { this.monthlyRecord = monthlyRecord; }
}
