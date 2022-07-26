package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by S2M on 2020-04-03.
 */
public class Forex implements Serializable {


    @SerializedName("sourceCurrencyUnicode")
    private String sourceCurrencyUnicode;

    @SerializedName("sourceCurrencyAlpha3Code")
    private String sourceCurrencyAlpha3Code;

    @SerializedName("purchaseRate")
    private String purchaseRate;

    @SerializedName("saleRate")
    private String saleRate;

    @SerializedName("destinationCurrencyAlpha3code")
    private String destinationCurrencyAlpha3code;

    @SerializedName("sourceCurrencyLabel")
    private String sourceCurrencyLabel;

    public String getSourceCurrencyLabel() {
        return sourceCurrencyLabel;
    }

    public void setSourceCurrencyLabel(String sourceCurrencyLabel) {
        this.sourceCurrencyLabel = sourceCurrencyLabel;
    }

    public String getSourceCurrencyUnicode() {
        return sourceCurrencyUnicode;
    }

    public void setSourceCurrencyUnicode(String sourceCurrencyUnicode) {
        this.sourceCurrencyUnicode = sourceCurrencyUnicode;
    }

    public String getSourceCurrencyAlpha3Code() {
        return sourceCurrencyAlpha3Code;
    }

    public void setSourceCurrencyAlpha3Code(String sourceCurrencyAlpha3Code) {
        this.sourceCurrencyAlpha3Code = sourceCurrencyAlpha3Code;
    }

    public String getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(String purchaseRate) {
        this.purchaseRate = purchaseRate;
    }

    public String getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(String saleRate) {
        this.saleRate = saleRate;
    }

    public String getDestinationCurrencyAlpha3code() {
        return destinationCurrencyAlpha3code;
    }

    public void setDestinationCurrencyAlpha3code(String destinationCurrencyAlpha3code) {
        this.destinationCurrencyAlpha3code = destinationCurrencyAlpha3code;
    }


}
