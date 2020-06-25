package chapter_1.exercise_2;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 **
 * @implSpec - “Three-sort. Write a program that takes three integer command-line
 * arguments and prints them in ascending order. Use Math.min() and Math.max().”
 *
 *
 ************************************************************************************/

public class Exercise_1_2_34 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - max - min;
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);

    }
}
