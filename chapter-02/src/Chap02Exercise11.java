/**
 * Chapter 2 - Exercise 11 - Fuel Consumption
 *
 * Objective:
 * Practice using the division operator with floating-point variables.
 *
 * This program declares two double variables to represent the
 * distance traveled and the amount of fuel consumed. It calculates
 * the average fuel consumption by dividing the distance by the fuel
 * used and displays the results in a clear and organized format.
 *
 * Author: Reinaldo Santos
 */
public class Chap02Exercise11 {

    public static void main(String[] args) {
        double distance = 450.0;
        double fuelUsed = 30.0;
        double averageConsumption = distance / fuelUsed;

        System.out.println("Distance traveled: " + distance + " km");
        System.out.println("Fuel consumed: " + fuelUsed + " L");
        System.out.println("Average consumption: " + averageConsumption + " km/L");
    }
}