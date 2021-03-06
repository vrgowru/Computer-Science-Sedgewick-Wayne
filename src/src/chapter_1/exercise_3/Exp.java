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
 * @implSpec - Exponential function. Assume that x is a positive variable of type double.
 * Write a program Exp.java that computes e^x using the Taylor series expansion
 *
 *     e^x=1+x+x^2/2!+x^3/3!+x^4/4!+…
 *
 ************************************************************************************/
public class Exp {
    public static void main(String[] args) {
        int[] b = {1, 2, 3};
        int[] c = b;
        c[0] += b[2];
        c[1] += b[1];
        c[2] += b[0];
        System.out.println(c[0] + c[1] + c[2]);
    }
}
