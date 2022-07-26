package com.s2m.gbmagent.Model;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ChangeLimit implements Serializable {

    @SerializedName("currency")
    private String currency;

    @SerializedName("currentLimit")
    private int currentLimit;

    @SerializedName("maxLimit")
    private int maxLimit;

    @SerializedName("dailyPaymentAmount")
    private int dailyPaymentAmount;

    @SerializedName("weeklyPaymentAmount")
    private int weeklyPaymentAmount;

    @SerializedName("monthlyPaymentAmount")
    private int monthlyPaymentAmount;

    @SerializedName("dailyWithdrawalAmount")
    private int dailyWithdrawalAmount;

    @SerializedName("weeklyWithdrawalAmount")
    private int weeklyWithdrawalAmount;

    @SerializedName("monthlyWithdrawalAmount")
    private int monthlyWithdrawalAmount;

    public int getDailyPaymentAmount() {
        return dailyPaymentAmount;
    }

    public void setDailyPaymentAmount(int dailyPaymentAmount) {
        this.dailyPaymentAmount = dailyPaymentAmount;
    }

    public int getWeeklyPaymentAmount() {
        return weeklyPaymentAmount;
    }

    public void setWeeklyPaymentAmount(int weeklyPaymentAmount) {
        this.weeklyPaymentAmount = weeklyPaymentAmount;
    }

    public int getMonthlyPaymentAmount() {
        return monthlyPaymentAmount;
    }

    public void setMonthlyPaymentAmount(int monthlyPaymentAmount) {
        this.monthlyPaymentAmount = monthlyPaymentAmount;
    }

    public int getDailyWithdrawalAmount() {
        return dailyWithdrawalAmount;
    }

    public void setDailyWithdrawalAmount(int dailyWithdrawalAmount) {
        this.dailyWithdrawalAmount = dailyWithdrawalAmount;
    }

    public int getWeeklyWithdrawalAmount() {
        return weeklyWithdrawalAmount;
    }

    public void setWeeklyWithdrawalAmount(int weeklyWithdrawalAmount) {
        this.weeklyWithdrawalAmount = weeklyWithdrawalAmount;
    }

    public int getMonthlyWithdrawalAmount() {
        return monthlyWithdrawalAmount;
    }

    public void setMonthlyWithdrawalAmount(int monthlyWithdrawalAmount) {
        this.monthlyWithdrawalAmount = monthlyWithdrawalAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
}

