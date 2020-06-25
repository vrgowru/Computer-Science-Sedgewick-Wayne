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
 * @implSpec - Write a program FunctionGrowth.java that prints a table of the
 * values of ln n, n, n ln n, n^2, n^3, and 2^n for n = 16, 32, 64, ..., 2048.
 * Use tabs ('\t' characters) to line up columns.
 *
 ************************************************************************************/
public class FunctionGrowth {
    public static void main(String[] args) {
        int n = 2;
        System.out.println("ln n\tn\tn ln n\tn^2\tn^3\t2^n");
        while (n <= 2048) {
            System.out.print((int)Math.log(n));
            System.out.print("\t");
            System.out.print(n);
            System.out.print("\t");
            System.out.print((int)(n * Math.log(n)));
            System.out.print("\t");
            System.out.print(n * n);
            System.out.print('\t');
            System.out.print(n * n * n);
            System.out.print('\t');
            System.out.print(Math.pow(2, n));
            System.out.println();
            n = 2 * n;
        }
    }
}
