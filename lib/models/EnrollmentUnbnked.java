package com.s2m.gbmagent.Model;

import android.graphics.Bitmap;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import androidx.room.ColumnInfo;

public class EnrollmentUnbnked implements Serializable {

    @SerializedName("phoneNumber")
    String phoneNumber;


    @SerializedName("gender")
    String gender;


    @SerializedName("firstName")
    @ColumnInfo(name = "firstName")
    private String firstName;

    @SerializedName("lastName")
    @ColumnInfo(name = "lastName")
    private String lastName;


    @SerializedName("nationality")
    @ColumnInfo(name = "nationality")
    private Country nationality;


    @SerializedName("birthdate")
    @ColumnInfo(name = "birthdate")
    private String birthdate;



    @SerializedName("identificationType")
    String identificationType;

    @SerializedName("identificationNumber")
    String identificationNumber;

    @SerializedName("expiryDate")
    String expiryDate;


    @SerializedName("address")
    String address;



    @SerializedName("language")
    String language;



    @SerializedName("pin")
    @ColumnInfo(name = "pin")
    private String pin = "";


    private String expiryDateFormated = "" ;

    private Bitmap photoUrl;

    private Bitmap identificationUrlFront;

    private Bitmap identificationUrlBack;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Bitmap getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(Bitmap photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Bitmap getIdentificationUrlFront() {
        return identificationUrlFront;
    }

    public void setIdentificationUrlFront(Bitmap identificationUrlFront) {
        this.identificationUrlFront = identificationUrlFront;
    }

    public Bitmap getIdentificationUrlBack() {
        return identificationUrlBack;
    }

    public void setIdentificationUrlBack(Bitmap identificationUrlBack) {
        this.identificationUrlBack = identificationUrlBack;
    }


    public String getExpiryDateFormated() {
        return expiryDateFormated;
    }

    public void setExpiryDateFormated(String expiryDateFormated) {
        this.expiryDateFormated = expiryDateFormated;
    }
}
