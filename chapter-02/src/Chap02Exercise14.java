/**
 * Chapter 2 - Exercise 14 - Discount Percentage
 *
 * Objective:
 * Practice calculating percentages using floating-point variables.
 *
 * This program declares variables to represent the original price
 * of a product and the discount percentage. It calculates the
 * discount amount and the final price after applying the discount.
 * Finally, it displays the original price, the discount percentage,
 * the discount amount, and the final price in a clear and organized
 * format.
 *
 * Author: Reinaldo Santos
 */
public class Chap02Exercise14 {
    public static void main(String[] args) {
        double originalPrice = 120.00;
        double discountPercentage = 15.00;
        double discountValue = originalPrice * (discountPercentage / 100);
        double finalPrice = originalPrice - discountValue;

        System.out.println("Original Price: €" + originalPrice);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: €" + discountValue);
        System.out.println("Final Price: €" + finalPrice);

    }
}