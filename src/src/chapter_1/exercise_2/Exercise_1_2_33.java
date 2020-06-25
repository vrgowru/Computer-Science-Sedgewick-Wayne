package chapter_1.exercise_2;

/************************************************************************************
 * These are set of programs written for Computer Science: Programming with a Purpose
 * course on coursera linked below
 * @link - https://www.coursera.org/learn/cs-programming-java/home/welcome
 * The programs contain examples, solutions to chapter exercises
 * programming assignments and are authored by
 *
 * @author Venkateshwara Gowru
 *
 * @param - double x1, y1, x2, y2
 *
 * @implSpec - “Great circle. Write a program GreatCircle that takes four double
 * command-line arguments—x1, y1, x2, and y2—(the latitude and longitude,
 * in degrees, of two points on the earth) and prints the great-circle distance
 * between them. The great-circle distance (in nautical miles) is given by the
 * following equation: d = 60 arccos(sin(x1) sin(x2) + cos(x1) cos(x2) cos(y1 – y2))
 * Note that this equation uses degrees, whereas Java’s trigonometric functions
 * use radians. Use Math.toRadians() and Math.toDegrees() to convert between the two.
 * Use your program to compute the great-circle distance between Paris
 * (48.87° N and –2.33° W) and San Francisco (37.8° N and 122.4° W).”
 *
 * @return -
 *
 ************************************************************************************/
public class Exercise_1_2_33 {

    public static double calculateDistance(double x1, double x2, double y1, double y2) {
        return 60 * Math.toDegrees(Math.acos(Math.sin(Math.toRadians(x1)) *
                Math.sin(Math.toRadians(x2)) + (
                Math.cos(Math.toRadians(y1)) * Math.cos(Math.toRadians(y2))
                        * Math.sin(Math.toRadians(y1 - y2)))));
    }


    public static double calculateGreaterCircleDistance(double x1, double x2, double y1, double y2) {
        double a = Math.sin(Math.toRadians(x2 - x1) / 2);
        double b = Math.cos(Math.toRadians(x1));
        double c = Math.cos(Math.toRadians(x2));
        double d = Math.sin(Math.toRadians(y2 - y1) / 2);
        return 2 * 6371.0 *
                Math.asin(
                        Math.sqrt(a * a + b * c * d * d)
                );
    }

    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double d = calculateGreaterCircleDistance(x1, x2, y1, y2);
        System.out.println(d);
    }
}
