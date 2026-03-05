package com.StudentInformationSystem;

public class PersonalInfo {

    private String firstName;
    private String lastName;
    private String dob;
    private Contact contact;

    public PersonalInfo() {}

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public Contact getContact() { return contact; }
    public void setContact(Contact contact) { this.contact = contact; }
}
