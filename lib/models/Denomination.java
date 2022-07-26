package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Denomination implements Serializable {

    @SerializedName("denominationCode")

    private String denominationCode;
    @SerializedName("denominationValue")

    private String denominationValue;

    public String getDenominationCode() {
        return denominationCode;
    }

    public void setDenominationCode(String denominationCode) {
        this.denominationCode = denominationCode;
    }

    public String getDenominationValue() {
        return denominationValue;
    }

    public void setDenominationValue(String denominationValue) {
        this.denominationValue = denominationValue;
    }
}
