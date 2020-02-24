package com.pis.myproject.persistance.repositories;

import java.util.List;
import java.util.Optional;

import com.pis.myproject.persistance.entities.Menu;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<Menu, Integer> {

    public List<Menu> findAll();
    public List<Menu> findByTitle(String title);
    public List<Menu> findByPrice(Integer price);
    public Optional<Menu> findById(Integer menuId);

}
