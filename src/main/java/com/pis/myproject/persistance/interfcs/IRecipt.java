package com.pis.myproject.persistance.interfcs;

import com.pis.myproject.persistance.entities.Recipt;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public interface IRecipt {

    List<Recipt> findAll();

    Optional<Recipt> findById(Integer reciptId);

    List<Recipt> findByReciptDate(Timestamp reciptDate);

}
