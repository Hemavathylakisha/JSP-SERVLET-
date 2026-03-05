package com.Onlinelearningplatform;

import java.util.List;

public class Course {

    private String courseId;
    private String title;
    private String duration;
    private Instructor instructor;
    private List<Module> modules;

    public Course() {}

    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    public List<Module> getModules() { return modules; }
    public void setModules(List<Module> modules) { this.modules = modules; }
}
