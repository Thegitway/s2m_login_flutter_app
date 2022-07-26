package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

public class WalletLimit {

    @SerializedName("service")
    public String serviceName;

    @SerializedName("maxAmount")
    public String maxAmount;

    @SerializedName("maxCounter")
    public String maxCounter;

    @SerializedName("currency")
    public String currency;


    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getMaxCounter() {
        return maxCounter;
    }

    public void setMaxCounter(String maxCounter) {
        this.maxCounter = maxCounter;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
