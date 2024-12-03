package com.example.demo.entities;

import jakarta.persistence.*;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer stock ; 

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false) 
    private Category category ;

    public Product(String name, String description, Double price, Integer stock, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Double getPrice() {
        return price;
    }
    public Integer getStock() {
        return stock;
    }
    public Category getCategory() {
        return category;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }

}
