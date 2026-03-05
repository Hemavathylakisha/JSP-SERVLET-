package com.EmployeeManagement;

import java.util.List;

public class Company {

    private String company;          // must match JSON key
    private List<Employee> employees;

    public Company() {}              // default constructor required

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}