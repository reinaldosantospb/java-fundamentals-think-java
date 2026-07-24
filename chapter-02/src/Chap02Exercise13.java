/**
 * Chapter 2 - Exercise 13 - Total Purchase Amount
 *
 * Objective:
 * Practice using multiplication and addition with variables.
 *
 * This program declares variables to represent the prices and
 * quantities of two products. It calculates the total purchase
 * amount by multiplying each product's price by its quantity
 * and adding the two subtotals together. Finally, it displays
 * a simple purchase receipt.
 *
 * Author: Reinaldo Santos
 */
public class Chap02Exercise13 {
    public static void main(String[] args) {
        double product1Price = 19.99;
        int product1Quantity = 3;

        double product2Price = 5.49;
        int product2Quantity = 5;

        double subtotal1 = product1Price * product1Quantity;
        double subtotal2 = product2Price * product2Quantity;
        double total = subtotal1 + subtotal2;

        System.out.println("== Purchase Receipt ==");

        System.out.printf(
                "Product 1: €%.2f x %d = €%.2f%n",
                product1Price, product1Quantity, subtotal1);

        System.out.printf(
                "Product 2: €%.2f x %d = €%.2f%n",
                product2Price, product2Quantity, subtotal2);

        System.out.println("-----------------------");
        System.out.printf("Total: €%.2f%n", total);

    }
}
