package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CardDetailsBean implements Serializable {


    @SerializedName("maskedPan")
    private String maskedPan;

    @SerializedName("nameOnCard")
    private String nameOnCard;

    @SerializedName("expirydate")
    private String expirydate;

    @SerializedName("cardStatus")
    private int cardStatus;

    @SerializedName("payementLimitsAmount")
    private int payementLimitsAmount;

    @SerializedName("withdrawLimitsAmount")
    private int withdrawLimitsAmount;

    @SerializedName("currency")
    private String currency;


    public String getMaskedPan() {
        return maskedPan;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public int getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(int cardStatus) {
        this.cardStatus = cardStatus;
    }

    public int getPayementLimitsAmount() {
        return payementLimitsAmount;
    }

    public void setPayementLimitsAmount(int payementLimitsAmount) {
        this.payementLimitsAmount = payementLimitsAmount;
    }

    public int getWithdrawLimitsAmount() {
        return withdrawLimitsAmount;
    }

    public void setWithdrawLimitsAmount(int withdrawLimitsAmount) {
        this.withdrawLimitsAmount = withdrawLimitsAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
