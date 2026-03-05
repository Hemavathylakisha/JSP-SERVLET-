package com.UniversityWrapper;

import java.util.List;

public class Department {

    private String deptId;
    private String name;
    private List<Course> courses;

    public Department() {}

    public String getDeptId() { return deptId; }
    public void setDeptId(String deptId) { this.deptId = deptId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Course> getCourses() { return courses; }
    public void setCourses(List<Course> courses) { this.courses = courses; }
}
