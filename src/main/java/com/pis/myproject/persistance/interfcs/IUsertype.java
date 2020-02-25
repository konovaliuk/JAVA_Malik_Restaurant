package com.pis.myproject.persistance.interfcs;

import com.pis.myproject.persistance.entities.Usertype;

import java.util.List;
import java.util.Optional;

public interface IUsertype {

    List<Usertype> findAll();

    Optional<Usertype> findByTypeId(Integer typeId);

    List<Usertype> findByType(String type);

}
