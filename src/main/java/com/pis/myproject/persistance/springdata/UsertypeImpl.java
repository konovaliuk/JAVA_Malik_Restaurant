package com.pis.myproject.persistance.springdata;

import com.pis.myproject.persistance.entities.Usertype;
import com.pis.myproject.persistance.interfcs.IUsertype;
import com.pis.myproject.persistance.repositories.UsertypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository("UsertypeService")
@Transactional
@AllArgsConstructor
public class UsertypeImpl implements IUsertype {
    
    private UsertypeRepository usertypeRepository;

    public List<Usertype> findAll() {
        return (List<Usertype>) usertypeRepository.findAll();
    }

    public Optional<Usertype> findByTypeId(Integer typeId) {
        return usertypeRepository.findById(typeId);
    }

    public List<Usertype> findByType(String type) {
        return usertypeRepository.findByType(type);
    }

}
