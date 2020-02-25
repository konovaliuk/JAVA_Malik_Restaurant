package com.pis.myproject.persistance.interfcs;

import com.pis.myproject.persistance.entities.Menu;

import java.util.List;
import java.util.Optional;

public interface IMenu {

    List<Menu> findAll();

    List<Menu> findByTitle(String title);

    List<Menu> findByPrice(Integer price);

    Optional<Menu> findById(Integer menuId);

}
