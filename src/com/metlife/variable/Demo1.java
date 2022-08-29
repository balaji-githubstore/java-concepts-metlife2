package com.metlife.variable;

public class Demo1 {
    public static int aS = 10;      //Static variable or class variable
    public static int bS=20;
    public int aNS = 10;            //Non-static variable or instance variable
    public int bNS=20;

    public static void main(String[] args) {

        Demo1.aS=500;
        System.out.println(Demo1.aS);

        Demo1 obj1=new Demo1(); //instance

        Demo1 obj2=new Demo1(); //instance

        obj1.bNS=6000;

        System.out.println(obj1.aNS);
        System.out.println(obj1.bNS);

        System.out.println(obj2.aNS);
        System.out.println(obj2.bNS);
    }

}
