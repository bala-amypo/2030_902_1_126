package com.example.demo.model;

public class HistoryRecord {

    private Long customerId;
    private String customerName;
    private String oldTier;
    private String newTier;

    public HistoryRecord(Long customerId, String customerName, String oldTier, String newTier) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.oldTier = oldTier;
        this.newTier = newTier;
    }

    // Getters and setters
    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getOldTier() { return oldTier; }
    public void setOldTier(String oldTier) { this.oldTier = oldTier; }

    public String getNewTier() { return newTier; }
    public void setNewTier(String newTier) { this.newTier = newTier; }
}
