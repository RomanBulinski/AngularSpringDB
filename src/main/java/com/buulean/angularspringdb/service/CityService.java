package com.buulean.angularspringdb.service;

import com.buulean.angularspringdb.model.City;
import com.buulean.angularspringdb.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {
        List<City> cities = (List<City>) repository.findAll();
        return cities;
    }
}
