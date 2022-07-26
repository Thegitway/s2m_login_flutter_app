package com.s2m.gbmagent.Model;

public class ChannelObject {

    private int channelId;

    private String channelName;

    private String currentMonthSum;

    private String lastMonthSum;

    private String currency;

    private String sum;

    private String percent;

    private String totalAmount;

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getCurrentMonthSum() {
        return currentMonthSum;
    }

    public void setCurrentMonthSum(String currentMonthSum) {
        this.currentMonthSum = currentMonthSum;
    }

    public String getLastMonthSum() {
        return lastMonthSum;
    }

    public void setLastMonthSum(String lastMonthSum) {
        this.lastMonthSum = lastMonthSum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
}
