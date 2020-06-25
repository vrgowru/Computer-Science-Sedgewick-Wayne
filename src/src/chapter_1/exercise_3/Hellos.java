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
 * @implSpec - Rewrite TenHellos.java to make a program Hellos.java that takes the number
 * of lines to print as a command-line argument. You may assume that the argument is
 * less than 1000. Hint: consider using i % 10 and i % 100 to determine whether to use
 * "st", "nd", "rd", or "th" for printing the ith Hello.
 *
 *
 ************************************************************************************/
public class Hellos {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++) {
            String suffix = "";
            if (11 <= i % 100 && i % 100 <= 20) suffix = "th";
            else if (i % 10 == 1) suffix = "st";
            else if (i % 10 == 2) suffix = "nd";
            else if (i % 10 == 3) suffix = "rd";
            else suffix = "th";
            System.out.print(i);
            System.out.println(suffix + " Hello");
        }
    }
}
