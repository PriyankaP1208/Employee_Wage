package com.bridgelabz;

public class EmployeeWageBuilder {
    public static void main(String args[]) {
        int IS_FULL_TIME=1;
        int IS_PART_TIME=2;
        int WAGE_PER_HOUR=20;
        int empHrs=0;
        int dailyEmpWage=0;
        double partTimeWage=0;
        double empCheck=Math.floor(Math.random()*10)%3;
        if(empCheck==IS_PART_TIME)
            empHrs=4;
        else if(empCheck==IS_FULL_TIME)
            empHrs=8;
        else
            empHrs=0;
        dailyEmpWage=empHrs*WAGE_PER_HOUR;
        System.out.println("Daily employee wage:"+dailyEmpWage);
        double partTimeHours=Math.floor(Math.random()*10)%8;
        partTimeWage=(partTimeHours*WAGE_PER_HOUR);
        System.out.println("Part time wage:"+partTimeWage);
    }
}
