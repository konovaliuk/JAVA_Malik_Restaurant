package com.pis.myproject.persistance.repositories;

import com.pis.myproject.persistance.entities.Usertype;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsertypeRepository extends CrudRepository<Usertype, Integer> {

    List<Usertype> findByType(String type);

}
