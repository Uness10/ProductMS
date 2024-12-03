package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Admin extends User {  

    @Column(nullable = false) 
    private String adminRole ;

    public Admin(String name, String password, String email, String adminRole) {
        super(name, password, email);
        this.adminRole = adminRole;
    }
    public String getAdminRole() {
        return adminRole;
    }
    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }
}
