package com.adam.service;

import com.adam.entity.Orders;

public interface QueryService {

    Orders getOrdersByPrimaryKey(int id);
}
