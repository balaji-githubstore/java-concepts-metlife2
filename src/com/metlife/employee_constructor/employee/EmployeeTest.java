package com.metlife.employee_constructor.employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee.companyName = "MetLife";

        Employee emp1 = new Employee(101);
       // System.out.println(emp1);
        Employee emp2 = new Employee(102,"peter");
      //  System.out.println(emp2);
        Employee emp3 = new Employee("mark",103);
       // System.out.println(emp3);




//        emp1.empId = 101;
        emp1.empName = "John";
        emp1.empSalary = 8000;

//        emp2.empId = 102;
        emp2.empName = "Peter";
        emp2.empSalary = 5000;

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
    }
}
