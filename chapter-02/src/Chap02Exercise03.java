/*
 * Chapter 2 - Exercise 03
 * Think Java (2nd Edition)
 *
 * This program performs basic time calculations.
 * It calculates:
 * - the number of seconds since midnight;
 * - the number of seconds remaining in the day;
 * - the percentage of the day that has passed;
 * - the elapsed time between a start time and an end time.
 *
 * Author: Reinaldo Santos
 */
public class Chap02Exercise03 {

    public static void main(String[] args) {

        // Start time
        int hour = 12;
        int minute = 30;
        int second = 0;

        int totalSecondsInDay = 24 * 60 * 60;

        int secondsSinceMidnight =
                (hour * 3600) + (minute * 60) + second;

        int secondsRemaining =
                totalSecondsInDay - secondsSinceMidnight;

        double percentageOfDay =
                (double) secondsSinceMidnight / totalSecondsInDay * 100;

        // End time
        int endHour = 14;
        int endMinute = 30;
        int endSecond = 0;

        int endSeconds =
                (endHour * 3600) + (endMinute * 60) + endSecond;

        int elapsedTime = endSeconds - secondsSinceMidnight;

        System.out.println("Current time: "
                + hour + ":" + minute + ":" + second);

        System.out.println("Seconds since midnight: "
                + secondsSinceMidnight);

        System.out.println("Seconds remaining in the day: "
                + secondsRemaining);

        System.out.println("Percentage of the day passed: "
                + percentageOfDay + "%");

        System.out.println("Elapsed time: "
                + elapsedTime + " seconds");
    }
}