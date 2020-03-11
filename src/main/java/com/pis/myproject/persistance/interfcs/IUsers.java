package com.pis.myproject.persistance.interfcs;

import com.pis.myproject.persistance.entities.Users;

import java.util.List;
import java.util.Optional;

public interface IUsers {

    List<Users> findAll();

    Optional<Users> findByUserId(Integer userId);

    List<Users> findByLogin(String login);

    void save(Users users);

}
