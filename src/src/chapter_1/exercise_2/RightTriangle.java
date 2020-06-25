package chapter_1.exercise_2;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 *
 * @implSpec - Integers and booleans. Write a program RightTriangle that takes three
 * int command-line arguments and determines whether they constitute the side
 * lengths of some right triangle.
 *
 * The following two conditions are necessary and sufficient:
 *
 * Each integer must be positive.
 *
 * The sum of the squares of two of the integers must equal the square of the third integer.
 *
 *
 ************************************************************************************/
public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean result = (a > 0 && b > 0 && c > 0)
                && (a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a);
        System.out.println(result);
                 }
}
