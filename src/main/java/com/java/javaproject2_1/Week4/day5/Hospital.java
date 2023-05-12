package com.java.javaproject2_1.Week4.day5;

public class Hospital {
    private String name;
    private String phoneNumber;
    private Address address;

    public Hospital(String name, String phoneNumber, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }
}
