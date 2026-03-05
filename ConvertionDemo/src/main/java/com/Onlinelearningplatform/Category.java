package com.Onlinelearningplatform;

import java.util.List;

public class Category {

    private String name;
    private List<Course> courses;

    public Category() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
