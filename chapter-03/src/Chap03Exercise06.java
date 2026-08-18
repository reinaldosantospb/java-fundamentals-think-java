/*
 * Chapter 3 - Exercise 6
 *
 * This program is a Guess My Number game.
 *
 * It generates a random number between 1 and 100 using the Random class,
 * prompts the user to enter a guess, and reads the input using Scanner.
 * The program then calculates the absolute difference between the user's
 * guess and the generated number and displays the results.
 *
 * Example:
 * Guess a number between 1 and 100: 45
 * Your guess is: 45
 * The random number is: 14
 * The difference between your guess and the number is: 31
 */
import java.util.Scanner;
import java.util.Random;
public class Chap03Exercise06 {
   public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    int number = random.nextInt(100) + 1;
    System.out.print("Guess a number between 1 and 100: ");
    int guess = in.nextInt();
    System.out.println("Your guess is: " + guess);
    int difference = Math.abs(guess - number);
    System.out.println("The random number is: " + number);
    System.out.println("The difference between your guess and the number is: " + difference);
    in.close();         

   }     
}
