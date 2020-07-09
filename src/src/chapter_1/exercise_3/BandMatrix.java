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
 * @implSpec - Band matrices. Write a program BandMatrix.java that takes two integer
 * command-line arguments n and width and prints an n-by-n pattern like the ones below,
 * with a zero (0) for each element whose distance from the main diagonal is strictly
 * more than width, and an asterisk (*) for each entry that is not, and two spaces
 * between each 0 or *.
 *
 ************************************************************************************/
public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                if((i-j == 0) || Math.abs(i-j) <= width) {
                    System.out.print("*");
                }else {
                    System.out.print("0");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
