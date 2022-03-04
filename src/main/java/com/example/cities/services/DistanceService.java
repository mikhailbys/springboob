package com.example.cities.services;

import com.example.cities.models.City;
import com.example.cities.models.Distance;
import com.example.cities.repositories.DistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistanceService {

    @Autowired
    private DistanceRepository distanceRepository;
    private double Radius;

    public List<Distance> list() {
        return distanceRepository.findAll();
    }

    public Double crowFlight(City city1, City city2) {
        double lat1 = city1.getLatitude();
        double lat2 = city2.getLatitude();
        double lon1 = city1.getLongitude();
        double lon2 = city2.getLongitude();
        double dLat = Math.toRadians(lat2-lat1);
        double dLon = Math.toRadians(lon2-lon1);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon/2) * Math.sin(dLon/2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return Radius * c;
    }
}
