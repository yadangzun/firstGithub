package com.adam.util;

import com.adam.dto.dsfagentplus.request.CreateOrderEntityRequest;
import com.adam.dto.dsfagentplus.response.CreateOrderEntityResponse;
import com.ly.spat.dsf.client.v2.DSFFutureable;
import com.ly.spat.dsf.client.v2.DSFProxy;
import com.ly.spat.dsf.client.v2.HttpService;



import java.util.concurrent.TimeUnit;


public class AgentPlusProxy {
    public static int TIME_OUT = 30;

   /* public static QueryOrderEntityResponse queryOrder(QueryOrderEntityRequest requestEntity) {
        HttpService client = DSFProxy.newInstance().getService("dsf.ghotel.agentplus", "orderservice", ConfigCenterUtil.get("ghotel.java.dsf.agentplus","version","1.3.0.0"));

        //com.te.ghotel.agentplus.model.dsfentity.queryOrder.request.QueryOrderEntityRequest为请求Body参数
        DSFFutureable<QueryOrderEntityResponse> res = client.asyncAction("queryorder", QueryOrderEntityResponse.class, requestEntity, null, 0, TIME_OUT, TimeUnit.SECONDS, null);
        QueryOrderEntityResponse result = res.get();

        return  result;
    }

    public static QueryOrderEntityListResponse queryOrderList(QueryOrderListEntityRequest requestEntity) {
        HttpService client = DSFProxy.newInstance().getService("dsf.ghotel.agentplus", "orderservice", ConfigCenterUtil.get("ghotel.java.dsf.agentplus", "version", "1.3.0.0"));

        //com.te.ghotel.agentplus.model.dsfentity.queryOrder.request.QueryOrderListEntityRequest为请求Body参数
        DSFFutureable<QueryOrderEntityListResponse> res = client.asyncAction("queryorderlist", QueryOrderEntityListResponse.class, requestEntity, null, 0, TIME_OUT, TimeUnit.SECONDS, null);
        QueryOrderEntityListResponse result = res.get();

        return result;
    }*/

    public static CreateOrderEntityResponse createOrder(CreateOrderEntityRequest requestEntity) {
        HttpService client = DSFProxy.newInstance().getService("dsf.ghotel.agentplus", "orderservice", ConfigCenterUtil.get("ghotel.java.dsf.agentplus","version","1.3.0.0"));

        //com.te.ghotel.agentplus.model.dsfentity.createOrder.request.CreateOrderEntityRequest为请求Body参数
        //为了模拟agoda下单失败 （超时） 超时时间接入统一配置
        DSFFutureable<CreateOrderEntityResponse> res = client.asyncAction("createorder", CreateOrderEntityResponse.class, requestEntity, null, 0, Integer.parseInt(ConfigCenterUtil.get("AgodaCreateTimeout", "120")), TimeUnit.SECONDS, null);
        CreateOrderEntityResponse result = res.get();

        return  result;
    }

  /*  public static CancelOrderEntityResponse cancelOrder(CancelOrderEntityRequest requestEntity) {
        HttpService client = DSFProxy.newInstance().getService("dsf.ghotel.agentplus", "orderservice", ConfigCenterUtil.get("ghotel.java.dsf.agentplus","version","1.3.0.0"));

        //com.te.ghotel.agentplus.model.dsfentity.cancelOrder.request.CancelOrderEntityRequest为请求Body参数
        DSFFutureable<CancelOrderEntityResponse> res = client.asyncAction("cancelorder", CancelOrderEntityResponse.class, requestEntity, null, 0, TIME_OUT, TimeUnit.SECONDS, null);
        CancelOrderEntityResponse result = res.get();

        return  result;
    }*/
}
