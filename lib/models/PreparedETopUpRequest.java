package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PreparedETopUpRequest implements Serializable {

    @SerializedName("userLogin")
    private String userLogin;

    @SerializedName("userPhone")
    private String userPhone;

    @SerializedName("currency")
    private String currency;

    @SerializedName("amount")
    private String amount;

    @SerializedName("operatorCode")
    private String operatorCode;

    @SerializedName("operatorName")
    private String operatorName;

    @SerializedName("etopupPhoneNumber")
    private String phoneNumber;

    @SerializedName("cardCode")
    private String walletCode;

    @SerializedName("memo")
    private String memo;

    @SerializedName("pin")
    private String pin;

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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
}
