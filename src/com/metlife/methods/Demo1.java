package com.metlife.methods;

import com.metlife.math.Area;

public class Demo1 {

    public static void main(String[] args) {
        int radius = 10;

        //allocating the memory for all non-static variable,methods
        Area obj=new Area();

        double result = obj.areaOfCircle(9);
        System.out.println(result);

        result = obj.areaOfCircle(10);
        System.out.println(result);

        result= Area.areaOfRectange(10,10.2);
        System.out.println(result);

        System.out.println(Area.areaOfTriangle(25,1));

        String name=Area.getAuthorName();
        System.out.println(name);

    }

}
