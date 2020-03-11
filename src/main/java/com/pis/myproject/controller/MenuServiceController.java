package com.pis.myproject.controller;

import com.pis.myproject.persistance.entities.Menu;
import com.pis.myproject.persistance.entities.Recipt;
import com.pis.myproject.persistance.entities.Users;
import com.pis.myproject.persistance.interfcs.IUsertype;
import com.pis.myproject.persistance.repositories.UsertypeRepository;
import com.pis.myproject.services.MenuServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class MenuServiceController {

    private final MenuServiceImpl menuService;
    private final IUsertype iUsertype;


    @GetMapping(value = "/menu")
    public ResponseEntity<?> getMenu() {
        return ResponseEntity.ok(menuService.getMenu());// new ResponseEntity<>(menuService.getMenu(), HttpStatus.OK);
    }

    @PostMapping(value = "/meal")
    public ResponseEntity<Object>
    addMeal(@RequestParam Integer userId, Integer adminId, @RequestBody List<Menu> meal){
        menuService.addMeal(userId, adminId, meal);
        return new ResponseEntity<>("Meal added successfully", HttpStatus.CREATED);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<Users>
    getUsers(){
        return new ResponseEntity(menuService.getUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "/admins")
    public ResponseEntity<List<Users>>
    getAdmins(){
        return new ResponseEntity(iUsertype.findByType("Administrator"), HttpStatus.OK);
    }
    @PostMapping(value = "/menu")
    public ResponseEntity<Object>
    createMenuItem(@RequestBody Menu menu) {
        menuService.createMenuItem(menu);
        return new ResponseEntity<>("Menu item is created successfully", HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/menu/delete/{id}")
    public ResponseEntity<Object>
    deleteMenuItem(@PathVariable("id") Integer id) {
        menuService.deleteMenuItem(id);
        return new ResponseEntity<>("Menu item is deleted successfully" + "\n" + menuService.getMenu(), HttpStatus.OK);
    }

    @PutMapping(value = "/menu/update/{id}")
    public ResponseEntity<Object>
    updateMenuItem(@PathVariable("id") Integer id, @RequestBody Menu menu) {

        menuService.updateFullMenuItem(id, menu);
        return new ResponseEntity<>("Menu item is updated successsfully", HttpStatus.OK);
    }

}
