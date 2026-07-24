/**
 * Chapter  2 - Exercise 15 - Personal Information
 * 
 *  Objective:
 *  Practice declaring variables of different data types and
 *  displaying their values using string concatenation.
 *  
 *  This program declares variables to store a person's name,
 *  age, height, and gender. It then prints the information
 *  in a clear and organized format.
 * 
 *  Author: Reinaldo Santos
 */
 
public class Chap02Exercise15 {
    public static void main(String[] args) {
        System.out.println("Personal Information");
        System.out.println();

        String name = "Reinaldo Santos";
        int age = 50;
        double height = 1.75;
        char gender = 'M';

       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Height: " + height);
       System.out.println("Gender: " + gender);

    }
}
