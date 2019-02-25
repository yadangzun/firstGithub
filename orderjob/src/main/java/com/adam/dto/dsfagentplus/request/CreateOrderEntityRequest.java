package com.adam.dto.dsfagentplus.request;

import com.adam.dto.dsfagentplus.*;

import java.util.List;

public class CreateOrderEntityRequest extends BaseRequestEntity {
    /**
     * 供应商订单号
     */
    private String supplierOrderId;

    /**
     * 供应商城市ID
     */
    private String supplierCityId;

    /**
     * 同程艺龙酒店id
     */
    private Long teHotelId;

    /**
     * 供应商酒店Id
     */
    private Long supplierHotelId;

    /**
     * 房型Id
     */
    private String roomId;

    /**
     * 政策Id(没落地的政策Id为0)
     */
    private Integer policyId;


    /**
     * 入住日期（yyyy-MM-dd）
     */

    private String checkInDate;

    /**
     * 离店日期（yyyy-MM-dd）
     */

    private String checkOutDate;
    /**
     * 房间数
     */
    private Integer numOfRooms;
    /**
     * 订单金额信息
     **/

    private AmountInfo amountInfo;
    /**
     * 确认类型（0=立即确认，1=异步确认）
     */

    private Integer confirmType;
    /**
     * json字符串，搜索透传字段
     */

    private String attachment;

    /**
     * 是否发送广告邮件（默认false）
     */

    private Boolean isNewsletter;
    /**
     * 是否马甲(0=非马甲，1=马甲) vest 字段
     */

    private Integer houseTypeCopy;
    /**
     * 请求Id(UUID),补单时用同一requestid请求booking下单，用于防止下多个订单（requestId一个小时内有效）
     */
    private String requestId;
    /**
     * 特别备注 ，客户偏好
     */
    private String specialRemark;
    /**
     * 预订客人信息
     */

    private ContractInfo contractInfo;

    /**
     * 信用卡信息实体
     */
    private CreditCardInfo creditCardInfo;

    /**
     * 房间信息集合
     */

    private List<RoomInfo> roomInfoList;

    public String getSupplierOrderId() {
        return supplierOrderId;
    }

    public void setSupplierOrderId(String supplierOrderId) {
        this.supplierOrderId = supplierOrderId;
    }

    public String getSupplierCityId() {
        return supplierCityId;
    }

    public void setSupplierCityId(String supplierCityId) {
        this.supplierCityId = supplierCityId;
    }

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

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(Integer numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public AmountInfo getAmountInfo() {
        return amountInfo;
    }

    public void setAmountInfo(AmountInfo amountInfo) {
        this.amountInfo = amountInfo;
    }

    public Integer getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(Integer confirmType) {
        this.confirmType = confirmType;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public Boolean getNewsletter() {
        return isNewsletter;
    }

    public void setNewsletter(Boolean newsletter) {
        isNewsletter = newsletter;
    }

    public Integer getHouseTypeCopy() {
        return houseTypeCopy;
    }

    public void setHouseTypeCopy(Integer houseTypeCopy) {
        this.houseTypeCopy = houseTypeCopy;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSpecialRemark() {
        return specialRemark;
    }

    public void setSpecialRemark(String specialRemark) {
        this.specialRemark = specialRemark;
    }

    public ContractInfo getContractInfo() {
        return contractInfo;
    }

    public void setContractInfo(ContractInfo contractInfo) {
        this.contractInfo = contractInfo;
    }

    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    public List<RoomInfo> getRoomInfoList() {
        return roomInfoList;
    }

    public void setRoomInfoList(List<RoomInfo> roomInfoList) {
        this.roomInfoList = roomInfoList;
    }
}
