package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Operator implements Serializable {

    @SerializedName("opertCode")
    private String operatorCode;

    @SerializedName("opertName")
    private String operatorName;

    @SerializedName("denominations")
    private List<Denomination> denominations;

    public String getOperatorCode() {
        return operatorCode;
    }

    public void setOperatorCode(String operatorCode) {
        this.operatorCode = operatorCode;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public List<Denomination> getDenominations() {
        return denominations;
    }

    public void setDenominations(List<Denomination> denominations) {
        this.denominations = denominations;
    }


}
