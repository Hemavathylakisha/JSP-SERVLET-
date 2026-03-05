package com.UniversityWrapper;

import java.util.List;

public class Student {

    private String studentId;
    private String name;
    private List<String> enrolledCourses;

    public Student() {}

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<String> getEnrolledCourses() { return enrolledCourses; }
    public void setEnrolledCourses(List<String> enrolledCourses) { this.enrolledCourses = enrolledCourses; }
}
