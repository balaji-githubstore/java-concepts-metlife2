package com.metlife.datatypes;

public class Demo1 {

    public static void main(String[] args) {

        byte a = 127; //8 bits of memory
        short b = 100; //16 bits of memory
        int c = 100; //32 bits of memory
        long d = 100L;//64 bits of memory

        float e = 1.2f;//32 bit
        double f = 1.2;//64 bit
        char letter = '&';  //16 bits of memory
        boolean check = true;

        System.out.println(a);
        System.out.println(b);

        String name = "balaji"; //6*16 bits of memory

        System.out.println(name.toUpperCase());
        System.out.println(name.length());

        int radius = 10;
        //calulate area of circle
        double result = 3.14 * radius * radius;
        System.out.println(result);

        double height = 10;
        double base = 12.5;
        //calculate area of triangle
        result=(base*height)/2;
        System.out.println(result);
    }
}
