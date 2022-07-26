package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SendMoney implements Serializable {

    /*
        public Account from;
        public String name;
        public String phone;
        public Double amount;
        public String operationType;
        public String TPKCRYPTED;
        public String TPKCLAIR;
        public String secretcode;
        public String pin;
        public String clearSecretCode;
     */

    @SerializedName("equipment")
    Equipment equipment;

    @SerializedName("beneficiaryName")
    String beneficiaryName;

    @SerializedName("beneficiaryPhone")
    String beneficiaryPhone;

    @SerializedName("memo")
    String memo;

    @SerializedName("amount")
    Double amount;

    @SerializedName("pin")
    String pin;

    @SerializedName("secretCode")
    String secretCode;

    @SerializedName("identificationNumber")
    String identificationNumber;

    @SerializedName("notifyBeneficiary")
    Boolean notifyBeneficiary;

    @SerializedName("cardlessReference")
    private String cardlessReference;

    @SerializedName("expiryDate")
    private String expiryDate;



    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getBeneficiaryPhone() {
        return beneficiaryPhone;
    }

    public void setBeneficiaryPhone(String beneficiaryPhone) {
        this.beneficiaryPhone = beneficiaryPhone;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getSecretCode() {
        return this.secretCode;
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public Boolean getNotifyBeneficiary() {
        return notifyBeneficiary;
    }

    public void setNotifyBeneficiary(Boolean notifyBeneficiary) {
        this.notifyBeneficiary = notifyBeneficiary;
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
}
