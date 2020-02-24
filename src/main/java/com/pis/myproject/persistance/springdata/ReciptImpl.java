package com.pis.myproject.persistance.springdata;

import com.pis.myproject.persistance.entities.Recipt;
import com.pis.myproject.persistance.interfcs.IRecipt;
import com.pis.myproject.persistance.repositories.ReciptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service("ReciptService")
@Repository
@Transactional
public class ReciptImpl implements IRecipt {

    @Autowired
    private ReciptRepository reciptRepository;

    @Transactional(readOnly = true)
    public List<Recipt> findAll() {
        return reciptRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Recipt> findById(Integer reciptId) {
        return reciptRepository.findById(reciptId);
    }

    @Transactional(readOnly = true)
    public List<Recipt> findByReciptDate(Timestamp reciptDate) {
        return reciptRepository.findByReciptDate(reciptDate);
    }

}
