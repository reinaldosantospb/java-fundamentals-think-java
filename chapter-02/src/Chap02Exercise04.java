/**
 * Chapter 2 - Exercise 04 - Simple Calculator
 *
 * Objective:
 * Practice using arithmetic operators in Java.
 *
 * This program declares two integer variables and performs the
 * basic arithmetic operations:
 * - Addition
 * - Subtraction
 * - Multiplication
 * - Integer division
 * - Remainder (modulus)
 *
 * The results are displayed in a clear and readable format.
 *
 * Author: Reinaldo Santos
 */
public class Chap02Exercise04 {
    public static void main(String[] args) {
       int number1 = 25;
       int number2 = 8;

       // Perform arithmetic operations
       int sum = number1 + number2;
       int difference = number1 - number2;
       int product = number1 * number2;
       int quotient = number1 / number2;
       int remainder = number1 % number2;

       // Display the results
       System.out.println("Addition: " + sum);
       System.out.println("Subtraction: " + difference);
       System.out.println("Multiplication: " + product);
       System.out.println("Integer Division: " + quotient);
       System.out.println("Remainder: " + remainder);
    }
}
