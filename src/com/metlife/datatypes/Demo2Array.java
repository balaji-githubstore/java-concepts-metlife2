package com.metlife.datatypes;

public class Demo2Array {

    public static void main(String[] args) {

        //10 20 30 40 50
        int[] numbers=new int[5]; //5*32 bits of memory
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;


        System.out.println(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[2]);

        numbers =new int[6];
        System.out.println(numbers[0]);
        System.out.println(numbers);


        double[] arr=new double[3];
        arr[0]=5.2;
        System.out.println(arr[0]);


        //create an array to store red, green, yellow
        //print length of the array

        String[] colors=new String[3];
        colors[0]="red";
        colors[1]="yellow";
        colors[2]="green";

        int size=colors.length;
        System.out.println(size);

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);

    }

}
