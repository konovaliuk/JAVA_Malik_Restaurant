package com.pis.myproject.services;

import com.pis.myproject.persistance.entities.Menu;
import com.pis.myproject.persistance.entities.Users;
import com.pis.myproject.persistance.interfcs.IMenu;
import com.pis.myproject.persistance.interfcs.IUsers;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Transactional
@Service
@AllArgsConstructor
public class MenuServiceImpl {

    @Autowired
    private IMenu iMenu;

    public void createMenuItem(Menu menu) {
        iMenu.save(menu);
    }

    public void updateFullMenuItem(Integer id, Menu menu) {
        Menu menuu = iMenu.findById(id).orElseThrow();
        if (menu.getTitle() != null){
            menuu.setTitle(menu.getTitle());
        }
        if(menu.getPrice() != null){
            menuu.setPrice(menu.getPrice());
        }
    }

    public void deleteMenuItem(Integer id) {
    iMenu.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Menu> getMenu() {
        return iMenu.findAll();
    }

}
