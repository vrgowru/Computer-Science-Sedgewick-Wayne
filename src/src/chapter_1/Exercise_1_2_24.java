package chapter_1;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @Link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 *
 * @ProblemStatement - “Continuously compounded interest.
 * Write a program that calculates and prints the amount of money you would have
 * after t years if you invested P dollars at an annual interest rate r
 * (compounded continuously). The desired value is given by the formula P * e to the power of (rt).”
 *
 *
 * @Output Compound interest
 *
 ************************************************************************************/

public class Exercise_1_2_24 {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        if (P <= 0 || t <= 0) {
            System.out.println("Unable to calculate interest");
            return;
        }
        double cMPY = P * Math.exp(r * t);
        System.out.println("Principal " + P + " compounded over " + t + " " +
                "years at interest rate " + r + "% would be " + cMPY);
    }
}
