package com.pis.myproject.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "recipt", schema = "restaurant")
public class Recipt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reciptId;
    private Integer sum;
    private Timestamp reciptDate;

    public Recipt(Integer sum){
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipt that = (Recipt) o;
        return Objects.equals(reciptId, that.reciptId) &&
                Objects.equals(sum, that.sum) &&
                Objects.equals(reciptDate, that.reciptDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reciptId, sum, reciptDate);
    }

    @Override
    public String toString() {
        return "Recipt{" +
                "reciptId=" + reciptId +
                ", sum=" + sum +
                ", reciptDate=" + reciptDate +
                '}';
    }

}
