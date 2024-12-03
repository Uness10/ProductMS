package com.example.demo.entities;

import jakarta.persistence.*;
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    
    public String getName(){
        return name;
    }
}
