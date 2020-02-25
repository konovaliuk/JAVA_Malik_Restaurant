package com.pis.myproject.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "menu", schema = "restaurant")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer menuId;
    private String title;
    private Integer price;

    public Menu(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(
                "Menu[id=%d, title='%s', price='%s']",
                menuId, title, price);
    }

}
