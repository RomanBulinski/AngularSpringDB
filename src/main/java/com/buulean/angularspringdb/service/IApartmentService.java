package com.buulean.angularspringdb.service;

import com.buulean.angularspringdb.model.Apartment;
import java.util.List;

public interface IApartmentService {

    List<Apartment> findAll();
}
