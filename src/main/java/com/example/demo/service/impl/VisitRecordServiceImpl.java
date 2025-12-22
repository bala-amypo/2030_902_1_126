// src/main/java/com/example/demo/service/impl/VisitRecordServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.entity.VisitRecord;
import com.example.demo.repository.VisitRecordRepository;
import com.example.demo.service.VisitRecordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
public class VisitRecordServiceImpl implements VisitRecordService {

    private static final Set<String> VALID = Set.of("STORE", "APP", "WEB");
    private final VisitRecordRepository repo;

    public VisitRecordServiceImpl(VisitRecordRepository repo) {
        this.repo = repo;
    }

    @Override
    public VisitRecord recordVisit(VisitRecord visit) {
        if (!VALID.contains(visit.getChannel()))
            throw new IllegalArgumentException("Invalid channel");
        return repo.save(visit);
    }

    @Override
    public VisitRecord getVisitById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Visit record not found"));
    }

    @Override
    public List<VisitRecord> getVisitsByCustomer(Long customerId) {
        return repo.findByCustomerId(customerId);
    }

    @Override
    public List<VisitRecord> getAllVisits() {
        return repo.findAll();
    }
}
