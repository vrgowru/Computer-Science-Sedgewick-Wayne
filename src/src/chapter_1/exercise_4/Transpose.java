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
 * @implSpec - 
 *
 ************************************************************************************/
public class Transpose {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a[][] = new int[n][n];
        // Create Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (i + j) + (i - j) + (int) (Math.random() * i * j);
            }
        }
        // Print Matrix before
        System.out.println("Before");
        System.out.println("-----------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        // Transpose Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // Print Matrix after
        System.out.println("After");
        System.out.println("-----------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
}
