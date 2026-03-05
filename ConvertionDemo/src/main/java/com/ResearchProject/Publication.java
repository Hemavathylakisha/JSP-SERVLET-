package com.ResearchProject;

public class Publication {

    private String title;
    private String journal;
    private int year;
    private String doi;

    public Publication() {}

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getJournal() { return journal; }
    public void setJournal(String journal) { this.journal = journal; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getDoi() { return doi; }
    public void setDoi(String doi) { this.doi = doi; }
}
