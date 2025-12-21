package com.example.demo.controller;

import com.example.demo.service.TierUpgradeEngineService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TierUpgradeEngineController {

    private final TierUpgradeEngineService service;

    public TierUpgradeEngineController(TierUpgradeEngineService service) {
        this.service = service;
    }

    // Controller endpoints here
}
