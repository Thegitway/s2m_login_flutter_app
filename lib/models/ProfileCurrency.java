package com.s2m.gbmagent.Model;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by S2M on 2020-04-14.
 */
public class ProfileCurrency implements Serializable {

    @SerializedName("id")
    @PrimaryKey(autoGenerate = true)
    private Long id;

    @SerializedName("curCode")
    @ColumnInfo(name = "curCode")
    private int curCode;

    @SerializedName("curAlphCode")
    @ColumnInfo(name = "curAlphCode")
    private String curAlphCode;

    @SerializedName("curDefaNumbDeci")
    @ColumnInfo(name = "curDefaNumbDeci")
    private int curDefaNumbDeci;

    @SerializedName("curIde")
    @ColumnInfo(name = "curIde")
    private String curIde;

    @SerializedName("curLabe")
    @ColumnInfo(name = "curLabe")
    private String curLabe;

    @SerializedName("selection")
    @ColumnInfo(name = "selection")
    private Boolean selection;

    @SerializedName("selectAll")
    @ColumnInfo(name = "selectAll")
    private Boolean selectAll;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCurCode() {
        return curCode;
    }

    public void setCurCode(int curCode) {
        this.curCode = curCode;
    }

    public String getCurAlphCode() {
        return curAlphCode;
    }

    public void setCurAlphCode(String curAlphCode) {
        this.curAlphCode = curAlphCode;
    }

    public int getCurDefaNumbDeci() {
        return curDefaNumbDeci;
    }

    public void setCurDefaNumbDeci(int curDefaNumbDeci) {
        this.curDefaNumbDeci = curDefaNumbDeci;
    }

    public String getCurIde() {
        return curIde;
    }

    public void setCurIde(String curIde) {
        this.curIde = curIde;
    }

    public String getCurLabe() {
        return curLabe;
    }

    public void setCurLabe(String curLabe) {
        this.curLabe = curLabe;
    }

    public Boolean getSelection() {
        return selection;
    }

    public void setSelection(Boolean selection) {
        this.selection = selection;
    }

    public Boolean getSelectAll() {
        return selectAll;
    }

    public void setSelectAll(Boolean selectAll) {
        this.selectAll = selectAll;
    }
}
