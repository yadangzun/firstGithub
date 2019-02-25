package com.adam.dto.dsfagentplus;

public class GuestInfo {
    /**
     * 入住人姓名
     * */
    private String guestName;

    /**
     * 入住人性别(0:男；1：女)
     * */
    private Integer guestGender;

    /**
     * 入住人电话
     * */
    private String guestMobile;

    /**
     * 入住人名
     * */

    private String guestFirstName;

    /**
     * 入住人姓
     * */

    private String guestLastName;

    /**
     * 国籍
     * */
    private String guestNationality;

    /**
     * 类型（Adult、Child、Infant）
     * */
    private String guestType;

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public Integer getGuestGender() {
        return guestGender;
    }

    public void setGuestGender(Integer guestGender) {
        this.guestGender = guestGender;
    }

    public String getGuestMobile() {
        return guestMobile;
    }

    public void setGuestMobile(String guestMobile) {
        this.guestMobile = guestMobile;
    }

    public String getGuestFirstName() {
        return guestFirstName;
    }

    public void setGuestFirstName(String guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    public String getGuestLastName() {
        return guestLastName;
    }

    public void setGuestLastName(String guestLastName) {
        this.guestLastName = guestLastName;
    }

    public String getGuestNationality() {
        return guestNationality;
    }

    public void setGuestNationality(String guestNationality) {
        this.guestNationality = guestNationality;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }
}
