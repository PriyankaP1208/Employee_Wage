package com.bridgelabz;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        double employee = employee = Math.floor(Math.random() * 10)%2;
        int IS_PRESENT = 1;
        int WAGE_PER_HOUR = 20;
        int PART_TIME_HOUR = 8;
        int WORKING_DAY_PER_MONTH=20;
        int monthlyWage=0;
        int empHrs = 0;
        int dailyEmpWage = 0;
        int partTimeWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        double no = Math.floor(Math.random() * 10) % 3;
        System.out.println("Enter choice 0.Employee Attendance 1.Employee daily wage 2.Part time Wage" );
        switch ((int) no) {
            case 0:
                if (employee == IS_PRESENT) {
                    System.out.println("Employee is present");
                } else {
                    System.out.println("Employee is not present");
                }
                break;
            case 1:
                empHrs = 8;
                dailyEmpWage = empHrs * WAGE_PER_HOUR;
                System.out.println("Daily employee wage:" + dailyEmpWage);
                break;
            case 2:
                double emp = Math.floor(Math.random() * 8);
                partTimeWage = (int) (emp * PART_TIME_HOUR);
                System.out.println("Part time employee wage:" + partTimeWage);
                break;
            default:
                System.out.println("Wrong choice");

        }
        empHrs=8;
        dailyEmpWage = empHrs * WAGE_PER_HOUR;
        monthlyWage=(WORKING_DAY_PER_MONTH*dailyEmpWage);
        System.out.println("Monthly Wages:"+monthlyWage);
    }
}