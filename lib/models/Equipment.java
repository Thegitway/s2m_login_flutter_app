package com.s2m.gbmagent.Model;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by S2M on 2020-04-06.
 */

public class Equipment implements Serializable {

    @SerializedName("idWallet")
    private String idWallet;

    @SerializedName("id")
    private String id;

    @SerializedName("currencyAlphaCode")
    private String currencyAlphaCode;

    @SerializedName("currencyIden")
    private String currencyIden;

    @SerializedName("balance")
    private Double balance;

    @SerializedName("lastTenTransactionList")
    private List<Transaction> transactionList ;


    @SerializedName("defaultStatus")
    private Boolean defaultStatus;

    @SerializedName("maskedPan")
    private String maskedPan;

    @SerializedName("status")
    private int status;

    @SerializedName("type")
    private String type;

    @SerializedName("agentType")
    private String agentType = "1" ;

    @SerializedName("agentFullName")
    private String agentFullName ;

    //move to another entity
    @SerializedName("idPersoWallet")
    private String idPersoWallet  ;

    @SerializedName("phoneNumber")
    private String phoneNumber  ;

    @SerializedName("firstName")
    private String firstName  ;

    @SerializedName("lastName")
    private String lastName  ;


    @SerializedName("expiryDate")
    private String expiryDate  ;


    @SerializedName("nameOnCard")
    private String nameOnCard;

    @SerializedName("isDefault")
    private boolean isDefault;

    private boolean showBalance = false;


    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public String getIdWallet() {
        return idWallet;
    }

    public void setIdWallet(String idWallet) {
        this.idWallet = idWallet;
    }


    //    public Long getIdWallet() {
//        return idWallet;
//    }
//
//    public void setIdWallet(Long idWallet) {
//        this.idWallet = idWallet;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrencyAlphaCode() {
        return currencyAlphaCode;
    }

    public void setCurrencyAlphaCode(String currencyAlphaCode) {
        this.currencyAlphaCode = currencyAlphaCode;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Boolean getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Boolean defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public String getMaskedPan() {
        return maskedPan;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyIden() {
        return currencyIden;
    }

    public void setCurrencyIden(String currencyIden) {
        this.currencyIden = currencyIden;
    }

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public String getIdPersoWallet() {
        return idPersoWallet;
    }

    public void setIdPersoWallet(String idPersoWallet) {
        this.idPersoWallet = idPersoWallet;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAgentFullName() {
        return agentFullName;
    }

    public void setAgentFullName(String agentFullName) {
        this.agentFullName = agentFullName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public boolean isShowBalance() {
        return showBalance;
    }

    public void setShowBalance(boolean showBalance) {
        this.showBalance = showBalance;
    }
}