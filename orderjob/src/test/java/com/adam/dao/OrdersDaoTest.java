package com.adam.dao;

import com.adam.BaseTest;
import com.adam.entity.Orders;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;

public class OrdersDaoTest extends BaseTest {
    @Autowired
    private OrdersMapper ordersMapper;

    @Test
    public void testOrdersDao() {
        Orders orders = ordersMapper.selectByPrimaryKey(341);
        assertEquals("ha56c7cd1a2100918219", orders.getOrderno());

    }
}
