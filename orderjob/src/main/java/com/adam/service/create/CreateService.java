package com.adam.service.create;


import com.adam.dao.*;
import com.adam.dto.dsfagentplus.AmountInfo;
import com.adam.dto.dsfagentplus.ContractInfo;
import com.adam.dto.dsfagentplus.GuestInfo;
import com.adam.dto.dsfagentplus.RoomInfo;
import com.adam.dto.dsfagentplus.request.CreateOrderEntityRequest;
import com.adam.dto.dsfagentplus.response.CreateOrderEntityResponse;
import com.adam.dto.supplierswitch.request.CreateOrderRequestDto;
import com.adam.dto.supplierswitch.response.CreateOrderReponseDto;
import com.adam.entity.*;
import com.adam.enums.CurrencyEnum;
import com.adam.util.AgentPlusProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CreateService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private OrderStatisticsMapper orderStatisticsMapper;

    @Autowired
    private OrderExtendInfoMapper orderExtendInfoMapper;

    @Autowired
    private OrderAmountMapper orderAmountMapper;

    @Autowired
    private OrderRoomMapper orderRoomMapper;

    public CreateOrderEntityResponse action(CreateOrderRequestDto createOrderRequestDto, HttpServletRequest request, boolean isRecreate) {
        //订单号
        String orderId = createOrderRequestDto.getOrderId();
        //返回体
        CreateOrderEntityResponse createOrderEntityResponse =  null;
        //获取订单信息
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andOrdernoEqualTo(orderId);
        List<Orders> ordersList = ordersMapper.selectByExample(ordersExample);
        Orders orders = ordersList.get(0);

        //获取OrderDetail信息
        OrderDetailExample orderDetailExample = new OrderDetailExample();
        OrderDetailExample.Criteria criteria1 = orderDetailExample.createCriteria();
        criteria1.andOdordernoEqualTo(orderId);
        List<OrderDetail> orderDetailList = orderDetailMapper.selectByExample(orderDetailExample);
        OrderDetail orderDetail = orderDetailList.get(0);

        //获取OrderStatistics信息
        OrderStatisticsExample orderStatisticsExample = new OrderStatisticsExample();
        OrderStatisticsExample.Criteria criteria2 = orderStatisticsExample.createCriteria();
        criteria2.andOsordernoEqualTo(orderId);
        List<OrderStatistics> orderStatisticsList = orderStatisticsMapper.selectByExample(orderStatisticsExample);
        OrderStatistics orderStatistics = orderStatisticsList.get(0);

        //获取OrderExtendInfo信息
        OrderExtendInfoExample orderExtendInfoExample = new OrderExtendInfoExample();
        OrderExtendInfoExample.Criteria criteria3 = orderExtendInfoExample.createCriteria();
        criteria3.andOeordernoEqualTo(orderId);
        List<OrderExtendInfo> orderExtendInfoList = orderExtendInfoMapper.selectByExample(orderExtendInfoExample);
        OrderExtendInfo orderExtendInfo = orderExtendInfoList.get(0);

        //获取orderAmount信息
        OrderAmountExample orderAmountExample = new OrderAmountExample();
        OrderAmountExample.Criteria criteria4 = orderAmountExample.createCriteria();
        criteria4.andOaordernoEqualTo(orderId);
        List<OrderAmount> orderAmountList = orderAmountMapper.selectByExample(orderAmountExample);
        OrderAmount orderAmount = orderAmountList.get(0);

        //获取orderRoomList信息
        OrderRoomExample orderRoomExample = new OrderRoomExample();
        OrderRoomExample.Criteria criteria5 = orderRoomExample.createCriteria();
        criteria5.andOrordernoEqualTo(orderId);
        List<OrderRoom> orderRoomList = orderRoomMapper.selectByExample(orderRoomExample);



        if(!(orders.getOrderenvironment().equals("qa") || orders.getOrderenvironment().equals("test")) ){
            //模拟下单返回体
            createOrderEntityResponse = new CreateOrderEntityResponse();
            createOrderEntityResponse.setCode(302);
            createOrderEntityResponse.setMsg("模拟下单成功");
        }else {
            if(createOrderRequestDto == null){
                createOrderEntityResponse = new CreateOrderEntityResponse();
                createOrderEntityResponse.setCode(306);
                createOrderEntityResponse.setMsg("请求体为空");
            }
            CreateOrderEntityRequest requestEntity = new CreateOrderEntityRequest();
            //请求dto中有的属性
            requestEntity.setOrderId(orderId);
            requestEntity.setCreditCardInfo(createOrderRequestDto.getCreditCardInfo());
            requestEntity.setTeHotelId(createOrderRequestDto.getTeHotelId());
            requestEntity.setSupplierHotelId(createOrderRequestDto.getSupplierHotelId());
            requestEntity.setIp(request.getRemoteAddr());
            requestEntity.setUserAgent(request.getHeader("User-Agent"));

            //设置orders的其他参数,/orderdetail
            requestEntity.setSpecialRemark(orders.getOrderbookerremark());
            requestEntity.setNumOfRooms(orders.getOrdernumberofrooms());
            requestEntity.setPaymentType(orders.getOrderbooktype());
            requestEntity.setPlatformId(orders.getOrderplatformid());
            requestEntity.setSearchId(orders.getOrdersessionid());
            requestEntity.setRoomId(orders.getOrderroomid().toString());
            //orderextendinfo
            requestEntity.setSupplierId(orderExtendInfo.getOemerchantid());
            requestEntity.setSupplierName(orderExtendInfo.getOemerchantname());
            requestEntity.setAttachment(orderExtendInfo.getOeattachment());
            //orderdetail
            requestEntity.setNewsletter(orderDetail.getOdisnewsletter());
           // requestEntity.setPolicyId(Integer.valueOf(orderDetail.getOdproductid()));
            requestEntity.setHouseTypeCopy(orderDetail.getOdishousetypecopy()==true?1:0);
            requestEntity.setCheckInDate(new SimpleDateFormat("yyyy-MM-dd").format(orders.getOrderarrivaldate()));
            requestEntity.setCheckOutDate(new SimpleDateFormat("yyyy-MM-dd").format(orders.getOrderdeparturedate()));
            //orderstatistics
            requestEntity.setConfirmType(orderStatistics.getOsconfirmnow());
            //预定客人Contract信息
            ContractInfo contractInfo = new ContractInfo();
            contractInfo.setContactEmail(orders.getOrdermemberemail());
            contractInfo.setContactFirstName(orders.getOrdermemberfirstname());
            contractInfo.setContactLastName(orders.getOrdermemberlastname());
            contractInfo.setContractMobile(orders.getOrdermembermobile());
            contractInfo.setContactNationality(orders.getOrdermembercountrycode());
            String contractName = contractInfo.getContactFirstName() + " " + contractInfo.getContactLastName();
            contractInfo.setContractName(contractName);
            requestEntity.setContractInfo(contractInfo);
            //信用卡CreditCardInfo信息在dto中已经传入
            //订单金额AmountInfo 信息
            AmountInfo amountInfo = new AmountInfo();
            amountInfo.setTotalAmount(orders.getOrderamounttotal());
            Integer currencyId = orders.getOrdercurrencyid();
            amountInfo.setCurrencyCodeOfTotalAmount(CurrencyEnum.values()[currencyId - 1].name());
            amountInfo.setBaseTotalAmount(orderAmount.getOaordercostpriceori());
            Integer baseCurrencyId = orderAmount.getOaorderotapriceoricurrency();
            amountInfo.setCurrencyCodeOfBaseTotalAmount(CurrencyEnum.values()[baseCurrencyId - 1].name());
            requestEntity.setAmountInfo(amountInfo);
            //房间信息
            List<RoomInfo> roomInfoList = new ArrayList<RoomInfo>();
            for(OrderRoom orderRoom : orderRoomList){
                RoomInfo roomInfo = new RoomInfo();
                roomInfo.setBedTypeId(orderRoom.getOrbedtypeid().toString());
                roomInfo.setBedTypeName(orderRoom.getOrbedtypename());
                roomInfo.setRoomNumberOfAdults(orderRoom.getOrnumberofadults());
                roomInfo.setSmokingPreference(orderRoom.getOrsmokingpreference());
                roomInfo.setRoomNumberOfChildren(orderRoom.getOrnumberofchidren());


                List<String> roomChildAges = new ArrayList<>();
                String childAges = orderRoom.getOrchildages();
                if(childAges != null && !"".equals(childAges)) {
                    roomChildAges = Arrays.asList(orderRoom.getOrchildages().split(","));
                }
                roomInfo.setRoomChildAges(roomChildAges);

                //客人guest信息
                List<GuestInfo> guestInfoList = new ArrayList<>();
                GuestInfo guestInfo = new GuestInfo();
                guestInfo.setGuestFirstName(orderRoom.getOrguestfirstname());
                guestInfo.setGuestLastName(orderRoom.getOrguestlastname());
                guestInfo.setGuestNationality(orderRoom.getOrguestnationality());
                guestInfo.setGuestName(orderRoom.getOrguestfirstname() + " " + orderRoom.getOrguestlastname());
                guestInfoList.add(guestInfo);
                String guestOtherNames = orderRoom.getOrguestothernames();
                if(guestOtherNames != null && !"".equals(guestOtherNames)) {
                    String[] guestInfos = guestOtherNames.split(",");
                    for (String info : guestInfos
                            ) {
                        GuestInfo otherGuestInfo = new GuestInfo();
                        String[] baseInfos = new String[4];
                        baseInfos = info.split("/");
                        otherGuestInfo.setGuestFirstName(baseInfos[0]);
                        otherGuestInfo.setGuestLastName(baseInfos[1]);
                        if (Boolean.valueOf(baseInfos[2])) {
                            otherGuestInfo.setGuestGender(1);
                        } else {
                            otherGuestInfo.setGuestGender(0);
                        }
                        otherGuestInfo.setGuestNationality(baseInfos[3]);
                        otherGuestInfo.setGuestName(baseInfos[0] + " " + baseInfos[1]);

                        guestInfoList.add(otherGuestInfo);
                    }
                }

                roomInfo.setGuestInfoList(guestInfoList);

                roomInfoList.add(roomInfo);
            }

            requestEntity.setRoomInfoList(roomInfoList);
            createOrderEntityResponse = AgentPlusProxy.createOrder(requestEntity);
        }



        return createOrderEntityResponse;

    }
}
