package com.pis.myproject.persistance.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "recipt", schema = "restaurant")
public class Recipt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "recipt_id")
    private Integer reciptId;
    @Column(name = "Sum")
    private Integer sum;
    @Column(name = "recipt_date")
    private Timestamp reciptDate;

    @ManyToOne
    @JoinColumn(name="client_id", referencedColumnName="user_id")
    private Users client;

    @ManyToOne
    @JoinColumn(name="admin_id", referencedColumnName="user_id")
    private Users admin;



    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipt")
    @JsonIgnore
    private List<Orders> orders;

}
