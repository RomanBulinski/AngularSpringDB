package com.buulean.angularspringdb.service;

import com.buulean.angularspringdb.model.Owner;
import com.buulean.angularspringdb.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService implements IOwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public List<Owner> findAll() {
        return (List<Owner>) ownerRepository.findAll();
    }

    @Override
    public Owner delete(long id) {
        Owner owner = ownerRepository.findById(id).get();
        if(owner != null){
            ownerRepository.delete(owner);
        }
        return owner;
    }
}
