package com.example.demo.service;

import com.example.demo.model.PurchaseRecord;
import java.util.*;

public interface PurchaseRecordService {
    PurchaseRecord recordPurchase(PurchaseRecord purchase);
    List<PurchaseRecord> getPurchasesByCustomer(Long customerId);
    List<PurchaseRecord> getAllPurchases();
    Optional<PurchaseRecord> getPurchaseById(Long id);
}
