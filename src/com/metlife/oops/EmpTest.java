package com.metlife.oops;

abstract class Employee {
    public int empId;
    public String empName;
    protected double empSalary;

//    public Employee(){
//        System.out.println("Employee Constructor");
//    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("----------------------------------");
    }

  public abstract void calculateSalary();

//    public abstract void provideSalaryDate();

}

class PermanentEmployee extends Employee
{
    public void calculateSalary()
    {
        super.empSalary=8*300;
    }


}

class ContractEmployee extends Employee
{
    public void calculateSalary()
    {
        super.empSalary=30*30;
    }

}


public class EmpTest {
    public static void main(String[] args) {

        Employee emp=new PermanentEmployee();
        emp.empId=101;
        emp.empName="john";
        emp.calculateSalary();
        emp.displayEmployeeDetails();

        emp=new ContractEmployee();
        emp.empId=102;
        emp.empName="saul";
        emp.calculateSalary();
        emp.displayEmployeeDetails();

    }
}
//will start at 2:55 PM IST
