package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

public class WalletLimitsResponse {

    @SerializedName("limitsList")
    public LimitsList limitsList;

    @SerializedName("responseCode")
    public String responseCode;

    @SerializedName("responseDescription")
    public String responseDescription;

    @SerializedName("responseTime")
    public String responseTime;

    @SerializedName("responseReference")
    public String responseReference;

    public LimitsList getLimitsList() {
        return limitsList;
    }

    public void setLimitsList(LimitsList limitsList) {
        this.limitsList = limitsList;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getResponseReference() {
        return responseReference;
    }

    public void setResponseReference(String responseReference) {
        this.responseReference = responseReference;
    }
}
