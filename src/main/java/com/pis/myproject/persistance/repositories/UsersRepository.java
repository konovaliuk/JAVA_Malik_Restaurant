package com.pis.myproject.persistance.repositories;

import com.pis.myproject.persistance.entities.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends CrudRepository<Users, Integer> {

    public List<Users> findAll();

    public Optional<Users> findByUserId(Integer userId);

    public List<Users> findByLogin(String login);

}
