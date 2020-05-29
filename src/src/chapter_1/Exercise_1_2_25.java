package chapter_1;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 *
 * @param - Temperature and Velocity
 *
 * @implSpec - “Wind chill. Given the temperature T (in degrees Fahrenheit) and
 * the wind speed v (in miles per hour), the National Weather Service defines the
 * effective temperature (the wind chill) as follows:
 * w = 35.74 + 0.6215 T + (0.4275 T – 35.75)v pow(0.16)”
 *
 * “Write a program that takes two double command-line arguments temperature
 * and velocity and prints the wind chill. Use Math.pow(a, b) to compute ab.
 * Note: The formula is not valid if T is larger than 50 in absolute value or
 * if v is larger than 120 or less than 3 (you may assume that the values you
 * get are in that range)”
 *
 * @return Wind Chill
 *
 ************************************************************************************/
public class Exercise_1_2_25 {
    public static void main(String[] args) {
        double T = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        if (Math.abs(v) < 3 || Math.abs(v) > 120 || T > 50) {
            System.out.println("Incorrect input");
        }
        double W = 35.74 + (0.6215 * T) + (0.4275 * T - 35.75) * (Math.pow(v, 0.16));
        System.out.println("Wind Chill: " + W);
    }
}
