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
 * @implSpec - Random walk. A Java programmer begins walking aimlessly.
 * At each time step, she takes one step in a random direction (either north, east, south, or west),
 * each with probability 25%. She stops once she is at Manhattan distance r from the starting point.
 * How many steps will the random walker take? This process is known as a two-dimensional random walk.
 *
 * Write a program RandomWalker.java that takes an integer command-line argument r and simulates
 * the motion of a random walk until the random walker is at Manhattan distance r from the
 * starting point. Print the coordinates at each step of the walk (including the starting
 * and ending points), treating the starting point as (0, 0). Also, print the total number
 * of steps taken.
 *
 ************************************************************************************/
public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int steps = 0;
        int x = 0;
        int y = 0;
        System.out.println("(" + x + "," + y + ")");
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
            System.out.println("(" + x + "," + y + ")");
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}
