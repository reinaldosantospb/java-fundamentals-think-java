/*
 * Chapter 3 - Exercise 5
 *
 * This program converts a total number of seconds entered by the user
 * into hours, minutes, and seconds.
 *
 * It reads an integer from the keyboard using Scanner, performs the
 * conversion using integer division and the remainder operator (%),
 * and displays the result using printf.
 *
 * Example:
 * 5000 seconds = 1 hours, 23 minutes, and 20 seconds.
 */
import java.util.Scanner;
public class Chap03Exercise05 {
    public static void main (String[] args){
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total number of seconds: ");
        int totalSeconds = in.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds.%n", 
        totalSeconds, hours, minutes, seconds);
        in.close();

        
    }
}
