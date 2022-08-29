package com.metlife.employee_constructor.employee;

public class Employee {
    private int empId;
    public String empName;
    public double empSalary;
    public static String companyName;


    public Employee(int empId) {
        System.out.println(this);
        this.empId = empId;
    }

    public Employee(double x) {

    }

    public Employee(int empId, String empName) {
        System.out.println(this);
        this.empId = empId;
        this.empName = empName;
    }

    public Employee(String empName, int empId) {
        System.out.println(this);
        this.empId = empId;
        this.empName = empName;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Company Name: " + Employee.companyName);
        System.out.println("----------------------------------");
    }


}
