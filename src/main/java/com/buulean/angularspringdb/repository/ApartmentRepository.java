package com.buulean.angularspringdb.repository;

import com.buulean.angularspringdb.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
//public interface OwnerRepository extends CrudRepository<Owner, Long> {

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {




}
