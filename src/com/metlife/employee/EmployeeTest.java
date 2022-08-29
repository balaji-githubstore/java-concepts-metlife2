package com.metlife.employee;

public class EmployeeTest {

    public static void main(String[] args) {


       Employee e= Employee.getEmployeeInstance();

        Employee.companyName = "MetLife";

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.empId = 101;
        emp1.empName = "John";
        emp1.empSalary = 8000;


        emp2.empId = 102;
        emp2.empName = "Peter";
        emp2.empSalary = 5000;

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
    }
}
