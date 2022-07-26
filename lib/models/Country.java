package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Country implements Serializable {

    @SerializedName("countryCode")
    private String key;

    @SerializedName("countryLabel")
    private String value;

    @SerializedName("countryLabelAr")
    private String valueAr;

    public Country() {
        this.key = "";
        this.value = "";
        this.valueAr = "";
    }

    public Country(String key, String value, String valueAr) {
        this.key = key;
        this.value = value;
        this.valueAr = valueAr;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueAr() {
        return valueAr;
    }

    public void setValueAr(String valueAr) {
        this.valueAr = valueAr;
    }
}
