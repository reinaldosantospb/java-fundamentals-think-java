/**
 * Chapter 2 - Exercise 09 - Hours to Minutes and Seconds
 *
 * Objective:
 * Practice using arithmetic operators with integer variables.
 *
 * This program declares an integer variable to represent a number
 * of hours. It converts the value to minutes and seconds using
 * multiplication and displays the results in an organized format.
 *
 * Author: Reinaldo Santos
 */

public class Chap02Exercise09 {
    public static void main(String[] args) {
        int hours = 3;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

    }
}
