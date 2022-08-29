package com.metlife.math;

public class Area {
    public double areaOfCircle(int r) {
        double area = 3.14 * r * r;
        return area;
    }

    public static double areaOfRectange(double length, double width) {
        return length * width;
    }

    public static double areaOfTriangle(double base, double height) {
        return (base * height) / 2;
    }

    public static String getAuthorName()
    {
        return "Balaji Dinkaran";
    }

}
