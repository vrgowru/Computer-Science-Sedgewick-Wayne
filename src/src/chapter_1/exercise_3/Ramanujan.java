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
 * @implSpec - Ramanujan's taxi. S. Ramanujan was an Indian mathematician who became
 * famous for his intuition for numbers. When the English mathematician G. H. Hardy
 * came to visit him in the hospital one day, Hardy remarked that the number of his
 * taxi was 1729, a rather dull number. To which Ramanujan replied, "No, Hardy!
 * No, Hardy! It is a very interesting number. It is the smallest number expressible
 * as the sum of two cubes in two different ways." Verify this claim by writing a program
 * Ramanujan.java that takes an integer command-line argument n and prints all integers
 * less than or equal to n that can be expressed as the sum of two cubes in two different
 * ways - find distinct positive integers a, b, c, and d such that a^3 + b^3 = c^3 + d^3.
 * Use four nested for loops.
 *
 * Now, the license plate 87539319 seems like a rather dull number. Determine why it's not.
 *
 ************************************************************************************/
public class Ramanujan {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) break;
            for (int b = a; b <= n; b++) {
                int b3 = b * b * b;
                if (a3 + b3 > n) break;
                for (int c = a + 1; c <= n; c++) {
                    int c3 = c * c * c;
                    if (c3 > a3 + b3) break;
                    for (int d = c; d <= n; d++) {
                        int d3 = d * d * d;
                        if (c3 + d3 > a3 + b3) break;
                        if (c3 + d3 == a3 + b3) {
                            System.out.print((a3 + b3) + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = ");
                            System.out.print(c + "^3 + " + d + "^3");
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
