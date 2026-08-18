/*
 * Chapter 3 - Exercise 7
 *
 * This program extracts the hundreds, tens, and ones digits
 * from a three-digit integer entered by the user.
 *
 * It reads an integer from the keyboard using the Scanner class
 * and uses integer division (/) and the remainder operator (%)
 * to extract each digit.
 *
 * Example:
 * Enter an integer with three digits: 583
 * The hundreds digit is: 5
 * The tens digit is: 8
 * The ones digit is: 3
 */
import java.util.Scanner;
public class Chap03Exercise07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer with three digits: ");
        int number = in.nextInt();
        System.out.println("The hundreds digit is: " + number / 100);
        System.out.println("The tens digit is: " + (number % 100) / 10);
        System.out.println("The ones digit is: " + number % 10);
        in.close();
    }
}
