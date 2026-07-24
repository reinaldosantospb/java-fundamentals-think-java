/**
 * Chapter 2 - Exercise 05 - Temperature Converter
 *
 * Objective:
 * Practice using arithmetic expressions in Java.
 *
 * This program declares a temperature in degrees Celsius,
 * converts it to degrees Fahrenheit using the formula:
 *
 * F = (C * 9 / 5) + 32
 *
 * Finally, it displays both the Celsius and Fahrenheit values.
 *
 * Author: Reinaldo Santos
 */
public class Chap02Exercise05 {
    public static void main(String[] args) {
        double celsius = 25.0; // Declare a temperature in degrees Celsius
        double fahrenheit = (celsius * 9 / 5) + 32; // Convert to degrees Fahrenheit

        System.out.println("Celsius: " + celsius + "°C");
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
    }
}
