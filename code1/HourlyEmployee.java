package com.assignment13.code1;

public class HourlyEmployee extends Employee{
    int hours;
    HourlyEmployee(String name,String empId,int hours){
        super(name,empId);
        this.hours=hours;
    }
    @Override
    float calculatePay() {
       return 100*hours;
    }

    @Override
    void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Salary: "+calculatePay());
    }
}
