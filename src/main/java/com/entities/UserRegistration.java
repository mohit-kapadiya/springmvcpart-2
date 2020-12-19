package com.entities;

import java.util.Date;
import java.util.List;

public class UserRegistration {
    private String name;
    private Long id;
    private Date bDate;
    private List<String> course;
    private String gender;
    private String type;
    private Address address;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Date getbDate() {
        return bDate;
    }

    public List<String> getCourse() {
        return course;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", bDate=" + bDate +
                ", course=" + course +
                ", gender='" + gender + '\'' +
                ", type='" + type + '\'' +
                ", address=" + address +
                '}';
    }
}
