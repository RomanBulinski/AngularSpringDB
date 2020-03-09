package com.buulean.angularspringdb.service;

import com.buulean.angularspringdb.model.Owner;
import com.buulean.angularspringdb.model.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();
    User delete(long id);

}
