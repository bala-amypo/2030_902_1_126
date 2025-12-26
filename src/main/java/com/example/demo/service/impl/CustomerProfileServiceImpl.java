package com.example.demo.service.impl;

import com.example.demo.model.CustomerProfile;
import com.example.demo.service.CustomerProfileService;

import java.time.LocalDateTime;
import java.util.*;

public class CustomerProfileServiceImpl implements CustomerProfileService {

    private final Map<Long, CustomerProfile> store = new HashMap<>();
    private long idCounter = 1;

    @Override
    public CustomerProfile createCustomer(CustomerProfile customer) {
        customer.setId(idCounter++);
        customer.setCreatedAt(LocalDateTime.now());
        store.put(customer.getId(), customer);
        return customer;
    }

    @Override
    public CustomerProfile getCustomerById(Long id) {
        CustomerProfile customer = store.get(id);
        if (customer == null) {
            throw new NoSuchElementException("Customer not found");
        }
        return customer;
    }

    @Override
    public Optional<CustomerProfile> findByCustomerId(String customerId) {
        return store.values()
                .stream()
                .filter(c -> c.getCustomerId().equals(customerId))
                .findFirst();
    }

    @Override
    public List<CustomerProfile> getAllCustomers() {
        return new ArrayList<>(store.values());
    }

    @Override
    public CustomerProfile updateTier(Long id, String newTier) {
        CustomerProfile customer = getCustomerById(id);
        customer.setCurrentTier(newTier);
        return customer;
    }

    @Override
    public CustomerProfile updateStatus(Long id, boolean active) {
        CustomerProfile customer = getCustomerById(id);
        customer.setActive(active);
        return customer;
    }
}
