/*
 * Chapter 2 - Exercise 02
 * Think Java (2nd Edition)
 *
 * This program stores a date using variables and displays it
 * in both American and European date formats.
 *
 * Author: Reinaldo Santos
 */

public class Chap02Exercise02 {

    public static void main(String[] args) {

        // Date information
        String day = "Sunday";
        int date = 12;
        String month = "July";
        int year = 2026;

        // Display each variable individually
        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

        System.out.println();

        // Display the date in American format
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);

        // Display the date in European format
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }
}