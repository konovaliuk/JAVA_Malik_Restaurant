package com.pis.myproject.persistance.interfcs;

import com.pis.myproject.persistance.entities.Menu;

import java.util.List;

public interface IMenu {

    public List<Menu> findAll();

    public List<Menu> findByTitle(String title);

    public List<Menu> findByPrice(Integer price);

}
