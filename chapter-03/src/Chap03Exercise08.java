/*
 * Chapter 3 - Exercise 8
 *
 * This program converts a number of seconds entered by the user
 * into hours, minutes, and seconds.
 *
 * It reads an integer from the keyboard using Scanner and performs
 * the conversion using integer division and the remainder operator (%).
 *
 * Example:
 * Enter the number of seconds: 7384
 * 7384 seconds = 2 hours, 3 minutes, and 4 seconds.
 */

import java.util.Scanner;

public class Chap03Exercise08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int totalSeconds = in.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.printf(
                "%d seconds = %d hours, %d minutes, and %d seconds.%n",
                totalSeconds, hours, minutes, seconds
        );

        in.close();
    }
}