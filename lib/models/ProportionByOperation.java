package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

public class ProportionByOperation {

    @SerializedName("operationId")
    public int operationId;

    @SerializedName("operationName")
    public String operationName;

    @SerializedName("percent")
    public String percent;

    @SerializedName("totalAmount")
    public String totalAmount;

    @SerializedName("curCode")
    public String curCode;

    @SerializedName("curIden")
    public String curIden;

    @SerializedName("curDecimal")
    public float curDecimal;

    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

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

    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }

    public String getCurIden() {
        return curIden;
    }

    public void setCurIden(String curIden) {
        this.curIden = curIden;
    }

    public float getCurDecimal() {
        return curDecimal;
    }

    public void setCurDecimal(float curDecimal) {
        this.curDecimal = curDecimal;
    }
}
