package com.pis.myproject.services;

import com.pis.myproject.persistance.entities.Menu;
import com.pis.myproject.persistance.entities.Orders;
import com.pis.myproject.persistance.entities.Recipt;
import com.pis.myproject.persistance.entities.Users;
import com.pis.myproject.persistance.interfcs.IMenu;
import com.pis.myproject.persistance.interfcs.IOrders;
import com.pis.myproject.persistance.interfcs.IRecipt;
import com.pis.myproject.persistance.interfcs.IUsers;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Transactional
@Service
@AllArgsConstructor
public class MenuServiceImpl {

    private IUsers iUsers;
    private IMenu iMenu;
    private IOrders iOrders;
    private IRecipt iRecipt;

    public Menu createMenuItem(Menu menu) {
        return iMenu.save(menu);
    }

    public void addMeal(Integer userId, Integer adminId, List<Menu> meal){
        int Sum = 0;
        Users client = iUsers.findByUserId(userId).orElseThrow();
        Users admin = iUsers.findByUserId(adminId).orElseThrow();
        Recipt recipt = new Recipt();
        for(Menu mealPos : meal){
            Sum += mealPos.getPrice();
        }
        recipt.setClient(client);
        recipt.setAdmin(admin);
        recipt.setSum(Sum);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        recipt.setReciptDate(timestamp);
        iRecipt.save(recipt);
        for(Menu mealPos : meal){
            Orders order = new Orders();
            order.setMenu(mealPos);
            order.setRecipt(recipt);
            iOrders.save(order);
        }
    }

    @Transactional(readOnly = true)
    public List<Users> getUsers(){
        return iUsers.findAll();
    }

    public void updateFullMenuItem(Integer id, Menu menu) {
        Menu menu1 = iMenu.findById(id).orElseThrow();
        if (menu.getTitle() != null){
            menu1.setTitle(menu.getTitle());
        }
        if(menu.getPrice() != null){
            menu1.setPrice(menu.getPrice());
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
