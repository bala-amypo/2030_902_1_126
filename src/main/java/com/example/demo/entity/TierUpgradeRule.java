// TierUpgradeRule.java
package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(
    name = "tier_upgrade_rules",
    uniqueConstraints = @UniqueConstraint(columnNames = {"fromTier", "toTier"})
)
public class TierUpgradeRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fromTier;

    @Column(nullable = false)
    private String toTier;

    @Column(nullable = false)
    private Double minSpend;

    @Column(nullable = false)
    private Integer minVisits;

    @Column(nullable = false)
    private Boolean active = true;

    public TierUpgradeRule() {
    }

    public TierUpgradeRule(String fromTier,
                           String toTier,
                           Double minSpend,
                           Integer minVisits,
                           Boolean active) {
        if (minSpend < 0 || minVisits < 0) {
            throw new IllegalArgumentException("minSpend and minVisits must be >= 0");
        }
        this.fromTier = fromTier;
        this.toTier = toTier;
        this.minSpend = minSpend;
        this.minVisits = minVisits;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getFromTier() {
        return fromTier;
    }

    public void setFromTier(String fromTier) {
        this.fromTier = fromTier;
    }

    public String getToTier() {
        return toTier;
