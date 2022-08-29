package com.metlife.collections;

import java.util.ArrayList;

public class Demo2List {

    public static void main(String[] args) {

        ArrayList lists=new ArrayList();

        lists.add(10);
        lists.add(20.2);
        lists.add("bala");

        String name= (String) lists.get(2);
        System.out.println(name);
    }
}
