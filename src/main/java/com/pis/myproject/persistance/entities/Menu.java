package com.pis.myproject.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "menu", schema = "restaurant")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "menu_id")
    private Integer menuId;
    @Column(name = "Title")
    private String title;
    @Column(name = "Price")
    private Integer price;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "menu")
    private List<Orders> orders;

//    public Menu(String title, Integer price){
//        this.title=title;
//        this.price=price;
//    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
