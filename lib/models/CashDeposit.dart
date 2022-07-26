package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CashDeposit implements Serializable {

    @SerializedName("equipment")
    Equipment equipment;

    @SerializedName("pin")
    String pin;

    @SerializedName("phone")
    String phone;

    @SerializedName("customerPhone")
    String customerPhone;

    @SerializedName("amount")
    Double amount;

    @SerializedName("idNumber")
    String idNumber;

    @SerializedName("memo")
    String memo;

    @SerializedName("toAccount")
    String toAccount;

    @SerializedName("fromAccount")
    String fromAccount;

    @SerializedName("fromAccountCurrency")
    String fromAccountCurrency;

    @SerializedName("amountOnFromAccount")
    String amountOnFromAccount;

    @SerializedName("agentIden")
    String agentIden;

    @SerializedName("fees")
    Double fees;

    @SerializedName("accountNumber")
    String accountNumber;




    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
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

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getFromAccountCurrency() {
        return fromAccountCurrency;
    }

    public void setFromAccountCurrency(String fromAccountCurrency) {
        this.fromAccountCurrency = fromAccountCurrency;
    }

    public String getAmountOnFromAccount() {
        return amountOnFromAccount;
    }

    public void setAmountOnFromAccount(String amountOnFromAccount) {
        this.amountOnFromAccount = amountOnFromAccount;
    }

    public String getAgentIden() {
        return agentIden;
    }

    public void setAgentIden(String agentIden) {
        this.agentIden = agentIden;
    }
}