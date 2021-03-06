package com.adam.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderRoom implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.OROrderID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Integer ororderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.OROrderNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String ororderno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORSupplierConfirmationNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orsupplierconfirmationno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORSupplierCancellationNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orsuppliercancellationno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORCancellationReasonID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Integer orcancellationreasonid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORCancellationDate
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Date orcancellationdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORAmount
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private BigDecimal oramount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORCurrencyID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Integer orcurrencyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORComission
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private BigDecimal orcomission;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORRefoundAmount
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private BigDecimal orrefoundamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORCancellationNights
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Integer orcancellationnights;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORGuestRemark
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orguestremark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORRoomNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orroomno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORNumberOfAdults
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Integer ornumberofadults;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORNumberOfChidren
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Integer ornumberofchidren;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORSmokingPreference
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orsmokingpreference;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORGuestFirstName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orguestfirstname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORGuestLastName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orguestlastname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORChildAges
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orchildages;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORBedTypeID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Integer orbedtypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORNumberOfBeds
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Integer ornumberofbeds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORNightlyAmounts
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String ornightlyamounts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORRateKey
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orratekey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORBedTypeName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orbedtypename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORGuestNationality
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orguestnationality;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORGuestOtherNames
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orguestothernames;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORConfirmationNoUpdate
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Boolean orconfirmationnoupdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORSupplierNightlyAmounts
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orsuppliernightlyamounts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORSupplierTotalTax
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private BigDecimal orsuppliertotaltax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORSupplierNightlyRoomPrice
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orsuppliernightlyroomprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORHotelConfirmationNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orhotelconfirmationno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORBedTypeTips
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orbedtypetips;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORRoomNameDesc
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orroomnamedesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORMaxPersonNum
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private Integer ormaxpersonnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderRoom.ORRoomTypeName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private String orroomtypename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table OrderRoom
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ID
     *
     * @return the value of OrderRoom.ID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ID
     *
     * @param id the value for OrderRoom.ID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.OROrderID
     *
     * @return the value of OrderRoom.OROrderID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Integer getOrorderid() {
        return ororderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.OROrderID
     *
     * @param ororderid the value for OrderRoom.OROrderID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrorderid(Integer ororderid) {
        this.ororderid = ororderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.OROrderNo
     *
     * @return the value of OrderRoom.OROrderNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrorderno() {
        return ororderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.OROrderNo
     *
     * @param ororderno the value for OrderRoom.OROrderNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrorderno(String ororderno) {
        this.ororderno = ororderno == null ? null : ororderno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORSupplierConfirmationNo
     *
     * @return the value of OrderRoom.ORSupplierConfirmationNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrsupplierconfirmationno() {
        return orsupplierconfirmationno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORSupplierConfirmationNo
     *
     * @param orsupplierconfirmationno the value for OrderRoom.ORSupplierConfirmationNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrsupplierconfirmationno(String orsupplierconfirmationno) {
        this.orsupplierconfirmationno = orsupplierconfirmationno == null ? null : orsupplierconfirmationno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORSupplierCancellationNo
     *
     * @return the value of OrderRoom.ORSupplierCancellationNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrsuppliercancellationno() {
        return orsuppliercancellationno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORSupplierCancellationNo
     *
     * @param orsuppliercancellationno the value for OrderRoom.ORSupplierCancellationNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrsuppliercancellationno(String orsuppliercancellationno) {
        this.orsuppliercancellationno = orsuppliercancellationno == null ? null : orsuppliercancellationno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORCancellationReasonID
     *
     * @return the value of OrderRoom.ORCancellationReasonID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Integer getOrcancellationreasonid() {
        return orcancellationreasonid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORCancellationReasonID
     *
     * @param orcancellationreasonid the value for OrderRoom.ORCancellationReasonID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrcancellationreasonid(Integer orcancellationreasonid) {
        this.orcancellationreasonid = orcancellationreasonid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORCancellationDate
     *
     * @return the value of OrderRoom.ORCancellationDate
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Date getOrcancellationdate() {
        return orcancellationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORCancellationDate
     *
     * @param orcancellationdate the value for OrderRoom.ORCancellationDate
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrcancellationdate(Date orcancellationdate) {
        this.orcancellationdate = orcancellationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORAmount
     *
     * @return the value of OrderRoom.ORAmount
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public BigDecimal getOramount() {
        return oramount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORAmount
     *
     * @param oramount the value for OrderRoom.ORAmount
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOramount(BigDecimal oramount) {
        this.oramount = oramount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORCurrencyID
     *
     * @return the value of OrderRoom.ORCurrencyID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Integer getOrcurrencyid() {
        return orcurrencyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORCurrencyID
     *
     * @param orcurrencyid the value for OrderRoom.ORCurrencyID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrcurrencyid(Integer orcurrencyid) {
        this.orcurrencyid = orcurrencyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORComission
     *
     * @return the value of OrderRoom.ORComission
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public BigDecimal getOrcomission() {
        return orcomission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORComission
     *
     * @param orcomission the value for OrderRoom.ORComission
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrcomission(BigDecimal orcomission) {
        this.orcomission = orcomission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORRefoundAmount
     *
     * @return the value of OrderRoom.ORRefoundAmount
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public BigDecimal getOrrefoundamount() {
        return orrefoundamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORRefoundAmount
     *
     * @param orrefoundamount the value for OrderRoom.ORRefoundAmount
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrrefoundamount(BigDecimal orrefoundamount) {
        this.orrefoundamount = orrefoundamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORCancellationNights
     *
     * @return the value of OrderRoom.ORCancellationNights
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Integer getOrcancellationnights() {
        return orcancellationnights;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORCancellationNights
     *
     * @param orcancellationnights the value for OrderRoom.ORCancellationNights
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrcancellationnights(Integer orcancellationnights) {
        this.orcancellationnights = orcancellationnights;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORGuestRemark
     *
     * @return the value of OrderRoom.ORGuestRemark
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrguestremark() {
        return orguestremark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORGuestRemark
     *
     * @param orguestremark the value for OrderRoom.ORGuestRemark
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrguestremark(String orguestremark) {
        this.orguestremark = orguestremark == null ? null : orguestremark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORRoomNo
     *
     * @return the value of OrderRoom.ORRoomNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrroomno() {
        return orroomno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORRoomNo
     *
     * @param orroomno the value for OrderRoom.ORRoomNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrroomno(String orroomno) {
        this.orroomno = orroomno == null ? null : orroomno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORNumberOfAdults
     *
     * @return the value of OrderRoom.ORNumberOfAdults
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Integer getOrnumberofadults() {
        return ornumberofadults;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORNumberOfAdults
     *
     * @param ornumberofadults the value for OrderRoom.ORNumberOfAdults
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrnumberofadults(Integer ornumberofadults) {
        this.ornumberofadults = ornumberofadults;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORNumberOfChidren
     *
     * @return the value of OrderRoom.ORNumberOfChidren
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Integer getOrnumberofchidren() {
        return ornumberofchidren;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORNumberOfChidren
     *
     * @param ornumberofchidren the value for OrderRoom.ORNumberOfChidren
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrnumberofchidren(Integer ornumberofchidren) {
        this.ornumberofchidren = ornumberofchidren;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORSmokingPreference
     *
     * @return the value of OrderRoom.ORSmokingPreference
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrsmokingpreference() {
        return orsmokingpreference;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORSmokingPreference
     *
     * @param orsmokingpreference the value for OrderRoom.ORSmokingPreference
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrsmokingpreference(String orsmokingpreference) {
        this.orsmokingpreference = orsmokingpreference == null ? null : orsmokingpreference.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORGuestFirstName
     *
     * @return the value of OrderRoom.ORGuestFirstName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrguestfirstname() {
        return orguestfirstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORGuestFirstName
     *
     * @param orguestfirstname the value for OrderRoom.ORGuestFirstName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrguestfirstname(String orguestfirstname) {
        this.orguestfirstname = orguestfirstname == null ? null : orguestfirstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORGuestLastName
     *
     * @return the value of OrderRoom.ORGuestLastName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrguestlastname() {
        return orguestlastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORGuestLastName
     *
     * @param orguestlastname the value for OrderRoom.ORGuestLastName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrguestlastname(String orguestlastname) {
        this.orguestlastname = orguestlastname == null ? null : orguestlastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORChildAges
     *
     * @return the value of OrderRoom.ORChildAges
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrchildages() {
        return orchildages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORChildAges
     *
     * @param orchildages the value for OrderRoom.ORChildAges
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrchildages(String orchildages) {
        this.orchildages = orchildages == null ? null : orchildages.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORBedTypeID
     *
     * @return the value of OrderRoom.ORBedTypeID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Integer getOrbedtypeid() {
        return orbedtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORBedTypeID
     *
     * @param orbedtypeid the value for OrderRoom.ORBedTypeID
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrbedtypeid(Integer orbedtypeid) {
        this.orbedtypeid = orbedtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORNumberOfBeds
     *
     * @return the value of OrderRoom.ORNumberOfBeds
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Integer getOrnumberofbeds() {
        return ornumberofbeds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORNumberOfBeds
     *
     * @param ornumberofbeds the value for OrderRoom.ORNumberOfBeds
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrnumberofbeds(Integer ornumberofbeds) {
        this.ornumberofbeds = ornumberofbeds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORNightlyAmounts
     *
     * @return the value of OrderRoom.ORNightlyAmounts
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrnightlyamounts() {
        return ornightlyamounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORNightlyAmounts
     *
     * @param ornightlyamounts the value for OrderRoom.ORNightlyAmounts
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrnightlyamounts(String ornightlyamounts) {
        this.ornightlyamounts = ornightlyamounts == null ? null : ornightlyamounts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORRateKey
     *
     * @return the value of OrderRoom.ORRateKey
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrratekey() {
        return orratekey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORRateKey
     *
     * @param orratekey the value for OrderRoom.ORRateKey
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrratekey(String orratekey) {
        this.orratekey = orratekey == null ? null : orratekey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORBedTypeName
     *
     * @return the value of OrderRoom.ORBedTypeName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrbedtypename() {
        return orbedtypename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORBedTypeName
     *
     * @param orbedtypename the value for OrderRoom.ORBedTypeName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrbedtypename(String orbedtypename) {
        this.orbedtypename = orbedtypename == null ? null : orbedtypename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORGuestNationality
     *
     * @return the value of OrderRoom.ORGuestNationality
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrguestnationality() {
        return orguestnationality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORGuestNationality
     *
     * @param orguestnationality the value for OrderRoom.ORGuestNationality
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrguestnationality(String orguestnationality) {
        this.orguestnationality = orguestnationality == null ? null : orguestnationality.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORGuestOtherNames
     *
     * @return the value of OrderRoom.ORGuestOtherNames
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrguestothernames() {
        return orguestothernames;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORGuestOtherNames
     *
     * @param orguestothernames the value for OrderRoom.ORGuestOtherNames
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrguestothernames(String orguestothernames) {
        this.orguestothernames = orguestothernames == null ? null : orguestothernames.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORConfirmationNoUpdate
     *
     * @return the value of OrderRoom.ORConfirmationNoUpdate
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Boolean getOrconfirmationnoupdate() {
        return orconfirmationnoupdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORConfirmationNoUpdate
     *
     * @param orconfirmationnoupdate the value for OrderRoom.ORConfirmationNoUpdate
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrconfirmationnoupdate(Boolean orconfirmationnoupdate) {
        this.orconfirmationnoupdate = orconfirmationnoupdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORSupplierNightlyAmounts
     *
     * @return the value of OrderRoom.ORSupplierNightlyAmounts
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrsuppliernightlyamounts() {
        return orsuppliernightlyamounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORSupplierNightlyAmounts
     *
     * @param orsuppliernightlyamounts the value for OrderRoom.ORSupplierNightlyAmounts
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrsuppliernightlyamounts(String orsuppliernightlyamounts) {
        this.orsuppliernightlyamounts = orsuppliernightlyamounts == null ? null : orsuppliernightlyamounts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORSupplierTotalTax
     *
     * @return the value of OrderRoom.ORSupplierTotalTax
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public BigDecimal getOrsuppliertotaltax() {
        return orsuppliertotaltax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORSupplierTotalTax
     *
     * @param orsuppliertotaltax the value for OrderRoom.ORSupplierTotalTax
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrsuppliertotaltax(BigDecimal orsuppliertotaltax) {
        this.orsuppliertotaltax = orsuppliertotaltax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORSupplierNightlyRoomPrice
     *
     * @return the value of OrderRoom.ORSupplierNightlyRoomPrice
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrsuppliernightlyroomprice() {
        return orsuppliernightlyroomprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORSupplierNightlyRoomPrice
     *
     * @param orsuppliernightlyroomprice the value for OrderRoom.ORSupplierNightlyRoomPrice
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrsuppliernightlyroomprice(String orsuppliernightlyroomprice) {
        this.orsuppliernightlyroomprice = orsuppliernightlyroomprice == null ? null : orsuppliernightlyroomprice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORHotelConfirmationNo
     *
     * @return the value of OrderRoom.ORHotelConfirmationNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrhotelconfirmationno() {
        return orhotelconfirmationno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORHotelConfirmationNo
     *
     * @param orhotelconfirmationno the value for OrderRoom.ORHotelConfirmationNo
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrhotelconfirmationno(String orhotelconfirmationno) {
        this.orhotelconfirmationno = orhotelconfirmationno == null ? null : orhotelconfirmationno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORBedTypeTips
     *
     * @return the value of OrderRoom.ORBedTypeTips
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrbedtypetips() {
        return orbedtypetips;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORBedTypeTips
     *
     * @param orbedtypetips the value for OrderRoom.ORBedTypeTips
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrbedtypetips(String orbedtypetips) {
        this.orbedtypetips = orbedtypetips == null ? null : orbedtypetips.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORRoomNameDesc
     *
     * @return the value of OrderRoom.ORRoomNameDesc
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrroomnamedesc() {
        return orroomnamedesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORRoomNameDesc
     *
     * @param orroomnamedesc the value for OrderRoom.ORRoomNameDesc
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrroomnamedesc(String orroomnamedesc) {
        this.orroomnamedesc = orroomnamedesc == null ? null : orroomnamedesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORMaxPersonNum
     *
     * @return the value of OrderRoom.ORMaxPersonNum
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public Integer getOrmaxpersonnum() {
        return ormaxpersonnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORMaxPersonNum
     *
     * @param ormaxpersonnum the value for OrderRoom.ORMaxPersonNum
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrmaxpersonnum(Integer ormaxpersonnum) {
        this.ormaxpersonnum = ormaxpersonnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderRoom.ORRoomTypeName
     *
     * @return the value of OrderRoom.ORRoomTypeName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public String getOrroomtypename() {
        return orroomtypename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderRoom.ORRoomTypeName
     *
     * @param orroomtypename the value for OrderRoom.ORRoomTypeName
     *
     * @mbggenerated Thu Feb 21 12:21:14 CST 2019
     */
    public void setOrroomtypename(String orroomtypename) {
        this.orroomtypename = orroomtypename == null ? null : orroomtypename.trim();
    }
}