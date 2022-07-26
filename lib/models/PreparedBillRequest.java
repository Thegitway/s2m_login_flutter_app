package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PreparedBillRequest implements Serializable {

    @SerializedName("userLogin")
    private String userLogin;

    @SerializedName("userPhone")
    private String userPhone;

    @SerializedName("currency")
    private String currency;

    @SerializedName("currencyLabel")
    private String currencyLabel;

    @SerializedName("amount")
    private String amount;

    @SerializedName("billerCode")
    private String billerCode;

    @SerializedName("billerName")
    private String billerName;

    @SerializedName("billReference")
    private String billReference;

    @SerializedName("walletCode")
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

    public String getBillerCode() {
        return billerCode;
    }

    public void setBillerCode(String billerCode) {
        this.billerCode = billerCode;
    }

    public String getBillerName() {
        return billerName;
    }

    public void setBillerName(String billerName) {
        this.billerName = billerName;
    }

    public String getBillReference() {
        return billReference;
    }

    public void setBillReference(String billReference) {
        this.billReference = billReference;
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

    public String getCurrencyLabel() {
        return currencyLabel;
    }

    public void setCurrencyLabel(String currencyLabel) {
        this.currencyLabel = currencyLabel;
    }

    @Override
    public String toString() {
        return "PreparedBillRequest{" +
                "userLogin='" + userLogin + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                ", billerCode='" + billerCode + '\'' +
                ", billerName='" + billerName + '\'' +
                ", billReference='" + billReference + '\'' +
                ", walletCode='" + walletCode + '\'' +
                ", memo='" + memo + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
