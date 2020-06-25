package chapter_1.exercise_2;

/************************************************************************************
 * This program is written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 *
 * @param - Input x and y
 *
 * @implSpec - “Polar coordinates. Write a program that converts from Cartesian
 * to polar coordinates. Your program should accept two double command-line arguments x
 * and y and print the polar coordinates r and θ. Use the method Math.atan2(y, x)
 * to compute the arc tangent value of y/x that is in the range from -π to π.”
 *
 *
 * @return -  Polar Co-ordinates r and θ
 *
 ************************************************************************************/
public class Exercise_1_2_26 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double θ = Math.toDegrees(Math.atan2(y, x));
        double r = Math.sqrt(x * x + y * y);
        System.out.println("Polar Co-ordinates r: " + r + " and θ: " + θ);
    }
}
