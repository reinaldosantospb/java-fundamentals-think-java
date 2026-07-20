/**
 * Chapter 2 - Exercise 12 - Seconds Conversion
 *
 * Objective:
 * Practice using integer division and the remainder operator.
 *
 * This program declares an integer variable representing a total
 * number of seconds. It converts that value into hours, minutes,
 * and remaining seconds using division (/) and the remainder (%)
 * operator, then displays the results in a clear and organized format.
 *
 * Author: Reinaldo Santos
 */
public class Chap02Exercise12 {
    public static void main(String[] args) {
        int totalSeconds = 7384;

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println("Total: " + totalSeconds + " seconds" );
        System.out.println();

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}