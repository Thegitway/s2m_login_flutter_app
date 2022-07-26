package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guessous Mohamed Tariq on 9/10/20.
 */
public class ResponseGetAgentPersoWallets implements Serializable {

    @SerializedName("responseCode")
    private String responseCode;

    @SerializedName("responseDescription")
    private String responseDescription;

    @SerializedName("linkedPersoWallet")
    private List<Equipment> linkedPersoWallet = new ArrayList<>();

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

    public List<Equipment> getLinkedPersoWallet() {
        return linkedPersoWallet;
    }

    public void setLinkedPersoWallet(List<Equipment> linkedPersoWallet) {
        this.linkedPersoWallet = linkedPersoWallet;
    }
}
