package com.buulean.angularspringdb.repository;

import com.buulean.angularspringdb.model.Owner;
import com.buulean.angularspringdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void delete(User user);

}
