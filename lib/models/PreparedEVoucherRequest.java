package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PreparedEVoucherRequest implements Serializable {

    @SerializedName("userLogin")
    private String userLogin;

    @SerializedName("userPhone")
    private String userPhone;

    @SerializedName("operatorCode")
    private String operatorCode;

    @SerializedName("operatorName")
    private String operatorName;

    @SerializedName("denominationCode")
    private String deneminationCode;

    @SerializedName("denominationValue")
    private String deneminationValue;

    @SerializedName("cardCode")
    private String walletCode;

    @SerializedName("memo")
    private String memo;

    @SerializedName("pin")
    private String pin;

    @SerializedName("toPhone")
    private String toPhone;

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getDeneminationCode() {
        return deneminationCode;
    }

    public void setDeneminationCode(String deneminationCode) {
        this.deneminationCode = deneminationCode;
    }

    public String getDeneminationValue() {
        return deneminationValue;
    }

    public void setDeneminationValue(String deneminationValue) {
        this.deneminationValue = deneminationValue;
    }

    public String getWalletCode() {
        return walletCode;
    }

    public void setWalletCode(String walletCode) {
        this.walletCode = walletCode;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getToPhone() {
        return toPhone;
    }

    public void setToPhone(String toPhone) {
        this.toPhone = toPhone;
    }
}
