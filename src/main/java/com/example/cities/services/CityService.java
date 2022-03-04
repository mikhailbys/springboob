package com.example.cities.services;

import com.example.cities.models.City;
import com.example.cities.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> list() {
        return cityRepository.findAll();
    }

}
