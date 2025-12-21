package com.example.demo.service;

import com.example.demo.entity.TierUpgradeRule;
import java.util.List;

public interface TierUpgradeRuleService {
    List<TierUpgradeRule> getActiveRules();
    TierUpgradeRule getRule(String fromTier, String toTier);
}
