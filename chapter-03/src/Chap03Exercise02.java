/*
 * Chapter 3 - Exercise 2
 *
 * This exercise demonstrates that the Java compiler does not validate
 * the format string used with printf().
 *
 * It attempts to print a double value using the %d format specifier.
 * The %d specifier expects an integer value, but a double is provided.
 * The program compiles successfully, but throws an
 * IllegalFormatConversionException at runtime.
 *
 * This exercise shows the importance of matching format specifiers
 * with the correct data types and number of arguments.
 */
public class Chap03Exercise02 {
    public static void main(String[] args) {
        double price = 19.99;
        System.out.printf("%d%n", price);
    }    
}
