package com.adam.dto.supplierswitch.request;

import com.adam.dto.dsfagentplus.CreditCardInfo;
import com.adam.dto.supplierswitch.BaseRequestDto;

public class CreateOrderRequestDto extends BaseRequestDto {
    /**
     * 同程艺龙酒店id
     */
    private Long teHotelId;

    /**
     * 供应商酒店Id
     */
    private Long supplierHotelId;

    /**
     * 信用卡信息实体
     */
    private CreditCardInfo creditCardInfo;

    public Long getTeHotelId() {
        return teHotelId;
    }

    public void setTeHotelId(Long teHotelId) {
        this.teHotelId = teHotelId;
    }

    public Long getSupplierHotelId() {
        return supplierHotelId;
    }

    public void setSupplierHotelId(Long supplierHotelId) {
        this.supplierHotelId = supplierHotelId;
    }

    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }
}
