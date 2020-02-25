package com.pis.myproject.persistance.springdata;

import com.pis.myproject.persistance.entities.Recipt;
import com.pis.myproject.persistance.interfcs.IRecipt;
import com.pis.myproject.persistance.repositories.ReciptRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Repository("ReciptService")
@Transactional
@AllArgsConstructor
public class ReciptImpl implements IRecipt {

    private ReciptRepository reciptRepository;

    public List<Recipt> findAll() {
        return (List<Recipt>) reciptRepository.findAll();
    }

    public Optional<Recipt> findById(Integer reciptId) {
        return reciptRepository.findById(reciptId);
    }

    public List<Recipt> findByReciptDate(Timestamp reciptDate) {
        return reciptRepository.findByReciptDate(reciptDate);
    }

}
