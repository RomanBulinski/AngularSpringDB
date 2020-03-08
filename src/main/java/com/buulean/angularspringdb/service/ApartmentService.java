package com.buulean.angularspringdb.service;

import com.buulean.angularspringdb.model.Apartment;
import com.buulean.angularspringdb.model.Owner;
import com.buulean.angularspringdb.repository.ApartmentRepository;
import com.buulean.angularspringdb.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService implements IApartmentService{

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Override
    public List<Apartment> findAll() {
        return (List<Apartment>) apartmentRepository.findAll();
    }
}
