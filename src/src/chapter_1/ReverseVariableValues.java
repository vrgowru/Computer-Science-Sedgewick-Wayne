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
 * @Problem Statement - Reverse values between two variables using a temp variable and
 * without using a temp variable
 *
 * @Output - assigns value of a to b and b to a
 *
 ************************************************************************************/

public class ReverseVariableValues {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        a = a - b;
        b = b + a;
        a = b - a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
