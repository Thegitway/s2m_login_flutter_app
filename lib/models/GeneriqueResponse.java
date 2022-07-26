package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Guessous Mohamed Tariq on 9/10/20.
 */
public class GeneriqueResponse {

    @SerializedName("responseCode")
    private String responseCode;

    @SerializedName("responseDescription")
    private String responseDescription;

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
}
