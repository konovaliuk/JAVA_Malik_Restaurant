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


}
