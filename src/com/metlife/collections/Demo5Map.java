package com.metlife.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo5Map {

    public static void main(String[] args) {

        Map<String,String> map1=new HashMap<String, String>();
        map1.put("firstname","john");
        map1.put("lastname","wick");
        map1.put("empid","101");
        map1.put("status","disabled");
        map1.put("empid","10133");

        Map<String,String> map2=new HashMap<String, String>();
        map2.put("firstname","john2");
        map2.put("lastname","wick2");
        map2.put("empid","1012");
        map2.put("status","disabled2");
        map2.put("empid","101332");

        List<Map<String,String>> lists= new ArrayList<>();

        lists.add(map1);
        lists.add(map2);

        System.out.println(lists.get(1).get("empid"));
    }
}
