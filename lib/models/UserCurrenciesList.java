package com.s2m.gbmagent.Model;

import java.util.HashSet;
import java.util.Set;

public class UserCurrenciesList {

    public static Set<GenericCurrency> genericCurrenciesList = new HashSet<>();

    public static int getCurrencyDecimal(String curAlphCode){
        int currencyDecimal = 0 ;
        for (GenericCurrency currency: genericCurrenciesList){
            if(currency.getCurAlphCode().equals(curAlphCode)){
                currencyDecimal = currency.getCurDefaNumbDeci();
                break ;
            }
        }
        return currencyDecimal;
    }

    public static String getCurrencyIden(String curAlphCode){
        String currencyIden = "434" ;
        for (GenericCurrency currency: genericCurrenciesList){
            if(currency.getCurAlphCode().equals(curAlphCode)){
                currencyIden = currency.getCurIde();
                break ;
            }
        }
        return currencyIden;
    }



}
