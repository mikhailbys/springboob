package com.example.cities.controllers;

import com.example.cities.models.City;
import com.example.cities.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping(name = "/", produces = "application/json")
    public List<City> getCities() {
        return cityService.list();
    }

}
