/*
 * Chapter 3 - Exercise 1
 *
 * This exercise demonstrates that the Java compiler does not validate
 * the format string used with printf().
 *
 * Expected result:
 * Exception in thread "main"
 * java.util.IllegalFormatConversionException: f != java.lang.Integer
 *
 * Explanation:
 * The %f format specifier accepts only float and double values.
 * Since an int is passed to printf(), Java throws an
 * IllegalFormatConversionException at runtime.
 */
public class Chap03Exercise01 {
    public static void main(String[] args) {
       int number = 10;
       System.out.printf("%f%n", number);
       //Exception in thread "main" java.util.IllegalFormatConversionException: f != java.lang.Integer 
    }
}
