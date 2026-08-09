/*
 * Chapter 3 - Exercise 4
 *
 * This program converts a temperature from Celsius to Fahrenheit.
 *
 * It prompts the user to enter a temperature in Celsius, reads the
 * input using the Scanner class, performs the conversion with the
 * formula F = C × 9 / 5 + 32, and displays the result formatted
 * with one decimal place.
 *
 * This exercise demonstrates:
 * - User input with Scanner
 * - Reading a double value
 * - Arithmetic operations
 * - Output formatting with printf()
 */
import java.util.Scanner;

public class Chap03Exercise04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        double celsius = in.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        System.out.printf("%.1f C = %.1f F%n", celsius, fahrenheit);

        in.close();
    }
}