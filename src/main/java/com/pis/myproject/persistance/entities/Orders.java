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
    private Integer id;
    private Integer quantity;
    private Integer recipt_id;
    private Integer menu_id;
    private Integer preSum;

    public Orders(Integer recipt_id, Integer menu_id, Integer quantity, Integer preSum){
        this.recipt_id = recipt_id;
        this.menu_id = menu_id;
        this.quantity = quantity;
        this.preSum = preSum;
    }

    @Override
    public String toString() {
        return String.format(
                "Orders[id=%d, quantity='%s', preSum='%s']",
                id, quantity, preSum);
    }

}
