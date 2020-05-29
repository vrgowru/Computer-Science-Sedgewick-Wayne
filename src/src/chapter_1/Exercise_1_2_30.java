package chapter_1;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author - Venkateshwara Gowru
 *
 * @param - None
 *
 * @implSpec - Uniform random numbers. Write a program that prints five
 * uniform random numbers between 0 and 1, their average value,
 * and their minimum and maximum values. Use Math.random(),
 * Math.min(), and Math.max().
 *
 * @return - Average, Minimum, Maximum
 *
 ************************************************************************************/

public class Exercise_1_2_30 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double sum = 0;
        double min = 1;
        double max = 0;
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            sum += x;
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        double avg = sum / N;
        System.out.println("Average: " + avg);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
