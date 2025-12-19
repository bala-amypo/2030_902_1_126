package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "purchase_records")
public class PurchaseRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private Double amount;
    private LocalDate purchaseDate;
    private String storeLocation;

    public PurchaseRecord() {}

    public PurchaseRecord(Long customerId, Double amount, LocalDate purchaseDate, String storeLocation) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        this.customerId = customerId;
        this.amount = amount;
        this.purchaseDate = purchaseDate;
        this.storeLocation = storeLocation;
    }
    // getters/setters
}