package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by S2M on 2020-04-06.
 */
public class Transaction implements Serializable {

    @SerializedName("date")
    private Long date;

    @SerializedName("trxDescription")
    private String trxDescription;

    @SerializedName("sign")
    private String sign;

    @SerializedName("amount")
    private String amount;

    @SerializedName("currency")
    private String currency;

    @SerializedName("valueDate")
    private Long valueDate;

    @SerializedName("reference")
    private String reference;

    @SerializedName("beneficiary")
    private String beneficiary;

    @SerializedName("transactionType")
    private String transactionType;

    @SerializedName("agentFullName")
    private String agentFullName;

    @SerializedName("agentPhoneNumber")
    private String agentPhoneNumber;


    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getTrxDescription() {
        return trxDescription;
    }

    public void setTrxDescription(String trxDescription) {
        this.trxDescription = trxDescription;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getValueDate() {
        return valueDate;
    }

    public void setValueDate(Long valueDate) {
        this.valueDate = valueDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getAgentFullName() {
        return agentFullName;
    }

    public void setAgentFullName(String agentFullName) {
        this.agentFullName = agentFullName;
    }

    public String getAgentPhoneNumber() {
        return agentPhoneNumber;
    }

    public void setAgentPhoneNumber(String agentPhoneNumber) {
        this.agentPhoneNumber = agentPhoneNumber;
    }

}
