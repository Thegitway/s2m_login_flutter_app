package com.s2m.gbmagent.Model;



import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PaySupplierModel implements Serializable {


//    @SerializedName("fromWallet")
//    private String fromWallet;

    @SerializedName("fromEquipment")
    private Equipment fromEquipment;

    @SerializedName("toWallet")
    private String toWallet;

    @SerializedName("billNumber")
    private String billNumber;


//    @SerializedName("toCurrency")
//    private String toCurrency;


    @SerializedName("memo")
    private String memo;

    @SerializedName("toPhone")
    private String toPhone;

    @SerializedName("amount")
    private String amount;

    @SerializedName("toName")
    private String toName;


    @SerializedName("fee")
    private String fee = "0";


    @SerializedName("TrxReferance")
    private String TrxReferance ;


//    public String getFromWallet() {
//        return fromWallet;
//    }
//
//    public void setFromWallet(String fromWallet) {
//        this.fromWallet = fromWallet;
//    }


    public Equipment getFromEquipment() {
        return fromEquipment;
    }

    public void setFromEquipment(Equipment fromEquipment) {
        this.fromEquipment = fromEquipment;
    }

    public String getToWallet() {
        return toWallet;
    }

    public void setToWallet(String toWallet) {
        this.toWallet = toWallet;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

//    public String getToCurrency() {
//        return toCurrency;
//    }
//
//    public void setToCurrency(String toCurrency) {
//        this.toCurrency = toCurrency;
//    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getToPhone() {
        return toPhone;
    }

    public void setToPhone(String toPhone) {
        this.toPhone = toPhone;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTrxReferance() {
        return TrxReferance;
    }

    public void setTrxReferance(String trxReferance) {
        TrxReferance = trxReferance;
    }
}
