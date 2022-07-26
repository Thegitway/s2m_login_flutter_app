package com.s2m.gbmagent.Model;

import android.graphics.Bitmap;

import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.io.Serializable;

public class LevelsObj implements Serializable {

    @SerializedName("phoneNumber")
    String phoneNumber;

    @SerializedName("gender")
    String gender;

    @SerializedName("agentType")
    String agentType;

    @SerializedName("pin")
    String pin;

    @SerializedName("firstName")
    String firstName;

    @SerializedName("lastName")
    String lastName;

//    @SerializedName("status")
//    String status;

    @SerializedName("subscriberAgentIden")
    String subscriberAgentIden;

    @SerializedName("phoneAgentOperator")
    String phoneAgentOperator;

    @SerializedName("birthDate")
    String birthDate;

    @SerializedName("nationnality")
    String nationnality;

    @SerializedName("idType")
    String idType;

    @SerializedName("identity")
    String identity;

    @SerializedName("expiryDate")
    String expiryDate;

    @SerializedName("address")
    String address;

    @SerializedName("email")
    String email;

    @SerializedName("agentStatus")
    String agentStatus;
    @SerializedName("middelName")
    String middelName;

    @SerializedName("numberOperators")
    int numberOperators;
    @SerializedName("accountNumber")
    String accountNumber;

    @SerializedName("currency")
    String currency;

    @SerializedName("agentIden")
    String agentIden;



    @SerializedName("photoUrl")
    String photoUrl;

    @SerializedName("identificationUrlFront")
    String identificationUrlFront;

    @SerializedName("city")
    City city;

    @SerializedName("identificationUrlBack")
    String identificationUrlBack;

    @SerializedName("linkedAccId")
    String linkedAccId;

    @SerializedName("operatorLinkedTo")
    String operatorLinkedTo;


    private Bitmap nationalIdBitmap ;
    private File nationalIdFile ;

    private String fullName = "";
    private String fullNameAr = "";
    private String nationalID = "" ;

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

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
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

    public String getSubscriberAgentIden() {
        return subscriberAgentIden;
    }

    public void setSubscriberAgentIden(String subscriberAgentIden) {
        this.subscriberAgentIden = subscriberAgentIden;
    }

    public String getPhoneAgentOperator() {
        return phoneAgentOperator;
    }

    public void setPhoneAgentOperator(String phoneAgentOperator) {
        this.phoneAgentOperator = phoneAgentOperator;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationnality() {
        return nationnality;
    }

    public void setNationnality(String nationnality) {
        this.nationnality = nationnality;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }

    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public String getMiddelName() {
        return middelName;
    }

    public void setMiddelName(String middelName) {
        this.middelName = middelName;
    }

    public int getNumberOperators() {
        return numberOperators;
    }

    public void setNumberOperators(int numberOperators) {
        this.numberOperators = numberOperators;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAgentIden() {
        return agentIden;
    }

    public void setAgentIden(String agentIden) {
        this.agentIden = agentIden;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getIdentificationUrlFront() {
        return identificationUrlFront;
    }

    public void setIdentificationUrlFront(String identificationUrlFront) {
        this.identificationUrlFront = identificationUrlFront;
    }


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getIdentificationUrlBack() {
        return identificationUrlBack;
    }

    public void setIdentificationUrlBack(String identificationUrlBack) {
        this.identificationUrlBack = identificationUrlBack;
    }

    public String getLinkedAccId() {
        return linkedAccId;
    }

    public void setLinkedAccId(String linkedAccId) {
        this.linkedAccId = linkedAccId;
    }

    public String getOperatorLinkedTo() {
        return operatorLinkedTo;
    }

    public void setOperatorLinkedTo(String operatorLinkedTo) {
        this.operatorLinkedTo = operatorLinkedTo;
    }

    public Bitmap getNationalIdBitmap() {
        return nationalIdBitmap;
    }

    public void setNationalIdBitmap(Bitmap nationalIdBitmap) {
        this.nationalIdBitmap = nationalIdBitmap;
    }

    public File getNationalIdFile() {
        return nationalIdFile;
    }

    public void setNationalIdFile(File nationalIdFile) {
        this.nationalIdFile = nationalIdFile;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullNameAr() {
        return fullNameAr;
    }

    public void setFullNameAr(String fullNameAr) {
        this.fullNameAr = fullNameAr;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }
}
