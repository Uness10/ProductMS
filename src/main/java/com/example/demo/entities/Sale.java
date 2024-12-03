package com.example.demo.entities;
import java.util.Date;

import jakarta.persistence.*;
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double totalPrice;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(nullable = false)
    private boolean isRefunded;

    public Sale(Product product, Client client, Integer quantity, Date date) {
        this.product = product;
        this.client = client;
        this.quantity = quantity;
        this.date = date;
        this.totalPrice = product.getPrice() * quantity;
    }

    public void refundSale() {
        this.isRefunded = true;
    }
}
