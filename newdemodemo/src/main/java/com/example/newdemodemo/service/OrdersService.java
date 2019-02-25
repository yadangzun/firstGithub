package com.example.newdemodemo.service;


import com.example.newdemodemo.entity.Orders;
import com.example.newdemodemo.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    public Orders queryOrder(Integer orderId) {
        Orders orders = ordersMapper.selectByPrimaryKey(orderId);



        return orders;


    }
}
