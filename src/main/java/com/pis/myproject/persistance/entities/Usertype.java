package com.pis.myproject.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "usertype", schema = "restaurant")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usertype {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "type_id")
    private int typeId;
    @Column(name = "Type")
    private String type;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usertype")
    private List<Users> users;

}
