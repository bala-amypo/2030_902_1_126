package com.example.demo.controller;

import com.example.demo.service.TierUpgradeEngineService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TierUpgradeEngineController {

    private final TierUpgradeEngineService service;

    public TierUpgradeEngineController(TierUpgradeEngineService service) {
        this.service = service;
    }

    @GetMapping("/history")
    public Object getHistory() {
        return service.getAllHistory();
    }
}
