package com.buulean.angularspringdb.controler;

import com.buulean.angularspringdb.model.Apartment;
import com.buulean.angularspringdb.model.City;
import com.buulean.angularspringdb.model.Owner;
import com.buulean.angularspringdb.repository.OwnerRepository;
import com.buulean.angularspringdb.service.ApartmentService;
import com.buulean.angularspringdb.service.ICityService;
import com.buulean.angularspringdb.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping()
    public List<Owner> findOwners(){
        List<Owner> owners = (List<Owner>) ownerService.findAll();
        return owners;
    }

    @GetMapping(path = {"/{id}"})
    public Owner findOne(@PathVariable("id") int id){
        return ownerService.findById(id);
    }

    @DeleteMapping(path ={"/{id}"})
    public Owner delete(@PathVariable("id") int id) {
        return ownerService.delete(id);
    }

    @PostMapping()
    public Owner create(@RequestBody Owner owner) {
        return ownerService.create(owner);
    }

    @PutMapping
    public Owner update(@RequestBody Owner owner){
        return ownerService.update(owner);
    }



}
