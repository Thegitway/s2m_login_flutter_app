package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FavoriteItem implements Serializable {
    @SerializedName("phoneNumber")
    private String phoneNumber;


    @SerializedName("name")
    private String name;


    @SerializedName("lastTransMemo")
    private String lastTransMemo;


    @SerializedName("lastTransAmount")
    private String lastTransAmount;

    @SerializedName("curiden")
    private String curiden;

    @SerializedName("isFavorite")
    private int isFavorite;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastTransMemo() {
        return lastTransMemo;
    }

    public void setLastTransMemo(String lastTransMemo) {
        this.lastTransMemo = lastTransMemo;
    }

    public String getLastTransAmount() {
        return lastTransAmount;
    }

    public void setLastTransAmount(String lastTransAmount) {
        this.lastTransAmount = lastTransAmount;
    }

    public String getCuriden() {
        return curiden;
    }

    public void setCuriden(String curiden) {
        this.curiden = curiden;
    }

    public int getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(int isFavorite) {
        this.isFavorite = isFavorite;
    }
}
