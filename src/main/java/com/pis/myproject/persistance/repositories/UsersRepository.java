package com.pis.myproject.persistance.repositories;

import com.pis.myproject.persistance.entities.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<Users, Integer> {

    List<Users> findByLogin(String login);

}
