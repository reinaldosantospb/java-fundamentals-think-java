/**
 * Chapter 2 - Exercise 08 - Monthly Salary
 *
 * Objective:
 * Practice using multiplication with integer and floating-point variables.
 *
 * This program declares a double variable to represent the hourly rate
 * and an integer variable to represent the number of hours worked.
 * It calculates the monthly salary by multiplying the hourly rate by
 * the hours worked and displays all the information in a clear format.
 *
 * Author: Reinaldo Santos
 */
public class Chap02Exercise08 {

    public static void main(String[] args) {

        double hourlyRate = 12.50;
        int hoursWorked = 160;
        double monthlySalary = hourlyRate * hoursWorked;

        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Monthly Salary: $" + monthlySalary);
    }
}