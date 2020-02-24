package com.pis.myproject.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usertype", schema = "restaurant")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usertype {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int typeId;
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usertype that = (Usertype) o;
        return Objects.equals(typeId, that.typeId) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, type);
    }

}
