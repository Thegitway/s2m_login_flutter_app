package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class VerifyResponseObj implements Serializable {

    @SerializedName("responseCode")
    private String responseCode;

    @SerializedName("responseDescription")
    private String responseDescription;

    @SerializedName("customerFirstName")
    private String customerFirstName;

    @SerializedName("customerMidName")
    private String customerMidName;

    @SerializedName("customerLastName")
    private String customerLastName;

    @SerializedName("resetCounter")
    private int resetCounter;

    @SerializedName("resetAttemptTimeframe")
    private int resetAttemptTimeframe;

    @SerializedName("remainingAttempts")
    private int remainingAttempts;

    @SerializedName("customerPhoneNumber")
    private String phoneNumber;

    @SerializedName("customerPhone")
    private String customerPhone;


    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerMidName() {
        return customerMidName;
    }

    public void setCustomerMidName(String customerMidName) {
        this.customerMidName = customerMidName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public int getResetCounter() {
        return resetCounter;
    }

    public void setResetCounter(int resetCounter) {
        this.resetCounter = resetCounter;
    }

    public int getResetAttemptTimeframe() {
        return resetAttemptTimeframe;
    }

    public void setResetAttemptTimeframe(int resetAttemptTimeframe) {
        this.resetAttemptTimeframe = resetAttemptTimeframe;
    }

    public int getRemainingAttempts() {
        return remainingAttempts;
    }

    public void setRemainingAttempts(int remainingAttempts) {
        this.remainingAttempts = remainingAttempts;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
