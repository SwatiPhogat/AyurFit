package com.example.AyurFit.Controller;

import com.example.AyurFit.Model.HealthCompanionApp;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/HealthData")
public class HCAppController {
    private List<HealthCompanionApp> healthDataList = new ArrayList<>();
    @PostMapping
    public String createHealthData(@RequestBody HealthCompanionApp healthData) {
        healthDataList.add(healthData);
        return "Health data created: " + healthData.toString();
    }
    @GetMapping
    public List<HealthCompanionApp> getHealthData() {
        return healthDataList;
    }
}