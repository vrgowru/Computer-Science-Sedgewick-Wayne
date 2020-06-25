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
 * @param - Double numbers x y z
 *
 * @implSpec - “Order check. Write a program that takes three double
 * command-line arguments x, y, and z and prints true if the values are strictly
 * ascending or descending (x < y < z or x > y > z), and false otherwise.”
 *
 * @return - true, false
 *
 ************************************************************************************/
public class Exercise_1_2_28 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        System.out.println((x > y && y > z) || (x < y && y < z));
    }
}
