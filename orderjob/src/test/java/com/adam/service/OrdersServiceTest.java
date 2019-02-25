package com.adam.service;

import com.adam.BaseTest;
import com.adam.entity.Orders;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class OrdersServiceTest extends BaseTest {
    @Autowired
    private QueryService queryService;

    @Test
    public void testOrdersService() {
        Orders orders = queryService.getOrdersByPrimaryKey(341);
        assertEquals("ha56c7cd1a2100918219", orders.getOrderno());
    }
}
