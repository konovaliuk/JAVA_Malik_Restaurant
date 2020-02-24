package com.pis.myproject.persistance.springdata;

import com.pis.myproject.persistance.entities.Menu;
import com.pis.myproject.persistance.interfcs.IMenu;
import com.pis.myproject.persistance.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("MenuService")
@Repository
@Transactional
public class MenuImpl implements IMenu {

    @Autowired
    private MenuRepository menuRepository;

    @Transactional(readOnly = true)
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Menu> findByTitle(String title) {
        return menuRepository.findByTitle(title);
    }

    @Transactional(readOnly = true)
    public List<Menu> findByPrice(Integer price) {
        return menuRepository.findByPrice(price);
    }

}
