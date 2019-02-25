package com.adam.controller;

import com.adam.dto.dsfagentplus.response.CreateOrderEntityResponse;
import com.adam.dto.supplierswitch.request.CreateOrderRequestDto;
import com.adam.service.create.CreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/supplierswitchapi")
public class CreateController {
    @Autowired
    private CreateService createService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CreateOrderEntityResponse create(@RequestBody CreateOrderRequestDto createOrderRequestDto, HttpServletRequest httpServletRequest) {
        try{
            return createService.action(createOrderRequestDto, httpServletRequest, false);

        }catch(Exception ex){
            CreateOrderEntityResponse baseResponseDto = new CreateOrderEntityResponse();
            baseResponseDto.setCode(1);
            baseResponseDto.setMsg(ex.getMessage());
            return baseResponseDto;

        }
    }
}
