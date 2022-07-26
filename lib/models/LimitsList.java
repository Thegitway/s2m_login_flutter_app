package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LimitsList {

    @SerializedName("daily")
    public List<WalletLimit> dailyLimits = null;

    @SerializedName("weekly")
    public List<WalletLimit> weeklyLimits = null;

    @SerializedName("biweekly")
    public List<WalletLimit> biWeeklyLimits = null;

    @SerializedName("monthly")
    public List<WalletLimit> monthlyLimits = null;

    @SerializedName("annual")
    public List<WalletLimit> annualLimits = null;


    public List<WalletLimit> getDailyLimits() {
        return dailyLimits;
    }

    public void setDailyLimits(List<WalletLimit> dailyLimits) {
        this.dailyLimits = dailyLimits;
    }

    public List<WalletLimit> getWeeklyLimits() {
        return weeklyLimits;
    }

    public void setWeeklyLimits(List<WalletLimit> weeklyLimits) {
        this.weeklyLimits = weeklyLimits;
    }

    public List<WalletLimit> getMonthlyLimits() {
        return monthlyLimits;
    }

    public void setMonthlyLimits(List<WalletLimit> monthlyLimits) {
        this.monthlyLimits = monthlyLimits;
    }

    public List<WalletLimit> getBiWeeklyLimits() {
        return biWeeklyLimits;
    }

    public void setBiWeeklyLimits(List<WalletLimit> biWeeklyLimits) {
        this.biWeeklyLimits = biWeeklyLimits;
    }

    public List<WalletLimit> getAnnualLimits() {
        return annualLimits;
    }

    public void setAnnualLimits(List<WalletLimit> annualLimits) {
        this.annualLimits = annualLimits;
    }
}
