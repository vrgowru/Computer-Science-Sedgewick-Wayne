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
 * @implSpec - Checksums. The International Standard Book Number (ISBN) is a 10 digit code
 * that uniquely specifies a book. The right most digit is a checksum digit which can be
 * uniquely determined from the other 9 digits from the condition that
 * d1 + 2d2 + 3d3 + ... + 10d10 must be a multiple of 11
 * (here di denotes the ith digit from the right). The checksum digit d1 can be
 * any value from 0 to 10: the ISBN convention is to use the value X to denote 10.
 * Example: the checksum digit corresponding to 020131452 is 5 since is the only value
 * of d1 between 0 and 10 for which d1 + 2*2 + 3*5 + 4*4 + 5*1 + 6*3 + 7*1 + 8*0 + 9*2 + 10*0
 * is a multiple of 11. Write a program ISBN.java that takes a 9-digit integer as a command-line
 * argument, computes the checksum, and prints the 10-digit ISBN number.
 * It's ok if you don't print any leading 0s.
 *
 ************************************************************************************/
public class ISBN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int j = 2; j <= 10; j++) {
            int digit = n % 10;
            sum = sum + j * (digit);
            n = n / 10;
        }
        // print out check digit, use X for 10
        System.out.print("The full ISBN number is " + args[0]);
        if      (sum % 11 == 1) System.out.println("X");
        else if (sum % 11 == 0) System.out.println("0");
        else                    System.out.println(11 - (sum % 11));
    }
}
