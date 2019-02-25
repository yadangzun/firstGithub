package com.adam.dto.dsfagentplus;

import java.math.BigDecimal;

public class AmountInfo {
    /**
     * 下供应商订单总金额
     */
    private BigDecimal totalAmount;

    /**
     * 下供应商订单总金额币种(iso编码)
     */
    private String currencyCodeOfTotalAmount;

    /**
     * 供应商底价总金额
     */

    private BigDecimal baseTotalAmount;

    /**
     * 供应商底价总金额币种(iso编码)
     */
    private String currencyCodeOfBaseTotalAmount;

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCurrencyCodeOfTotalAmount() {
        return currencyCodeOfTotalAmount;
    }

    public void setCurrencyCodeOfTotalAmount(String currencyCodeOfTotalAmount) {
        this.currencyCodeOfTotalAmount = currencyCodeOfTotalAmount;
    }

    public BigDecimal getBaseTotalAmount() {
        return baseTotalAmount;
    }

    public void setBaseTotalAmount(BigDecimal baseTotalAmount) {
        this.baseTotalAmount = baseTotalAmount;
    }

    public String getCurrencyCodeOfBaseTotalAmount() {
        return currencyCodeOfBaseTotalAmount;
    }

    public void setCurrencyCodeOfBaseTotalAmount(String currencyCodeOfBaseTotalAmount) {
        this.currencyCodeOfBaseTotalAmount = currencyCodeOfBaseTotalAmount;
    }
}
