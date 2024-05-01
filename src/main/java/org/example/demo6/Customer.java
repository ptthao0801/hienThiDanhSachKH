package org.example.demo6;

public class Customer {
    private String name;
    private String dob;
    private String address;
    private String img;

    // constructor
    public Customer(String name, String dob, String address, String img) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.img = img;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
