package com.example.newdemodemo.service;

import com.example.newdemodemo.BaseTest;
import com.example.newdemodemo.entity.Orders;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;


public class OrdersServiceTest extends BaseTest {

    @Autowired
    private OrdersService ordersService;


    @Test
    public void testQueryOrders() {

        Orders orders = ordersService.queryOrder(341);
        assertEquals("ha56c7cd1a2100918219",orders.getOrderno());

    }

}