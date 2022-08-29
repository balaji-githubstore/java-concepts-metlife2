package com.metlife.collections;

import com.metlife.employee_constructor.employee.Employee;

public class Demo1Object {

    public static void main(String[] args) {

            int a=10;
            double b=20.2;
            String n="ll";
             Employee e=new Employee(101);

             Object x1=a; //boxing
             Object x2=b;
             Object x3=n;
             Object x4=e;

             int res= (int) x1;
        System.out.println(res);



    }
}
