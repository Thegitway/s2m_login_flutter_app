package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Guessous Mohamed Tariq on 2020-04-13.
 */
public class Transfer implements Serializable {

    @SerializedName("beneficiary")
    Beneficiary beneficiary;

    @SerializedName("equipment")
    Equipment equipment;

    @SerializedName("memo")
    String memo;

    @SerializedName("amount")
    Double amount;

    @SerializedName("pin")
    String pin;

    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
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
}
