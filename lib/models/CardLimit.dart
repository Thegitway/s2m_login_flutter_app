package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CardLimit implements Serializable {

    public static final int DAILY_PERIODICITY = 0;
    public static final int WEEKLY_PERIODICITY = 1;
    public static final int MONTHLY_PERIODICITY = 2;

    @SerializedName("periodicity")
    private int periodicity;

    @SerializedName("currencyAlphaCode")
    private int currencyAlphaCode;

    @SerializedName("currencyIden")
    private String currencyIden;

    @SerializedName("currency")
    private String currency;

    @SerializedName("currentLimit")
    private int currentLimit;

    @SerializedName("maxLimit")
    private int maxLimit;

    @SerializedName("withdrawalLimits")
    private String withdrawalLimits;

    @SerializedName("limitKey")
    private String limitKey;

    @SerializedName("limitValue")
    private String limitValue;


    public int getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }

    public int getCurrencyAlphaCode() {
        return currencyAlphaCode;
    }

    public void setCurrencyAlphaCode(int currencyAlphaCode) {
        this.currencyAlphaCode = currencyAlphaCode;
    }

    public String getCurrencyIden() {
        return currencyIden;
    }

    public void setCurrencyIden(String currencyIden) {
        this.currencyIden = currencyIden;
    }

    public int getCurrentLimit() {
        return currentLimit;
    }

    public void setCurrentLimit(int currentLimit) {
        this.currentLimit = currentLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public String getWithdrawalLimits() {
        return withdrawalLimits;
    }

    public void setWithdrawalLimits(String withdrawalLimits) {
        this.withdrawalLimits = withdrawalLimits;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLimitKey() {
        return limitKey;
    }

    public void setLimitKey(String limitKey) {
        this.limitKey = limitKey;
    }

    public String getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(String limitValue) {
        this.limitValue = limitValue;
    }
}

