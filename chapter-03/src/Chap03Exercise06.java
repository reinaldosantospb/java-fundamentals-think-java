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
          

   }     
}
