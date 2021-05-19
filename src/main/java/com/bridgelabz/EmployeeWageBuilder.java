package com.bridgelabz;

public class EmployeeWageBuilder {
    public static void main(String args[]){
        int IS_PRESENT=1;
        int WAGE_PER_HOUR=20;
        int FullDayHour=8;
        int dailyEmpWage;
        double empCheck=Math.floor(Math.random()*10)%2;
        if(empCheck==IS_PRESENT)
        {
            System.out.println("Employee is present");
            dailyEmpWage=WAGE_PER_HOUR*FullDayHour;
            System.out.println("Daily employee wage is:"+dailyEmpWage);
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
