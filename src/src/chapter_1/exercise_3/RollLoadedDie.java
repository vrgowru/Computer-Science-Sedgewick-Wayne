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
 * @implSpec - Write a program RollLoadedDie.java that prints the result of rolling a
 * loaded die such that the probability of getting a 1, 2, 3, 4, or 5 is 1/8 and
 * the probability of getting a 6 is 3/8.
 *
 *
 ************************************************************************************/
public class RollLoadedDie {
    public static void main(String[] args) {
        double result = Math.random();
        int output = 6;
        double bp = (double) 1 / 8;
        if (result <= bp) {
            output = 1;
        } else if (result <= 2 * bp) {
            output = 2;
        } else if (result <= 3 * bp) {
            output = 3;
        } else if (result <= 4 * bp) {
            output = 4;
        } else if (result <= 5 * bp) {
            output = 5;
        }
        System.out.println(output);
    }
}
