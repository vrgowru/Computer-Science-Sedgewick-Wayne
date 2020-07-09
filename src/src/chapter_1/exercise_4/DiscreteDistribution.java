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
 * @implSpec - Write a program DiscreteDistribution.java that takes a variable number
 * of integer command-line arguments and prints the integer i with probability
 * proportional to the ith command-line argument
 *
 ************************************************************************************/
public class DiscreteDistribution {
    public static void main(String[] args) {
        int[] frequencies = new int[args.length];
        for (int i = 0; i < frequencies.length; i++) {
            frequencies[i] = Integer.parseInt(args[i]);
        }
    }
}
