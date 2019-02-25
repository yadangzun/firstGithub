package com.example.newdemodemo.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderFlow implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.ID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFOrderID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Integer oforderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFOrderNo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private String oforderno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Integer ofstatusid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFActionDate
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Date ofactiondate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFOperatorID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Integer ofoperatorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFRemark
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private String ofremark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFOperatorName
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private String ofoperatorname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFContent
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private String ofcontent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFLogType
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Integer oflogtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFPayStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Integer ofpaystatusid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFActionCode
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Integer ofactioncode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFSubActionCode
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Integer ofsubactioncode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFCompleteDate
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Date ofcompletedate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFCompleteStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Integer ofcompletestatusid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFCompletePayStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Integer ofcompletepaystatusid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFParentFlowID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Integer ofparentflowid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderFlow.OFIsSuccess
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private Boolean ofissuccess;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table OrderFlow
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.ID
     *
     * @return the value of OrderFlow.ID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.ID
     *
     * @param id the value for OrderFlow.ID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFOrderID
     *
     * @return the value of OrderFlow.OFOrderID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Integer getOforderid() {
        return oforderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFOrderID
     *
     * @param oforderid the value for OrderFlow.OFOrderID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOforderid(Integer oforderid) {
        this.oforderid = oforderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFOrderNo
     *
     * @return the value of OrderFlow.OFOrderNo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public String getOforderno() {
        return oforderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFOrderNo
     *
     * @param oforderno the value for OrderFlow.OFOrderNo
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOforderno(String oforderno) {
        this.oforderno = oforderno == null ? null : oforderno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFStatusID
     *
     * @return the value of OrderFlow.OFStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Integer getOfstatusid() {
        return ofstatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFStatusID
     *
     * @param ofstatusid the value for OrderFlow.OFStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfstatusid(Integer ofstatusid) {
        this.ofstatusid = ofstatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFActionDate
     *
     * @return the value of OrderFlow.OFActionDate
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Date getOfactiondate() {
        return ofactiondate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFActionDate
     *
     * @param ofactiondate the value for OrderFlow.OFActionDate
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfactiondate(Date ofactiondate) {
        this.ofactiondate = ofactiondate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFOperatorID
     *
     * @return the value of OrderFlow.OFOperatorID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Integer getOfoperatorid() {
        return ofoperatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFOperatorID
     *
     * @param ofoperatorid the value for OrderFlow.OFOperatorID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfoperatorid(Integer ofoperatorid) {
        this.ofoperatorid = ofoperatorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFRemark
     *
     * @return the value of OrderFlow.OFRemark
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public String getOfremark() {
        return ofremark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFRemark
     *
     * @param ofremark the value for OrderFlow.OFRemark
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfremark(String ofremark) {
        this.ofremark = ofremark == null ? null : ofremark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFOperatorName
     *
     * @return the value of OrderFlow.OFOperatorName
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public String getOfoperatorname() {
        return ofoperatorname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFOperatorName
     *
     * @param ofoperatorname the value for OrderFlow.OFOperatorName
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfoperatorname(String ofoperatorname) {
        this.ofoperatorname = ofoperatorname == null ? null : ofoperatorname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFContent
     *
     * @return the value of OrderFlow.OFContent
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public String getOfcontent() {
        return ofcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFContent
     *
     * @param ofcontent the value for OrderFlow.OFContent
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfcontent(String ofcontent) {
        this.ofcontent = ofcontent == null ? null : ofcontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFLogType
     *
     * @return the value of OrderFlow.OFLogType
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Integer getOflogtype() {
        return oflogtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFLogType
     *
     * @param oflogtype the value for OrderFlow.OFLogType
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOflogtype(Integer oflogtype) {
        this.oflogtype = oflogtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFPayStatusID
     *
     * @return the value of OrderFlow.OFPayStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Integer getOfpaystatusid() {
        return ofpaystatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFPayStatusID
     *
     * @param ofpaystatusid the value for OrderFlow.OFPayStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfpaystatusid(Integer ofpaystatusid) {
        this.ofpaystatusid = ofpaystatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFActionCode
     *
     * @return the value of OrderFlow.OFActionCode
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Integer getOfactioncode() {
        return ofactioncode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFActionCode
     *
     * @param ofactioncode the value for OrderFlow.OFActionCode
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfactioncode(Integer ofactioncode) {
        this.ofactioncode = ofactioncode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFSubActionCode
     *
     * @return the value of OrderFlow.OFSubActionCode
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Integer getOfsubactioncode() {
        return ofsubactioncode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFSubActionCode
     *
     * @param ofsubactioncode the value for OrderFlow.OFSubActionCode
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfsubactioncode(Integer ofsubactioncode) {
        this.ofsubactioncode = ofsubactioncode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFCompleteDate
     *
     * @return the value of OrderFlow.OFCompleteDate
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Date getOfcompletedate() {
        return ofcompletedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFCompleteDate
     *
     * @param ofcompletedate the value for OrderFlow.OFCompleteDate
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfcompletedate(Date ofcompletedate) {
        this.ofcompletedate = ofcompletedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFCompleteStatusID
     *
     * @return the value of OrderFlow.OFCompleteStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Integer getOfcompletestatusid() {
        return ofcompletestatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFCompleteStatusID
     *
     * @param ofcompletestatusid the value for OrderFlow.OFCompleteStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfcompletestatusid(Integer ofcompletestatusid) {
        this.ofcompletestatusid = ofcompletestatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFCompletePayStatusID
     *
     * @return the value of OrderFlow.OFCompletePayStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Integer getOfcompletepaystatusid() {
        return ofcompletepaystatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFCompletePayStatusID
     *
     * @param ofcompletepaystatusid the value for OrderFlow.OFCompletePayStatusID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfcompletepaystatusid(Integer ofcompletepaystatusid) {
        this.ofcompletepaystatusid = ofcompletepaystatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFParentFlowID
     *
     * @return the value of OrderFlow.OFParentFlowID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Integer getOfparentflowid() {
        return ofparentflowid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFParentFlowID
     *
     * @param ofparentflowid the value for OrderFlow.OFParentFlowID
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfparentflowid(Integer ofparentflowid) {
        this.ofparentflowid = ofparentflowid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderFlow.OFIsSuccess
     *
     * @return the value of OrderFlow.OFIsSuccess
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public Boolean getOfissuccess() {
        return ofissuccess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderFlow.OFIsSuccess
     *
     * @param ofissuccess the value for OrderFlow.OFIsSuccess
     *
     * @mbg.generated Mon Feb 18 13:57:58 CST 2019
     */
    public void setOfissuccess(Boolean ofissuccess) {
        this.ofissuccess = ofissuccess;
    }
}