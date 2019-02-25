package com.adam.dto.dsfagentplus;

public class CreditCardInfo {
    /**
     * 持卡人姓名
     */
    private String creditCardholder;

    /**
     * 卡类型（供应商卡类型）
     */
    private String creditCardType;

    /**
     * 卡号
     */
    private String creditCardNumber;

    /**
     * 信用卡验证码,卡背面末三位
     */
    private String creditCardIdentifier;

    /**
     * 信用卡有效期月份
     */
    private String creditCardExpirationMonth;

    /**
     * 信用卡有效年份
     */
    private String creditCardExpirationYear;

    public String getCreditCardholder() {
        return creditCardholder;
    }

    public void setCreditCardholder(String creditCardholder) {
        this.creditCardholder = creditCardholder;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardIdentifier() {
        return creditCardIdentifier;
    }

    public void setCreditCardIdentifier(String creditCardIdentifier) {
        this.creditCardIdentifier = creditCardIdentifier;
    }

    public String getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    public void setCreditCardExpirationMonth(String creditCardExpirationMonth) {
        this.creditCardExpirationMonth = creditCardExpirationMonth;
    }

    public String getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    public void setCreditCardExpirationYear(String creditCardExpirationYear) {
        this.creditCardExpirationYear = creditCardExpirationYear;
    }
}
