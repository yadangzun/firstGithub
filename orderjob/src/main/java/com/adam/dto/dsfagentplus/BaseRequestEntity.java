package com.adam.dto.dsfagentplus;


public class BaseRequestEntity {
    /**
     * TE订单号
     */

    private String orderId;

    /**
     * 供应商id
     */

    private Integer supplierId;

    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 产品类型：（1=现付无担保,2=现付担保,3=预付）
     */

    private Integer paymentType;

    /**
     * 客户端ip地址
     */
    private String ip;
    /**
     * 浏览器版本信息
     */
    private String userAgent;

    /**
     * 来源平台
     */
    private Integer platformId;

    /**
     * searchid
     */

    private String searchId;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "BaseRequestEntity{" +
                "orderId='" + orderId + '\'' +
                ", supplierId=" + supplierId +
                ", supplierName='" + supplierName + '\'' +
                ", paymentType=" + paymentType +
                ", ip='" + ip + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", platformId=" + platformId +
                ", searchId='" + searchId + '\'' +
                '}';
    }
}
