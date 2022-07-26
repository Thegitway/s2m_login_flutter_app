package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Guessous Mohamed Tariq on 9/10/20.
 */
public class CeckWalletExistResponse {

    @SerializedName("responseCode")
    private String responseCode;

    @SerializedName("responseDescription")
    private String responseDescription;

    @SerializedName("resetAttemptTimeframe")
    private int resetAttemptTimeframe;

    @SerializedName("remainingAttempts")
    private int remainingAttempts;

    @SerializedName("resetCounter")
    private int resetCounter;



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

    public int getResetCounter() {
        return resetCounter;
    }

    public void setResetCounter(int resetCounter) {
        this.resetCounter = resetCounter;
    }
}
