package com.buulean.angularspringdb.service;

import com.buulean.angularspringdb.model.Owner;
import java.util.List;

public interface IOwnerService {

    List<Owner> findAll();

    Owner delete(long id);

}
