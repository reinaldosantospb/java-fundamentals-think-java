/**
 * Chapter 2 - Exercise 06 - Average of Three Grades
 *
 * Objective:
 * Practice using the double data type and arithmetic expressions.
 *
 * This program declares three double variables to represent
 * student grades, calculates their arithmetic mean, and
 * displays the grades along with the calculated average.
 *
 * Author: Reinaldo Santos
 */
public class Chap02Exercise06 {

    public static void main(String[] args) {

        // Variables that store the grades
        double grade1 = 7.5;
        double grade2 = 8.0;
        double grade3 = 9.0;

        // Variable that stores the average
        double average = (grade1 + grade2 + grade3) / 3;

        System.out.println("Grades:");
        System.out.println("\tFirst grade: " + grade1);
        System.out.println("\tSecond grade: " + grade2);
        System.out.println("\tThird grade: " + grade3);
        System.out.println();

        System.out.println("Average: " + average);
    }
}