package com.example.demo.entities;

import jakarta.persistence.*;
@Entity
public class Client extends User {

    @Column(nullable = false)
    private String phone ; 
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String postalCode;
    @Column(nullable = false)
    private String country;

    public Client(String name, String password, String email, String phone, String city, String postalCode,String country) {
        super(name, password, email);
        this.phone = phone;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }
    public String getPhone() {
        return phone;
    }
    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

}
