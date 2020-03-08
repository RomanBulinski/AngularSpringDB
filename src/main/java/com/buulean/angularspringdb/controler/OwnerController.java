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

    @DeleteMapping(path ={"/{id}"})
    public Owner delete(@PathVariable("id") int id) {
        return ownerService.delete(id);
    }


}
