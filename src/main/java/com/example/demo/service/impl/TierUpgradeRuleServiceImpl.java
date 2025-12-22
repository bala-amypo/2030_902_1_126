package com.example.demo.service.impl;

import com.example.demo.entity.TierUpgradeRule;
import com.example.demo.repository.TierUpgradeRuleRepository;
import com.example.demo.service.TierUpgradeRuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TierUpgradeRuleServiceImpl implements TierUpgradeRuleService {

    private final TierUpgradeRuleRepository repository;

    public TierUpgradeRuleServiceImpl(TierUpgradeRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TierUpgradeRule> getActiveRules() {
        return repository.findByActiveTrue();
    }

    @Override
    public TierUpgradeRule getRule(String fromTier, String toTier) {
        return repository.findByFromTierAndToTier(fromTier, toTier);
    }
}
