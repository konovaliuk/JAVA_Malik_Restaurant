package com.pis.myproject.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users", schema = "restaurant")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Surname")
    private String surname;
    @Column(name = "login")
    private String login;
    @Column(name = "pass")
    private String pass;

    @ManyToOne
    @JoinColumn(referencedColumnName = "type_id", name = "user_type")
    private Usertype usertype;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
    private List<Recipt> recipt;

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
//                ", usertype=" + usertype +
//                ", recipt=" + recipt +
                '}';
    }
}
