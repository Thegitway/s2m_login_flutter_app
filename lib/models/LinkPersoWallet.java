package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

public class LinkPersoWallet {

    @SerializedName("phoneNumber")
    String phoneNumber;

    @SerializedName("walletNum")
    String walletNum;

    @SerializedName("pin")
    String pin;



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getWalletNum() {
        return walletNum;
    }

    public void setWalletNum(String walletNum) {
        this.walletNum = walletNum;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

}
