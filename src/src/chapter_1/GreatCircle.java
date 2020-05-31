package chapter_1;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 **
 * @implSpec - Write a program GreatCircle.java that takes four double command-line
 * arguments x1, y1, x2, and y2—the latitude and longitude (in degrees) of two
 * points on the surface of the earth—and prints the great-circle
 * distance (in kilometers) between them. Use the following Haversine formula
 *
 ************************************************************************************/
public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double a = Math.sin((x2 - x1) / 2);
        double b = Math.cos(x1);
        double c = Math.cos(x2);
        double d = Math.sin((y2 - y1) / 2);
        double result = 2 * 6371.0 *
                Math.asin(
                        Math.sqrt(a * a + b * c * d * d)
                );
        System.out.println(result + " kilometers");
    }
}
