package chapter_1.exercise_3;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 *
 * Exercise Link
 * @link - https://introcs.cs.princeton.edu/java/13flow/
 *
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 *
 * @implSpec - Write a program Kary that takes two integer command line arguments
 * i and k and converts i to base k. Assume that i is an integer in Java’s long
 * data type and that k is an integer between 2 and 16. For bases greater than 10,
 * use the letters A through F to represent the 11th through 16th digits, respectively.
 *
 ************************************************************************************/
public class Kary {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);
        if (k < 2 || k > 16) throw new IllegalArgumentException();
        int power = 1;

    }
}
