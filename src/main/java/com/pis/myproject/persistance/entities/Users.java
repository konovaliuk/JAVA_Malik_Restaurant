package com.pis.myproject.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "users", schema = "restaurant")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String name;
    private String surname;
    private Integer userType;
    private String login;
    private String pass;

}
