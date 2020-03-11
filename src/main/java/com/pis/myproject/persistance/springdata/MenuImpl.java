package com.pis.myproject.persistance.springdata;

import com.pis.myproject.persistance.entities.Menu;
import com.pis.myproject.persistance.interfcs.IMenu;
import com.pis.myproject.persistance.repositories.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository("MenuService")
@Transactional
@AllArgsConstructor
public class MenuImpl implements IMenu {

    private final MenuRepository menuRepository;

    public List<Menu> findAll() {
        return (List<Menu>) menuRepository.findAll();
    }

    public List<Menu> findByTitle(String title) {
        return menuRepository.findByTitle(title);
    }

    public List<Menu> findByPrice(Integer price) {
        return menuRepository.findByPrice(price);
    }

    public Optional<Menu> findById(Integer menuId) { return menuRepository.findById(menuId); }

    @Override
    public List<Menu> findByTitleAndPrice(String title, Integer price) {
        return menuRepository.findByTitleAndPrice(title, price);
    }

    @Override
    public void deleteById(Integer menuId) {
        menuRepository.deleteById(menuId);
    }

    @Override
    public Menu save(Menu menu) {
        return menuRepository.save(menu);
    }

}
