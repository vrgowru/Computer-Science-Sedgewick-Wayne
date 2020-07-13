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
 * @implSpec -  Find a duplicate. Given an integer array of length n,
 * with each value between 1 and n, write a code fragment to determine
 * whether there are any duplicate values. You may not use an extra array
 * (but you do not need to preserve the contents of the given array.)
 *
 ************************************************************************************/
public class FindDuplicates {
    public static void main(String[] args) {
        // Create Array
        int n = (int) (Math.random() * 200);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 200);
        }

        // Find Duplicates
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if (a[i] == a[j] && i != j) {
                    throw new RuntimeException("There are duplicates");
                }
            }
        }

    }
}
