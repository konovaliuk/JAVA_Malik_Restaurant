package com.pis.myproject.persistance.repositories;

import com.pis.myproject.persistance.entities.Recipt;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public interface ReciptRepository extends CrudRepository<Recipt, Integer> {

    public List<Recipt> findAll();

    public Optional<Recipt> findById(Integer reciptId);

    public List<Recipt> findByReciptDate(Timestamp reciptDate);

}
