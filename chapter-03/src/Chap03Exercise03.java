
/*
 * Chapter 3 - Exercise 3
 *
 * This exercise demonstrates that the Java compiler does not validate
 * the format string used with printf().
 *
 * It attempts to use two %d format specifiers while providing
 * only one argument to printf().
 * The program compiles successfully, but throws a
 * MissingFormatArgumentException at runtime because the second
 * format specifier does not have a corresponding argument.
 *
 * This exercise shows the importance of providing the correct
 * number of arguments for each format specifier.
 */
public class Chap03Exercise03 {
    public static void main(String[] args) {
        int age = 25;
        System.out.printf("%d %d%n", age);
    }
}
