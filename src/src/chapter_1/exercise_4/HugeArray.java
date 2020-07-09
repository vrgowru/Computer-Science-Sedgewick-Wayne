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
 * @implSpec - Describe and explain what happens when you try to compile a program HugeArray.java
 * with the following statement:
 *
 *     int n = 1000;
 *     int[] a = new int[n*n*n*n];
 *
 * The programs runs with an error java.lang.OutOfMemoryError: Java heap space
 ************************************************************************************/
public class HugeArray {
    public static void main(String[] args) {
        int n = 1000;
        int[] a = new int[n * n * n];
    }
}
