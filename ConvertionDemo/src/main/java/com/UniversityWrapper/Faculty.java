package com.UniversityWrapper;

import java.util.List;

public class Faculty {

    private String facultyId;
    private String name;
    private List<Department> departments;

    public Faculty() {}

    public String getFacultyId() { return facultyId; }
    public void setFacultyId(String facultyId) { this.facultyId = facultyId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Department> getDepartments() { return departments; }
    public void setDepartments(List<Department> departments) { this.departments = departments; }
}
