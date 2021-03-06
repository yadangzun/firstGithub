package com.adam.entity;

import java.io.Serializable;

public class OrderStatistics implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.ID
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSOrderId
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private Integer osorderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSOrderNo
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osorderno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSFParam
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osfparam;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSOpenUserId
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osopenuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSOpenUserName
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osopenusername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSOpIfActivity
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osopifactivity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSOpOfActivity
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osopofactivity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSOpens
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osopens;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSChannel
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String oschannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSConfirmNow
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private Integer osconfirmnow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSPriceModifyType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private Integer ospricemodifytype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSWXSource
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String oswxsource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSHotelBrand
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String oshotelbrand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSHotelUsed
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private Integer oshotelused;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSOriginProxyId
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osoriginproxyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSRefusalOrderType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private Integer osrefusalordertype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSProductType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osproducttype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSOuterOrigin
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osouterorigin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSClientType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osclienttype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSIsCommissionable
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osiscommissionable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSIshkmt
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osishkmt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSSupplierCurrencyCode
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String ossuppliercurrencycode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSOrderFrom
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private Long osorderfrom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OrderStatistics.OSOrderWxHoff
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private String osorderwxhoff;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table OrderStatistics
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.ID
     *
     * @return the value of OrderStatistics.ID
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.ID
     *
     * @param id the value for OrderStatistics.ID
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSOrderId
     *
     * @return the value of OrderStatistics.OSOrderId
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public Integer getOsorderid() {
        return osorderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSOrderId
     *
     * @param osorderid the value for OrderStatistics.OSOrderId
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsorderid(Integer osorderid) {
        this.osorderid = osorderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSOrderNo
     *
     * @return the value of OrderStatistics.OSOrderNo
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsorderno() {
        return osorderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSOrderNo
     *
     * @param osorderno the value for OrderStatistics.OSOrderNo
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsorderno(String osorderno) {
        this.osorderno = osorderno == null ? null : osorderno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSFParam
     *
     * @return the value of OrderStatistics.OSFParam
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsfparam() {
        return osfparam;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSFParam
     *
     * @param osfparam the value for OrderStatistics.OSFParam
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsfparam(String osfparam) {
        this.osfparam = osfparam == null ? null : osfparam.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSOpenUserId
     *
     * @return the value of OrderStatistics.OSOpenUserId
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsopenuserid() {
        return osopenuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSOpenUserId
     *
     * @param osopenuserid the value for OrderStatistics.OSOpenUserId
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsopenuserid(String osopenuserid) {
        this.osopenuserid = osopenuserid == null ? null : osopenuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSOpenUserName
     *
     * @return the value of OrderStatistics.OSOpenUserName
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsopenusername() {
        return osopenusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSOpenUserName
     *
     * @param osopenusername the value for OrderStatistics.OSOpenUserName
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsopenusername(String osopenusername) {
        this.osopenusername = osopenusername == null ? null : osopenusername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSOpIfActivity
     *
     * @return the value of OrderStatistics.OSOpIfActivity
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsopifactivity() {
        return osopifactivity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSOpIfActivity
     *
     * @param osopifactivity the value for OrderStatistics.OSOpIfActivity
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsopifactivity(String osopifactivity) {
        this.osopifactivity = osopifactivity == null ? null : osopifactivity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSOpOfActivity
     *
     * @return the value of OrderStatistics.OSOpOfActivity
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsopofactivity() {
        return osopofactivity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSOpOfActivity
     *
     * @param osopofactivity the value for OrderStatistics.OSOpOfActivity
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsopofactivity(String osopofactivity) {
        this.osopofactivity = osopofactivity == null ? null : osopofactivity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSOpens
     *
     * @return the value of OrderStatistics.OSOpens
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsopens() {
        return osopens;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSOpens
     *
     * @param osopens the value for OrderStatistics.OSOpens
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsopens(String osopens) {
        this.osopens = osopens == null ? null : osopens.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSChannel
     *
     * @return the value of OrderStatistics.OSChannel
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOschannel() {
        return oschannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSChannel
     *
     * @param oschannel the value for OrderStatistics.OSChannel
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOschannel(String oschannel) {
        this.oschannel = oschannel == null ? null : oschannel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSConfirmNow
     *
     * @return the value of OrderStatistics.OSConfirmNow
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public Integer getOsconfirmnow() {
        return osconfirmnow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSConfirmNow
     *
     * @param osconfirmnow the value for OrderStatistics.OSConfirmNow
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsconfirmnow(Integer osconfirmnow) {
        this.osconfirmnow = osconfirmnow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSPriceModifyType
     *
     * @return the value of OrderStatistics.OSPriceModifyType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public Integer getOspricemodifytype() {
        return ospricemodifytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSPriceModifyType
     *
     * @param ospricemodifytype the value for OrderStatistics.OSPriceModifyType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOspricemodifytype(Integer ospricemodifytype) {
        this.ospricemodifytype = ospricemodifytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSWXSource
     *
     * @return the value of OrderStatistics.OSWXSource
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOswxsource() {
        return oswxsource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSWXSource
     *
     * @param oswxsource the value for OrderStatistics.OSWXSource
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOswxsource(String oswxsource) {
        this.oswxsource = oswxsource == null ? null : oswxsource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSHotelBrand
     *
     * @return the value of OrderStatistics.OSHotelBrand
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOshotelbrand() {
        return oshotelbrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSHotelBrand
     *
     * @param oshotelbrand the value for OrderStatistics.OSHotelBrand
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOshotelbrand(String oshotelbrand) {
        this.oshotelbrand = oshotelbrand == null ? null : oshotelbrand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSHotelUsed
     *
     * @return the value of OrderStatistics.OSHotelUsed
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public Integer getOshotelused() {
        return oshotelused;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSHotelUsed
     *
     * @param oshotelused the value for OrderStatistics.OSHotelUsed
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOshotelused(Integer oshotelused) {
        this.oshotelused = oshotelused;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSOriginProxyId
     *
     * @return the value of OrderStatistics.OSOriginProxyId
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsoriginproxyid() {
        return osoriginproxyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSOriginProxyId
     *
     * @param osoriginproxyid the value for OrderStatistics.OSOriginProxyId
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsoriginproxyid(String osoriginproxyid) {
        this.osoriginproxyid = osoriginproxyid == null ? null : osoriginproxyid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSRefusalOrderType
     *
     * @return the value of OrderStatistics.OSRefusalOrderType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public Integer getOsrefusalordertype() {
        return osrefusalordertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSRefusalOrderType
     *
     * @param osrefusalordertype the value for OrderStatistics.OSRefusalOrderType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsrefusalordertype(Integer osrefusalordertype) {
        this.osrefusalordertype = osrefusalordertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSProductType
     *
     * @return the value of OrderStatistics.OSProductType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsproducttype() {
        return osproducttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSProductType
     *
     * @param osproducttype the value for OrderStatistics.OSProductType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsproducttype(String osproducttype) {
        this.osproducttype = osproducttype == null ? null : osproducttype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSOuterOrigin
     *
     * @return the value of OrderStatistics.OSOuterOrigin
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsouterorigin() {
        return osouterorigin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSOuterOrigin
     *
     * @param osouterorigin the value for OrderStatistics.OSOuterOrigin
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsouterorigin(String osouterorigin) {
        this.osouterorigin = osouterorigin == null ? null : osouterorigin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSClientType
     *
     * @return the value of OrderStatistics.OSClientType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsclienttype() {
        return osclienttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSClientType
     *
     * @param osclienttype the value for OrderStatistics.OSClientType
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsclienttype(String osclienttype) {
        this.osclienttype = osclienttype == null ? null : osclienttype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSIsCommissionable
     *
     * @return the value of OrderStatistics.OSIsCommissionable
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsiscommissionable() {
        return osiscommissionable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSIsCommissionable
     *
     * @param osiscommissionable the value for OrderStatistics.OSIsCommissionable
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsiscommissionable(String osiscommissionable) {
        this.osiscommissionable = osiscommissionable == null ? null : osiscommissionable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSIshkmt
     *
     * @return the value of OrderStatistics.OSIshkmt
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsishkmt() {
        return osishkmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSIshkmt
     *
     * @param osishkmt the value for OrderStatistics.OSIshkmt
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsishkmt(String osishkmt) {
        this.osishkmt = osishkmt == null ? null : osishkmt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSSupplierCurrencyCode
     *
     * @return the value of OrderStatistics.OSSupplierCurrencyCode
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOssuppliercurrencycode() {
        return ossuppliercurrencycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSSupplierCurrencyCode
     *
     * @param ossuppliercurrencycode the value for OrderStatistics.OSSupplierCurrencyCode
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOssuppliercurrencycode(String ossuppliercurrencycode) {
        this.ossuppliercurrencycode = ossuppliercurrencycode == null ? null : ossuppliercurrencycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSOrderFrom
     *
     * @return the value of OrderStatistics.OSOrderFrom
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public Long getOsorderfrom() {
        return osorderfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSOrderFrom
     *
     * @param osorderfrom the value for OrderStatistics.OSOrderFrom
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsorderfrom(Long osorderfrom) {
        this.osorderfrom = osorderfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OrderStatistics.OSOrderWxHoff
     *
     * @return the value of OrderStatistics.OSOrderWxHoff
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public String getOsorderwxhoff() {
        return osorderwxhoff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OrderStatistics.OSOrderWxHoff
     *
     * @param osorderwxhoff the value for OrderStatistics.OSOrderWxHoff
     *
     * @mbggenerated Wed Feb 20 19:34:10 CST 2019
     */
    public void setOsorderwxhoff(String osorderwxhoff) {
        this.osorderwxhoff = osorderwxhoff == null ? null : osorderwxhoff.trim();
    }
}