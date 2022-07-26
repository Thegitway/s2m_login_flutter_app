package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class InstitutionCurrency implements Serializable {

    @SerializedName("curAlphCode")
    private String curAlphCode;

    @SerializedName("curIde")
    private String curIde;

    @SerializedName("curLabe")
    private String curLabe;

    @SerializedName("curDefaNumbDeci")
    private int curDefaNumbDeci;

    public String getCurAlphCode() {
        return curAlphCode;
    }

    public void setCurAlphCode(String curAlphCode) {
        this.curAlphCode = curAlphCode;
    }

    public String getCurIde() {
        return curIde;
    }

    public void setCurIde(String curIde) {
        this.curIde = curIde;
    }

    public String getCurLabe() {
        return curLabe;
    }

    public void setCurLabe(String curLabe) {
        this.curLabe = curLabe;
    }

    public int getCurDefaNumbDeci() {
        return curDefaNumbDeci;
    }

    public void setCurDefaNumbDeci(int curDefaNumbDeci) {
        this.curDefaNumbDeci = curDefaNumbDeci;
    }
}