import java.util.Scanner;
public class Chap03Exercise07 {
    public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.print("Enter a number int with three digits: ");
int number = in.nextInt();
System.out.println("The hundreds digit is: " + number / 100);
System.out.println("The tens digit is: " + (number % 100) / 10);
System.out.println("The ones digit is: " + number % 10);
in.close();
    }
}
