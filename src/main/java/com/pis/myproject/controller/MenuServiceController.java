package com.pis.myproject.controller;

import com.pis.myproject.persistance.entities.Menu;
import com.pis.myproject.persistance.entities.Users;
import com.pis.myproject.services.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class MenuServiceController {

    private final MenuServiceImpl menuService;

    @Autowired
    public MenuServiceController(MenuServiceImpl menuService) {
        this.menuService = menuService;
    }

    @GetMapping(value = "/menu")
    public ResponseEntity<Object>
    getMenu(){
        return new ResponseEntity<>(menuService.getMenu(), HttpStatus.OK);
    }

//    @GetMapping(value = "/users")
//    public ResponseEntity<Users> getUsers(){
//        return new ResponseEntity(menuService.getUsers(), HttpStatus.OK);
//    }

    @PostMapping(value = "/menu")
    public ResponseEntity<Object>
    createMenuItem(@RequestBody Menu menu){
        menuService.createMenuItem(menu);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }

    @PutMapping(value = "/menuupdate{id}")
    public ResponseEntity<Object>
    updateMenuItem(@PathVariable("id") Integer id, @RequestBody Menu menu) {

        menuService.updateFullMenuItem(id, menu);
        return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
    }

}
