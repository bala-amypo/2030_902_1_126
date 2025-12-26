package com.example.demo.service.impl;

import com.example.demo.model.TierUpgradeRule;
import com.example.demo.service.TierUpgradeRuleService;

import java.util.*;

public class TierUpgradeRuleServiceImpl implements TierUpgradeRuleService {

    private final List<TierUpgradeRule> rules = new ArrayList<>();
    private long idCounter = 1;

    @Override
    public TierUpgradeRule createRule(TierUpgradeRule rule) {
        rule.setId(idCounter++);
        rules.add(rule);
        return rule;
    }

    @Override
    public TierUpgradeRule updateRule(Long id, TierUpgradeRule rule) {
        return rule;
    }

    @Override
    public List<TierUpgradeRule> getActiveRules() {
        return rules.stream()
                .filter(TierUpgradeRule::isActive)
                .toList();
    }

    @Override
    public Optional<TierUpgradeRule> getRule(String fromTier, String toTier) {
        return rules.stream()
                .filter(r -> r.getFromTier().equals(fromTier)
                        && r.getToTier().equals(toTier))
                .findFirst();
    }

    @Override
    public List<TierUpgradeRule> getAllRules() {
        return rules;
    }
}
