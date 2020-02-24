package com.pis.myproject.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

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
    private Integer preSum;

    public Orders(Integer quantity, Integer preSum){
        this.quantity = quantity;
        this.preSum = preSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return Objects.equals(id, orders.id) &&
                Objects.equals(quantity, orders.quantity) &&
                Objects.equals(preSum, orders.preSum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, preSum);
    }

    @Override
    public String toString() {
        return String.format(
                "Orders[id=%d, quantity='%s', preSum='%s']",
                id, quantity, preSum);
    }

}
