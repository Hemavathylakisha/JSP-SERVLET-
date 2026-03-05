package com.InsurancePolicy;

public class PolicyHolder {

    private String name;
    private int age;
    private String gender;
    private Contact contact;
    private Address address;

    public PolicyHolder() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public Contact getContact() { return contact; }
    public void setContact(Contact contact) { this.contact = contact; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}
