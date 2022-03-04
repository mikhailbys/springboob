package com.example.cities.controllers;

import com.example.cities.models.Distance;
import com.example.cities.services.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("distances")
public class DistanceController {

    @Autowired
    private DistanceService distanceService;

    @GetMapping(name = "/", produces = "application/json")
    public List<Distance> getDistances() {
        return distanceService.list();
    }

}

