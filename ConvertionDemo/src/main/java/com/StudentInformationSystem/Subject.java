package com.StudentInformationSystem;

public class Subject {

    private String subjectCode;
    private String subjectName;
    private Marks marks;

    public Subject() {}

    public String getSubjectCode() { return subjectCode; }
    public void setSubjectCode(String subjectCode) { this.subjectCode = subjectCode; }

    public String getSubjectName() { return subjectName; }
    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }

    public Marks getMarks() { return marks; }
    public void setMarks(Marks marks) { this.marks = marks; }
}
