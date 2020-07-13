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
 * @implSpec - Write a program that takes an integer command-line argument n and creates
 * a two-dimensional ragged array a[][] such that a[n][k] contains the probability that
 * you get exactly k heads when you toss a fair coin n times. These numbers are known as
 * the binomial distribution: if you multiply each element in row i by 2^n, you get the
 * binomial coefficients—the coefficients of x^k in (x+1)^n—arranged in Pascal’s triangle.
 * To compute them, start with a[n][0] = 0.0 for all n and a[1][1] = 1.0, then compute
 * values in successive rows, left to right, with a[n][k] = (a[n-1][k] + a[n-1][k-1]) / 2.0.
 *
 ************************************************************************************/
public class BinomialCoEfficients {
    public static void main(String[] args) {
    }
}
