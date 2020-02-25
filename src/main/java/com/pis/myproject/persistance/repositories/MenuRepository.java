package com.pis.myproject.persistance.repositories;

import java.util.List;
import java.util.Optional;

import com.pis.myproject.persistance.entities.Menu;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<Menu, Integer> {

    List<Menu> findAll();
    List<Menu> findByTitle(String title);
    List<Menu> findByPrice(Integer price);

}
