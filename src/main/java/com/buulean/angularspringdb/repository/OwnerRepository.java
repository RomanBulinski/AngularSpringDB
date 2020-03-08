package com.buulean.angularspringdb.repository;

import com.buulean.angularspringdb.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
//public interface OwnerRepository extends CrudRepository<Owner, Long> {

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    void delete(Owner owner);


}
