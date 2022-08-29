package com.metlife.employee;

public class Employee {
    public int empId;
    public String empName;
    public double empSalary;
    public static String companyName;

    public void displayEmployeeDetails() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Company Name: " + Employee.companyName);
        System.out.println("----------------------------------");
    }

    public static Employee getEmployeeInstance() {
        Employee e = new Employee();
        return e;
    }

}
