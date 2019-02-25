package com.adam.dto.dsfagentplus.response;

import com.adam.dto.dsfagentplus.BaseResponseEntity;

import java.math.BigDecimal;

public class CreateOrderEntityResponse extends BaseResponseEntity {

    /**
     * TE订单号
     */
    private String orderId;
    /**
     * 供应商订单号
     */
    private String supplierOrderId;
    /**
     * 订单状态(供应商状态转换后的订单状态
     * // 在轮训类的派单中，REJECT表示供应商订单查询接口返回状态,这个时候直接设置确认失败
     * OrderStatusEnum  ZERO(0, "提交"), ONE(1, "确认成功"), TWO(2, "确认中"), THREE(3, "已入住"), FOUR(4, "NoShow"), FIVE(5, "取消成功"), NINE(9,
     * 			"确认失败"), TEN(10, "取消中"), SIX(6, "取消失败"), SEVEN(7, "已离店");
     */
    private Integer status;
    /**
     * 总价（人民币）
     */
    private BigDecimal totalAmount;
    /**
     * 供应商外币总价
     */
    private BigDecimal totalSupplierForeignAmount;
    /**
     * 佣金
     */
    private BigDecimal takeOff;
    /**
     * 供应商外币币种
     */
    private String supplierForeignCurrencyCode;

    /**
     *  PinCode
     */
    private String pinCode;

    /**
     * 酒店确认号，多个时以"|"隔开
     */
    private String supplierConfirmNo;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSupplierOrderId() {
        return supplierOrderId;
    }

    public void setSupplierOrderId(String supplierOrderId) {
        this.supplierOrderId = supplierOrderId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalSupplierForeignAmount() {
        return totalSupplierForeignAmount;
    }

    public void setTotalSupplierForeignAmount(BigDecimal totalSupplierForeignAmount) {
        this.totalSupplierForeignAmount = totalSupplierForeignAmount;
    }

    public BigDecimal getTakeOff() {
        return takeOff;
    }

    public void setTakeOff(BigDecimal takeOff) {
        this.takeOff = takeOff;
    }

    public String getSupplierForeignCurrencyCode() {
        return supplierForeignCurrencyCode;
    }

    public void setSupplierForeignCurrencyCode(String supplierForeignCurrencyCode) {
        this.supplierForeignCurrencyCode = supplierForeignCurrencyCode;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getSupplierConfirmNo() {
        return supplierConfirmNo;
    }

    public void setSupplierConfirmNo(String supplierConfirmNo) {
        this.supplierConfirmNo = supplierConfirmNo;
    }
}
