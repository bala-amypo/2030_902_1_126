package com.example.demo.service.impl;

import com.example.demo.model.VisitRecord;
import com.example.demo.service.VisitRecordService;

import java.util.*;

public class VisitRecordServiceImpl implements VisitRecordService {

    private final List<VisitRecord> visits = new ArrayList<>();
    private long idCounter = 1;

    @Override
    public VisitRecord recordVisit(VisitRecord visit) {
        List<String> allowed = List.of("STORE", "APP", "WEB");
        if (!allowed.contains(visit.getChannel())) {
            throw new IllegalArgumentException("Invalid visit channel");
        }
        visit.setId(idCounter++);
        visits.add(visit);
        return visit;
    }

    @Override
    public List<VisitRecord> getVisitsByCustomer(Long customerId) {
        return visits;
    }

    @Override
    public List<VisitRecord> getAllVisits() {
        return visits;
    }

    @Override
    public Optional<VisitRecord> getVisitById(Long id) {
        return visits.stream()
                .filter(v -> v.getId().equals(id))
                .findFirst();
    }
}
