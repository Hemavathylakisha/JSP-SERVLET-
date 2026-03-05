package com.UniversityWrapper;

import java.util.List;

public class University {

    private String name;
    private int established;
    private Address address;
    private List<Faculty> faculties;
    private List<Student> students;

    public University() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEstablished() { return established; }
    public void setEstablished(int established) { this.established = established; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public List<Faculty> getFaculties() { return faculties; }
    public void setFaculties(List<Faculty> faculties) { this.faculties = faculties; }

    public List<Student> getStudents() { return students; }
    public void setStudents(List<Student> students) { this.students = students; }
}
