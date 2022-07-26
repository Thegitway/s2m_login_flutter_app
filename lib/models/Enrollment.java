package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import androidx.room.ColumnInfo;

public class Enrollment implements Serializable {

    @SerializedName("phoneNumber")
    String phoneNumber;

    @SerializedName("customerId")
    String customerId;

    @SerializedName("pin")
    @ColumnInfo(name = "pin")
    private String pin = "";


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
