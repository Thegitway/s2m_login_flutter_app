package com.s2m.gbmagent.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ConsumptionItem implements Serializable {

    @SerializedName("date")
    private String date;

    @SerializedName("balance")
    private Double balance;

    @SerializedName("debitMovements")
    private String debitMovements;

    @SerializedName("creditMovements")
    private String creditMovements;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getDebitMovements() {
        return debitMovements;
    }

    public void setDebitMovements(String debitMovements) {
        this.debitMovements = debitMovements;
    }

    public String getCreditMovements() {
        return creditMovements;
    }

    public void setCreditMovements(String creditMovements) {
        this.creditMovements = creditMovements;
    }
}
