package com.metlife.collections;

import java.util.HashMap;
import java.util.Map;

public class Demo4Map {

    public static void main(String[] args) {

        Map<String,String> map1=new HashMap<String, String>();
        map1.put("firstname","john");
        map1.put("lastname","wick");
        map1.put("empid","101");
        map1.put("status","disabled");
        map1.put("empid","10133");

        System.out.println(map1);

       String value= map1.get("empid");
        System.out.println(value);


    }
}
