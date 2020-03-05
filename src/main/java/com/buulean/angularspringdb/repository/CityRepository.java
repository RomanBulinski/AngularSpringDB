package com.buulean.angularspringdb.repository;

import com.buulean.angularspringdb.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
