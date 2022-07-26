package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Guessous Mohamed Tariq on 2020-05-21.
 */
public class Reason implements Serializable {

    @SerializedName("reasonCode")
    private int reasonCode;

    @SerializedName("reasonIden")
    private String reasonIden;

    @SerializedName("reasonLabel")
    private String reasonLabel;

    public int getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(int reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonIden() {
        return reasonIden;
    }

    public void setReasonIden(String reasonIden) {
        this.reasonIden = reasonIden;
    }

    public String getReasonLabel() {
        return reasonLabel;
    }

    public void setReasonLabel(String reasonLabel) {
        this.reasonLabel = reasonLabel;
    }
}
