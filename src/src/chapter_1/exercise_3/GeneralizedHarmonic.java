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
 * @implSpec - Generalized harmonic numbers. Write a program GeneralizedHarmonic.java
 * that takes two integer command-line arguments n and r and uses a for loop to compute
 * the nth generalized harmonic number of order r, which is defined by the following formula:
 *
 *     H(n,r)=1/1^r+1/2^r+⋯+1/n^r.
 *
 * For example, H(3,2)=1/1^2+1/2^2+1/3^2=4936≈1.361111.
 *
 ************************************************************************************/
public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (1 / Math.pow(i, r));
        }
        System.out.print(sum);
    }
}
