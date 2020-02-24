package com.pis.myproject.persistance.springdata;

import com.pis.myproject.persistance.entities.Usertype;
import com.pis.myproject.persistance.interfcs.IUsertype;
import com.pis.myproject.persistance.repositories.UsertypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("UsertypeService")
@Repository
@Transactional
public class UsertypeImpl implements IUsertype {
    
    @Autowired
    private UsertypeRepository usertypeRepository;

    @Transactional(readOnly = true)
    public List<Usertype> findAll() {
        return usertypeRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Usertype> findByTypeId(Integer typeId) {
        return usertypeRepository.findByTypeId(typeId);
    }

    @Transactional(readOnly = true)
    public List<Usertype> findByType(String type) {
        return usertypeRepository.findByType(type);
    }

}
