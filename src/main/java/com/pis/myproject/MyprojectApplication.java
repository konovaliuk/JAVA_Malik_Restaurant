package com.pis.myproject;

import com.pis.myproject.persistance.entities.Menu;
import com.pis.myproject.persistance.entities.Users;
import com.pis.myproject.persistance.interfcs.IMenu;
import com.pis.myproject.persistance.repositories.MenuRepository;
import com.pis.myproject.persistance.repositories.UsersRepository;
//import com.pis.myproject.persistance.springdata.MenuImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MyprojectApplication {

    private static final Logger log = LoggerFactory.getLogger(MyprojectApplication.class);

    @Autowired
    private IMenu iMenu;

    public static void main(String[] args) {
        SpringApplication.run(MyprojectApplication.class, args);
    }
//    private static void listMenu(List<Menu> menu_pos){
//        System.out.println("");
//        System.out.println("Listing menu positions");
//        for(Menu menu: menu_pos){/.
//            System.out.println(menu);
//            System.out.println();
//        }
//    }


    @Bean
    public CommandLineRunner demo(MenuRepository repository, UsersRepository user_rep) {
        return (args) -> {

//            List<Menu> menu = menuService.findAll();
//            listMenu(menu);
            // save a few menu_pos
//            repository.save(new Menu("Jack", 1299));
//            repository.save(new Menu("Chloe", 100));
//            user_rep.save(new Users(1,"Timur", "Malik", 1, "s", "s"));
//            user_rep.save(new Users(1,"Tsss", "Maaaa", 2, "s", "s"));
//            repository.save(new Menu("Kim", 200));
//            repository.save(new Menu("David", 300));
//            repository.save(new Menu("Michelle", 350));

            // fetch all menu_pos
            log.info("Menu_pos found with findAll():");
            log.info("-------------------------------");
            for (Menu menu_items : iMenu.findAll()) {
                log.info(menu_items.toString());
            }
            log.info("");
            log.info("Users found with findAll():");
            log.info("-------------------------------");
            for (Users users_items : user_rep.findAll()) {
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
            repository.findByPrice(100).forEach(menu_pos1->{
                log.info(menu_pos1.toString());
            });
            log.info("");

            // fetch menu_pos by title
            log.info("Menu_pos found with findByTitle('Complex1'):");
            log.info("--------------------------------------------");
            repository.findByTitle("Complex1").forEach(menu_pos1-> {
                log.info(menu_pos1.toString());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
        };
    }

}
