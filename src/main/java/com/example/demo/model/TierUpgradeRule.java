package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tier_upgrade_rules")
public class TierUpgradeRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fromTier;
    private String toTier;
    private Integer minVisits;
    private Float minSpend;
    private Boolean active;

    public TierUpgradeRule() {}

    public TierUpgradeRule(String fromTier, String toTier, Integer minVisits, Float minSpend, Boolean active) {
        this.fromTier = fromTier;
        this.toTier = toTier;
        this.minVisits = minVisits;
        this.minSpend = minSpend;
        this.active = active;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFromTier() { return fromTier; }
    public void setFromTier(String fromTier) { this.fromTier = fromTier; }

    public String getToTier() { return toTier; }
    public void setToTier(String toTier) { this.toTier = toTier; }

    public Integer getMinVisits() { return minVisits; }
    public void setMinVisits(Integer minVisits) { this.minVisits = minVisits; }

    public Float getMinSpend() { return minSpend; }
    public void setMinSpend(Float minSpend) { this.minSpend = minSpend; }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
