package com.pis.myproject.persistance.interfcs;

import com.pis.myproject.persistance.entities.Usertype;

import java.util.List;
import java.util.Optional;

public interface IUsertype {

    public List<Usertype> findAll();

    public Optional<Usertype> findByTypeId(Integer typeId);

    public List<Usertype> findByType(String type);

}
