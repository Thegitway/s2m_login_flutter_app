package com.s2m.gbmagent.Model;

public class GenericCurrency  {
    private String curAlphCode;
    private String curIde;
    private String curLabe;
    private int curDefaNumbDeci;

    public String getCurAlphCode() {
        return curAlphCode;
    }

    public void setCurAlphCode(String curAlphCode) {
        this.curAlphCode = curAlphCode;
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

    public int getCurDefaNumbDeci() {
        return curDefaNumbDeci;
    }

    public void setCurDefaNumbDeci(int curDefaNumbDeci) {
        this.curDefaNumbDeci = curDefaNumbDeci;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != GenericCurrency.class) {
            return false;
        }
        GenericCurrency other = (GenericCurrency) obj;
        if (other.curIde != this.curIde) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int result = 7;
        result += curDefaNumbDeci * 31;
        result += curAlphCode.hashCode() * 31;
        result += curIde.hashCode() * 31;
        result += curLabe.hashCode() * 31;
        return result;
    }

    public static GenericCurrency fromProfileCurrency(ProfileCurrency profileCurrency){
        GenericCurrency genericCurrency= new GenericCurrency();
        genericCurrency.setCurAlphCode(profileCurrency.getCurAlphCode());
        genericCurrency.setCurIde(profileCurrency.getCurIde());
        genericCurrency.setCurLabe(profileCurrency.getCurLabe());
        genericCurrency.setCurDefaNumbDeci(profileCurrency.getCurDefaNumbDeci());

        return  genericCurrency;
    }
    public static GenericCurrency fromInstitutionCurrency(InstitutionCurrency institutionCurrency){
        GenericCurrency genericCurrency= new GenericCurrency();
        genericCurrency.setCurAlphCode(institutionCurrency.getCurAlphCode());
        genericCurrency.setCurIde(institutionCurrency.getCurIde());
        genericCurrency.setCurLabe(institutionCurrency.getCurLabe());
        genericCurrency.setCurDefaNumbDeci(institutionCurrency.getCurDefaNumbDeci());

        return  genericCurrency;
    }

}
