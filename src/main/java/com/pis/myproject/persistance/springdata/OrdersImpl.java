package com.pis.myproject.persistance.springdata;

import com.pis.myproject.persistance.entities.Orders;
import com.pis.myproject.persistance.interfcs.IOrders;
import com.pis.myproject.persistance.repositories.OrdersRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository("OrdersService")
@Transactional
@AllArgsConstructor
public class OrdersImpl implements IOrders {

    private final OrdersRepository ordersRepository;

    public List<Orders> findAll() {
        return (List<Orders>) ordersRepository.findAll();
    }

    public Optional<Orders> findById(Integer id) {
        return ordersRepository.findById(id);
    }

}
