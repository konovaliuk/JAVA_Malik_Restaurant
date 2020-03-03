package com.pis.myproject.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders", schema = "restaurant")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "pre_sum")
    private Integer preSum;

    @ManyToOne
    @JoinColumn(referencedColumnName = "menu_id", name = "menu_id")
    private Menu menu;

    @ManyToOne
    @JoinColumn(referencedColumnName = "recipt_id", name = "recipt_id")
    private Recipt recipt;

}
