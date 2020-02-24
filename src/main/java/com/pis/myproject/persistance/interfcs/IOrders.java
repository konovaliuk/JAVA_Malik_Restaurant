package com.pis.myproject.persistance.interfcs;

import com.pis.myproject.persistance.entities.Orders;

import java.util.List;
import java.util.Optional;

public interface IOrders {

    public List<Orders> findAll();

    public Optional<Orders> findById(Integer id);

}
