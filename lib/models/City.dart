package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by S2M on 2020-04-17.
 */
public class City implements Serializable {

    @SerializedName("key")
    private String key;

    @SerializedName("value")
    private String value;

    //    @SerializedName("cityCode")
//    private String cityCode;
//    @SerializedName("cityLabel")
//    private String cityLabel;
//
    @SerializedName("cityLabelAr")
    private String cityLabelAr;



    public City() {
        this.key = "";
        this.value = "";
        this.cityLabelAr = "";
    }

    public City(String key, String value, String valueAr) {
        this.key = key;
        this.value = value;
        this.cityLabelAr = valueAr;
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

//    public String getCityCode() {
//        return cityCode;
//    }
//
//    public void setCityCode(String cityCode) {
//        this.cityCode = cityCode;
//    }
//
//    public String getCityLabel() {
//        return cityLabel;
//    }
//
//    public void setCityLabel(String cityLabel) {
//        this.cityLabel = cityLabel;
//    }

    public String getCityLabelAr() {
        return cityLabelAr;
    }

    public void setCityLabelAr(String cityLabelAr) {
        this.cityLabelAr = cityLabelAr;
    }
}
