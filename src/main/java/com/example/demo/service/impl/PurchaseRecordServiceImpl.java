package com.example.demo.service.impl;

import com.example.demo.model.PurchaseRecord;
import com.example.demo.service.PurchaseRecordService;

import java.util.*;

public class PurchaseRecordServiceImpl implements PurchaseRecordService {

    private final List<PurchaseRecord> purchases = new ArrayList<>();
    private long idCounter = 1;

    @Override
    public PurchaseRecord recordPurchase(PurchaseRecord purchase) {
        if (purchase.getAmount() == null || purchase.getAmount() <= 0) {
            throw new IllegalArgumentException("Invalid purchase amount");
        }
        purchase.setId(idCounter++);
        purchases.add(purchase);
        return purchase;
    }

    @Override
    public List<PurchaseRecord> getPurchasesByCustomer(Long customerId) {
        return purchases;
    }

    @Override
    public List<PurchaseRecord> getAllPurchases() {
        return purchases;
    }

    @Override
    public Optional<PurchaseRecord> getPurchaseById(Long id) {
        return purchases.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }
}
