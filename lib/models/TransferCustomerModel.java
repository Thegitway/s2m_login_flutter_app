package com.s2m.gbmagent.Model;



import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TransferCustomerModel implements Serializable {

    @SerializedName("toPhone")
    private String toPhone;

    @SerializedName("customerAgentId")
    private String customerAgentId;

    @SerializedName("amount")
    private String amount;

    @SerializedName("fee")
    private String fee;

    @SerializedName("currency")
    private String currency;


    @SerializedName("fromAccount")
    private String fromAccount;

    @SerializedName("toAccount")
    private String toAccount;

    @SerializedName("memo")
    private String memo;

    @SerializedName("serviceType")
    private String serviceType;

    @SerializedName("typeTransfert")
    private String typeTransfert;

    @SerializedName("fromEquipment")
    private Equipment fromEquipment;


    @SerializedName("toEquipment")
    private Equipment toEquipment;

    @SerializedName("beneficiary")
    private Beneficiary beneficiary;


    @SerializedName("trxReference")
    private String transferReference;


    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    public Equipment getToEquipment() {
        return toEquipment;
    }

    public void setToEquipment(Equipment toEquipment) {
        this.toEquipment = toEquipment;
    }

    public Equipment getFromEquipment() {
        return fromEquipment;
    }

    public void setFromEquipment(Equipment fromEquipment) {
        this.fromEquipment = fromEquipment;
    }



    public String getToPhone() {
        return toPhone;
    }

    public void setToPhone(String toPhone) {
        this.toPhone = toPhone;
    }

    public String getCustomerAgentId() {
        return customerAgentId;
    }

    public void setCustomerAgentId(String customerAgentId) {
        this.customerAgentId = customerAgentId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getTypeTransfert() {
        return typeTransfert;
    }

    public void setTypeTransfert(String typeTransfert) {
        this.typeTransfert = typeTransfert;
    }

    public String getTransferReference() {
        return transferReference;
    }

    public void setTransferReference(String transferReference) {
        this.transferReference = transferReference;
    }
}
