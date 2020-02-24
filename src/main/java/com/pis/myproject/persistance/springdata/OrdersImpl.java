package com.pis.myproject.persistance.springdata;

import com.pis.myproject.persistance.entities.Orders;
import com.pis.myproject.persistance.interfcs.IOrders;
import com.pis.myproject.persistance.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("OrdersService")
@Repository
@Transactional
public class OrdersImpl implements IOrders {

    @Autowired
    private OrdersRepository ordersRepository;

    @Transactional(readOnly = true)
    public List<Orders> findAll() {
        return ordersRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Orders> findById(Integer id) {
        return ordersRepository.findById(id);
    }

}
