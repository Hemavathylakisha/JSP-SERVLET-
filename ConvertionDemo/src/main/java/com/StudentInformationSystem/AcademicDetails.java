package com.StudentInformationSystem;

import java.util.List;

public class AcademicDetails {

    private String enrolledProgram;
    private int year;
    private List<Subject> subjects;
    private Attendance attendance;

    public AcademicDetails() {}

    public String getEnrolledProgram() { return enrolledProgram; }
    public void setEnrolledProgram(String enrolledProgram) { this.enrolledProgram = enrolledProgram; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public List<Subject> getSubjects() { return subjects; }
    public void setSubjects(List<Subject> subjects) { this.subjects = subjects; }

    public Attendance getAttendance() { return attendance; }
    public void setAttendance(Attendance attendance) { this.attendance = attendance; }
}
