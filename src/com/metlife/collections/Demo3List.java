package com.metlife.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo3List {

    public static void main(String[] args) {

        List<String> lists=new ArrayList<String>();

        lists.add("red");
        lists.add("green");
        lists.add("yellow");

        System.out.println(lists);
        String name= lists.get(2);
        System.out.println(name);

        lists.remove("green");
        System.out.println(lists);
        lists.add(0,"black");
        System.out.println(lists);

        List<Integer> numbers=new ArrayList<Integer>();
        numbers.add(10);
    }
}
