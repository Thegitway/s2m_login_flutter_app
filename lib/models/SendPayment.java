package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SendPayment implements Serializable {

    @SerializedName("amount")
    private Double amount;

    @SerializedName("agentCountry")
    private String agentCountry;

    @SerializedName("fromAccountCurrency")
    private String fromAccountCurrency;

    @SerializedName("fromAccount")
    private String fromAccount;

    @SerializedName("maskedPanFrom")
    private String maskedPanFrom;

    @SerializedName("toAccount")
    private String toAccount;

    @SerializedName("currencyDestination")
    private String currencyDestination;

    @SerializedName("agentPhone")
    private String agentPhone;

    @SerializedName("agentCity")
    private String agentCity;

    @SerializedName("agentName")
    private String agentName;

    @SerializedName("mcc")
    private String mcc;

    @SerializedName("cardlessReference")
    private String cardlessReference;

    @SerializedName("expiryDate")
    private String expiryDate;

    @SerializedName("idMerchant")
    private String idMerchant;

    @SerializedName("date")
    private String date;

    @SerializedName("valueDate")
    private String valueDate;

    @SerializedName("currency")
    private String currency;

    @SerializedName("stan")
    private String stan;

    @SerializedName("note")
    private String note;
    @SerializedName("currencyAlphaCode")
    private String currencyAlphaCode;

    @SerializedName("qrIndicator")
    private Boolean qrIndicator = true;

    private boolean amountIndicator = false;

    private String currencyIden;
    private String currencyToIden;


    @SerializedName("fromEquipment")
    private Equipment fromEquipment ;


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIdMerchant() {
        return idMerchant;
    }

    public void setIdMerchant(String idMerchant) {
        this.idMerchant = idMerchant;
    }

    public String getCardlessReference() {
        return cardlessReference;
    }

    public void setCardlessReference(String cardlessReference) {
        this.cardlessReference = cardlessReference;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAgentCountry() {
        return agentCountry;
    }

    public void setAgentCountry(String agentCountry) {
        this.agentCountry = agentCountry;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getCurrencyDestination() {
        return currencyDestination;
    }

    public void setCurrencyDestination(String currencyDestination) {
        this.currencyDestination = currencyDestination;
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    public String getAgentCity() {
        return agentCity;
    }

    public void setAgentCity(String agentCity) {
        this.agentCity = agentCity;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getCurrencyAlphaCode() {
        return currencyAlphaCode;
    }

    public void setCurrencyAlphaCode(String currencyAlphaCode) {
        this.currencyAlphaCode = currencyAlphaCode;
    }

    public Boolean getQrIndicator() {
        return qrIndicator;
    }

    public void setQrIndicator(Boolean qrIndicator) {
        this.qrIndicator = qrIndicator;
    }

    public Equipment getFromEquipment() {
        return fromEquipment;
    }

    public void setFromEquipment(Equipment fromEquipment) {
        this.fromEquipment = fromEquipment;
    }

    public boolean isAmountIndicator() {
        return amountIndicator;
    }

    public void setAmountIndicator(boolean amountIndicator) {
        this.amountIndicator = amountIndicator;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }
}
