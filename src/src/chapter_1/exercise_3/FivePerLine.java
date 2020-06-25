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
 * @implSpec - Write a program FivePerLine.java that, using one for loop and one
 * if statement, prints the integers from 1000 to 2000 with five integers per line.
 * Hint: use the % operator.
 *
 ************************************************************************************/
public class FivePerLine {
    public static void main(String[] args) {
        int M = 2000;
        int N = 1000;
        int diff = Math.abs(M - N);
        for (int i = 1; i <= diff; i++) {
            System.out.print(N + i + " ");
            if ((N + i) % 5 == 0) System.out.println();
        }
    }
}
