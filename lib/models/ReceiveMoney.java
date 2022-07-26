package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ReceiveMoney implements Serializable {

    @SerializedName("equipment")
    Equipment equipment;

    @SerializedName("cardlessReference")
    private String cardlessReference;

    @SerializedName("secretCode")
    private String secretCode;

    @SerializedName("pin")
    String pin;

    @SerializedName("customerPhone")
    String customerPhone;

    @SerializedName("name")
    String name;

    @SerializedName("amount")
    String amount;

    @SerializedName("currency")
    String currency;

    @SerializedName("currencyAlpha")
    String currencyAlpha;

    @SerializedName("customerId")
    String customerId;

    @SerializedName("idNumber")
    String idNumber;

    @SerializedName("memo")
    String memo;

    @SerializedName("fromAccount")
    String fromAccount;

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getCardlessReference() {
        return cardlessReference;
    }

    public void setCardlessReference(String reference) {
        this.cardlessReference = reference;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getCurrencyAlpha() {
        return currencyAlpha;
    }

    public void setCurrencyAlpha(String currencyAlpha) {
        this.currencyAlpha = currencyAlpha;
    }
}
