package com.pis.myproject.persistance.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "menu",cascade = CascadeType.DETACH)
    @JsonIgnore
    private List<Orders> orders;

}
