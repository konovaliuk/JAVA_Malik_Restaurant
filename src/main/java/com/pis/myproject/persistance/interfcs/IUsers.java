package com.pis.myproject.persistance.interfcs;

import com.pis.myproject.persistance.entities.Users;

import java.util.List;
import java.util.Optional;

public interface IUsers {

    public List<Users> findAll();

    public Optional<Users> findByUserId(Integer userId);

    public List<Users> findByLogin(String login);

}
