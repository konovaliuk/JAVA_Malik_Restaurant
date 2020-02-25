package com.pis.myproject;

import com.pis.myproject.persistance.entities.Menu;
import com.pis.myproject.persistance.entities.Users;
import com.pis.myproject.persistance.interfcs.IMenu;
import com.pis.myproject.persistance.interfcs.IUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyprojectApplication {

    private static final Logger log = LoggerFactory.getLogger(MyprojectApplication.class);

    @Autowired
    private IMenu iMenu;
    @Autowired
    private IUsers iUsers;

    public static void main(String[] args) {
        SpringApplication.run(MyprojectApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {

            // save a few menu_pos
            iUsers.save(new Users(1,"Abra", "Kadabra", 2, "banana", "password"));
            // fetch all menu_pos
            log.info("Menu_pos found with findAll():");
            log.info("-------------------------------");
            for (Menu menu_items : iMenu.findAll()) {
                log.info(menu_items.toString());
            }
            log.info("");
            log.info("Users found with findAll():");
            log.info("-------------------------------");
            for (Users users_items : iUsers.findAll()) {
                log.info(users_items.toString());
            }
            log.info("");
            // fetch an individual menu_pos by ID
            Menu menu_pos = iMenu.findById(3).orElseThrow();
            log.info("Menu_pos found with findById(3):");
            log.info("--------------------------------");
            log.info(menu_pos.toString());
            log.info("");

            //fetch menu_pos by price
            log.info("Menu_pos found with findByPrice(100):");
            log.info("-------------------------------");
            for (Menu menu1 : iMenu.findByPrice(100)) {
                log.info(menu1.toString());
            }
            log.info("");
            iMenu.findByPrice(100).forEach(menu_pos1->{
                log.info(menu_pos1.toString());
            });
            log.info("");

            // fetch menu_pos by title
            log.info("Menu_pos found with findByTitle('Complex1'):");
            log.info("--------------------------------------------");
            iMenu.findByTitle("Complex1").forEach(menu_pos1-> {
                log.info(menu_pos1.toString());
            });

            log.info("");
        };
    }

}
