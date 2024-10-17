package com.java.practice.generic.people;

public class Person {

    public Person(String lastName, String city) {
        this.lastName = lastName;
        this.city = city;
    }

    private String firstName;
    private String lastName;
    private String city;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

}
