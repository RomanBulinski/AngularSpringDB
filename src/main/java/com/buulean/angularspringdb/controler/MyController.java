package com.buulean.angularspringdb.controler;

import com.buulean.angularspringdb.model.Apartment;
import com.buulean.angularspringdb.model.City;
import com.buulean.angularspringdb.model.Owner;
import com.buulean.angularspringdb.repository.OwnerRepository;
import com.buulean.angularspringdb.service.ApartmentService;
import com.buulean.angularspringdb.service.ICityService;
import com.buulean.angularspringdb.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/*")
public class MyController {

    @Autowired
    private ICityService cityService;
    @Autowired
    private OwnerService ownerService;
    @Autowired
    private ApartmentService apartmentService;
    @Autowired
    private OwnerRepository ownerRepository;


    @GetMapping("/showCities")
    public String findCities(Model model) {
        List<City> cities = (List<City>) cityService.findAll();
        model.addAttribute("cities", cities);
        return "showCities";
    }

    @GetMapping("/apartments")
    public List<Apartment> findApartments(){
        List<Apartment> apartment = (List<Apartment>) apartmentService.findAll();
        return apartment;
    }

}
