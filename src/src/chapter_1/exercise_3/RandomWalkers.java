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
 * @implSpec - Write a program RandomWalkers.java that takes two integer command-line
 * arguments r and trials. In each of trials independent experiments, simulate a
 * random walk until the random walker is at Manhattan distance r from the starting point.
 * Print the average number of steps.
 *
 * As r increases, we expect the random walker to take more and more steps.
 * But how many more steps? Use RandomWalkers.java to formulate a hypothesis
 * as to how the average number of steps grows as a function of r.
 *
 ************************************************************************************/
public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        int steps = 0;
        for (int i = 0; i < trials; i++) {
            while ((Math.abs(x) + Math.abs(y)) < r) {
                double random = Math.random();
                if (random <= (double) 1 / 4) {
                    // East
                    x = x + 1;
                } else if ((double) 1 / 4 < random && random <= (double) 1 / 2) {
                    // West
                    x = x - 1;
                } else if ((double) 1 / 2 < random && random <= (double) 3 / 4) {
                    // North
                    y = y + 1;
                } else {
                    // South
                    y = y - 1;
                }
                steps++;
            }
            x = 0;
            y = 0;
        }
        System.out.println("average number of steps = " + ((double) steps / (double) trials));
    }
}
