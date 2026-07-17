/**
 * Chapter 2 - Exercise 10 - Rectangle Area and Perimeter
 *
 * Objective:
 * Practice using multiplication and arithmetic expressions.
 *
 * This program declares two double variables to represent the
 * width and height of a rectangle. It calculates the rectangle's
 * area by multiplying the width by the height and then calculates
 * the perimeter using the sum of both sides multiplied by two.
 * Finally, it displays the results in an organized format.
 *
 * Author: Reinaldo Santos
 */
public class Chap02Exercise10 {
    public static void main(String[] args) {

        double width = 20;
        double height = 20;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

}