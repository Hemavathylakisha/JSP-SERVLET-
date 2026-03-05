package com.Complex4University;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Marks {

    private int midterm;

    @JsonProperty("final")
    private int finalMarks;

    public Marks() {}

    public int getMidterm() {
        return midterm;
    }

    public void setMidterm(int midterm) {
        this.midterm = midterm;
    }

    public int getFinalMarks() {
        return finalMarks;
    }

    public void setFinalMarks(int finalMarks) {
        this.finalMarks = finalMarks;
    }
}