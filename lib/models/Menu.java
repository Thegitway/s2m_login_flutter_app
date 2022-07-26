package com.s2m.gbmagent.Model;

import java.io.Serializable;
import java.util.HashMap;



/**
 * Created by S2M on 2020-04-01.
 */
public class Menu implements Serializable {

    public static  HashMap<String,Object> menuMap;// {Tag: R.id.menuItem}


    private Long id;


    private String tag;


    private String title;


    private String icon;


    private Boolean visible;





}
