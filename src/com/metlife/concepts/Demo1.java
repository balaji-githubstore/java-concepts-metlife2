package com.metlife.concepts;


import com.metlife.employee.Employee;

public class Demo1 {

    public static void main(String[] args) {

        int a=10;
        double b=20.2;
        int[] f=new int[3];

        String c="red";

        String d="red";
        String d1="red";
        String d2="red";
        String e=new String("red");

        Employee g=new Employee();

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println(a==10);
        System.out.println(c==d); //== - compare location and then text - casesensitive
        System.out.println(c==e);

        System.out.println(c.equals(d)); //compares text - casesensitive
        System.out.println(c.equals(e));//compares text - casesensitive
        System.out.println(c.equalsIgnoreCase(e)); //compares text - case insensitive

    }
}