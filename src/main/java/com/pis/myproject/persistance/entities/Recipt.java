package com.pis.myproject.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "recipt", schema = "restaurant")
public class Recipt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reciptId;
    private Integer admin_id;
    private Integer client_id;
    private Integer sum;
    private Timestamp reciptDate;

    public Recipt(Integer admin_id, Integer client_id, Integer sum){
        this.admin_id = admin_id;
        this.client_id = client_id;
        this.sum = sum;
    }

}
