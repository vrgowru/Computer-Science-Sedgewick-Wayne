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
 * @implSpec - Write a code fragment to multiply two rectangular
 * matrices that are not necessarily square. Note: For the dot product
 * to be well defined, the number of columns in the first matrix must
 * be equal to the number of rows in the second matrix. Print an error
 * message if the dimensions do not satisfy this condition.
 *
 ************************************************************************************/
public class DotProduct {
    public static void main(String[] args) {
        int m = (int) (Math.random() * 10);
        int n = (int) (Math.random() * 5);
        int x = n;
        int y = (int) (Math.random() * 10);
        int[][] a = new int[m][n];
        int[][] b = new int[x][y];
        int[][] c = new int[m][y];

        // First Matrix
        System.out.println("Matrix a: ");
        System.out.println("-------------------");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = i * i + j * j + 2 * i * j;
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        // 2nd Matrix
        System.out.println("Matrix b: ");
        System.out.println("-------------------");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                b[i][j] = i * i - j * j + 2 * i * j;
                System.out.printf("%4d", b[i][j]);
            }
            System.out.println();
        }

        if (n == x) {
            // Dot product
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < y; j++) {
                    for (int k = 0; k < n; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        } else {
            throw new RuntimeException("Unable to multiply matrices");
        }

        System.out.println("Matrix c: ");
        System.out.println("-------------------");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("%4d", c[i][j]);
            }
            System.out.println();
        }

    }
}
