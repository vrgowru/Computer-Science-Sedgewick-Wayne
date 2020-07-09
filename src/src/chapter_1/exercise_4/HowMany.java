package chapter_1.exercise_4;

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
 * @implSpec - Write a program HowMany.java that takes a variable
 * number of command-line arguments and prints how many there are.
 *
 ************************************************************************************/
public class HowMany {
    public static void main(String[] args) {
        int n = args.length;
        System.out.print("You have provided " + n + " command line argument");
        if (n == 1) System.out.print(".");
        else System.out.print("s.");
    }
}
