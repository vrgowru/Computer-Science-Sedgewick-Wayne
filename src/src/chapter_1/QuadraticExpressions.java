package chapter_1;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 *
 * @Problem Statement - Print the values of x when a,b & c from the quadratic
 * expression ax2+bx+c are provided using the formula
 * (b*b +/_ Squareroot(b*b - 4ac))/2a
 *
 * @return - Prints root1 and root2
 *
 ************************************************************************************/


public class QuadraticExpressions {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double discriminant = (b * b) - (4 * a * c);
        if(discriminant >= 0) {
            double d = Math.sqrt(discriminant);
            double root1 = (b + d) / (2 * a);
            double root2 = (b - d) / (2 * a);
            System.out.println("root1: " + root1);
            System.out.println("root2: " + root2);
        } else {
            System.out.println("Discriminant is a negative value");
        }
    }
}
