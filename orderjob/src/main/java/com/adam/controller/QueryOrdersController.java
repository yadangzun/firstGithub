package com.adam.controller;

import com.adam.entity.Orders;
import com.adam.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class QueryOrdersController {
    @Autowired
    private QueryService queryService;

    @RequestMapping(value="/listorder",method= RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> queryOrder() {
        Map<String, Object> modelMap = new HashMap<>();
        Orders orders = queryService.getOrdersByPrimaryKey(341);
        modelMap.put("success", true);
        modelMap.put("order", orders);
        return modelMap;


    }


}
