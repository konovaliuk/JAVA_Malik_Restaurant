package com.pis.myproject.persistance.repositories;

import com.pis.myproject.persistance.entities.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {

    public List<Orders> findAll();
    public Optional<Orders> findById(Integer id);

}
