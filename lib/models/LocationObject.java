package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Guessous Mohamed Tariq on 2020-04-04.
 */


public class LocationObject implements Serializable {

    @SerializedName("type")
    private String type = "";

    @SerializedName("longitude")
    private Double longitude = 0.0;

    @SerializedName("latitude")
    private Double latitude = 0.0;

    //@SerializedName("mrcName")
    @SerializedName("entityName")
    private String entityName = "";

    @SerializedName("entityAddInfo")
    private String entityAddInfo = "";

    @SerializedName("mrcAddress")
    private String addr1 = "";

    @SerializedName("mrcStreet")
    private String addr2 = "";

    @SerializedName("entityCity")
    private String entityCity = "";

    @SerializedName("zipCode")
    private String zipCode = "";

    @SerializedName("distance")
    private Double distance = 0.0;

    @SerializedName("id")
    private String id ;

    @SerializedName("email")
    private String email ;

    @SerializedName("phoneNumber")
    private String phoneNumber ;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityAddInfo() {
        return entityAddInfo;
    }

    public void setEntityAddInfo(String entityAddInfo) {
        this.entityAddInfo = entityAddInfo;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getEntityCity() {
        return entityCity;
    }

    public void setEntityCity(String entityCity) {
        this.entityCity = entityCity;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocationObject(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
