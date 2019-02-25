package com.adam.service.impl;

import com.adam.dao.OrdersMapper;
import com.adam.entity.Orders;
import com.adam.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QueryServiceImpl implements QueryService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public Orders getOrdersByPrimaryKey(int id) {
        return ordersMapper.selectByPrimaryKey(id);
    }
}
