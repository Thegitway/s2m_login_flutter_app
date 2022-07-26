package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class InitiateCredentialBean implements Serializable {



    @SerializedName("resetCounter")
    private int resetCounter;

    @SerializedName("isAppAccEnabled")
    private int isAppAccEnabled;

    @SerializedName("resetAttemptTimeframe")
    private int resetAttemptTimeframe;


    public int getResetCounter() {
        return resetCounter;
    }

    public void setResetCounter(int resetCounter) {
        this.resetCounter = resetCounter;
    }

    public int getIsAppAccEnabled() {
        return isAppAccEnabled;
    }

    public void setIsAppAccEnabled(int isAppAccEnabled) {
        this.isAppAccEnabled = isAppAccEnabled;
    }

    public int getResetAttemptTimeframe() {
        return resetAttemptTimeframe;
    }

    public void setResetAttemptTimeframe(int resetAttemptTimeframe) {
        this.resetAttemptTimeframe = resetAttemptTimeframe;
    }
}
