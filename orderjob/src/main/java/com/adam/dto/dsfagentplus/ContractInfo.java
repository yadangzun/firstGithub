package com.adam.dto.dsfagentplus;

public class ContractInfo {
    /**
     * 预订人电话
     */
    private String contractMobile;

    /**
     * 预订人姓名
     */
    private String contractName;

    /**
     * 预订人名
     */
    private String contactFirstName;

    /**
     * 预订人姓
     */
    private String contactLastName;

    /**
     * 预订人邮箱
     */
    private String contactEmail;

    /**
     * 预订人国籍(ISO国籍编码)
     */
    private String contactNationality;

    public String getContractMobile() {
        return contractMobile;
    }

    public void setContractMobile(String contractMobile) {
        this.contractMobile = contractMobile;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactNationality() {
        return contactNationality;
    }

    public void setContactNationality(String contactNationality) {
        this.contactNationality = contactNationality;
    }
}
