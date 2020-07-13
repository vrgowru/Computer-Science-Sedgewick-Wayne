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
 * @implSpec - Write a program InversePermutation.java that reads in a
 * permutation of the integers 0 to n-1 from n command-line arguments
 * and prints the inverse permutation. (If the permutation is in an array a[],
 * its inverse is the array b[] such that a[b[i]] = b[a[i]] = i.)
 * Be sure to check that the input is a valid permutation.
 *
 ************************************************************************************/
public class InversePermutation {
    public static void main(String[] args) {
        int n = args.length;
        int[] a = new int[n];

        // read input array
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        // Check for permutation
        for (int i = 0; i < n; i++) {
            boolean[] exists = new boolean[n];
            if (a[i] < 0 || a[i] > n || exists[a[i]]) {
                throw new RuntimeException("Input is not a permutation");
            }
            exists[a[i]] = true;
        }

        // Invert array
        int[] ainv = new int[n];
        for (int i = 0; i < n; i++) {
            ainv[a[i]] = i;
        }

        // Print inverse
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d", ainv[i]);
        }
    }
}
