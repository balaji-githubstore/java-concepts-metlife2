package com.metlife.logics;

public class Demo1Logics {

    public static void main(String[] args) {

        int num = -90;

        if(num>0)
        {
            System.out.println(num+" is positive");
        }
        else if(num==0)
        {
            System.out.println("It's zero");
        }
        else
        {
            System.out.println(num+" is negative");
        }

        int pageNumber=150;

        if(pageNumber>=100)
        {
            if(pageNumber<=200)
            {
                System.out.println("Between 100 and 200");
            }
        }

        if(pageNumber>=100 && pageNumber<=200)
        {
            System.out.println("Between 100 and 200");
        }

    }
}
