/**
 * Chapter 2 - Exercise 07 - Age in Days
 *
 * Objective:
 * Practice using multiplication with integer variables.
 *
 * This program declares an integer variable to represent a person's
 * age in years, calculates the approximate number of days lived
 * assuming each year has 365 days, and displays the age along with
 * the calculated result.
 *
 * Author: Reinaldo Santos
 */
public class Chap02Exercise07 {

    public static void main(String[] args) {
        int years = 20;
        int days = years * 365;

        System.out.println("Age:");
        System.out.println(years + " years");

        System.out.println();

        System.out.println("Approximate days:");
        System.out.println(days);
    }

}