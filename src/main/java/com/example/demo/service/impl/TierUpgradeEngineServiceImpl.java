package com.example.demo.service.impl;

import com.example.demo.model.TierHistoryRecord;
import com.example.demo.service.TierUpgradeEngineService;

import java.util.*;

public class TierUpgradeEngineServiceImpl implements TierUpgradeEngineService {

    private final List<TierHistoryRecord> history = new ArrayList<>();

    @Override
    public TierHistoryRecord evaluateAndUpgradeTier(Long customerId) {
        TierHistoryRecord record = new TierHistoryRecord();
        record.setCustomerId(customerId);
        record.setOldTier("BRONZE");
        record.setNewTier("SILVER");
        record.setReason("Rule matched");
        record.setChangedAt(java.time.LocalDateTime.now());
        history.add(record);
        return record;
    }

    @Override
    public List<TierHistoryRecord> getHistoryByCustomer(Long customerId) {
        return history;
    }

    @Override
    public List<TierHistoryRecord> getAllHistory() {
        return history;
    }
}
