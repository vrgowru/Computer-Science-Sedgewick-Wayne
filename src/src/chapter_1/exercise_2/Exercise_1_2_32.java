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
 * @param - Input r, g, b
 *
 * @implSpec - “Color conversion. Several different formats are used to represent color.
 * For example, the primary format for LCD displays, digital cameras, and web pages,
 * known as the RGB format, specifies the level of red (R), green (G), and blue (B)
 * on an integer scale from 0 to 255. The primary format for publishing books and magazines,
 * known as the CMYK format, specifies the level of cyan (C), magenta (M), yellow (Y),
 * and black (K) on a real scale from 0.0 to 1.0. Write a program RGB to CMYK that converts
 * RGB to CMYK. Take three integers—r, g, and b—from the command line and print the equivalent
 * CMYK values. If the RGB values are all 0, then the CMY values are all 0 and the K
 * value is 1; otherwise, use these formulas:
 * w = max (r / 255, g / 255, b / 255)
 * c = (w – (r / 255)) / w
 * m = (w – (g / 255)) / w
 * y = (w – (b / 255)) / w
 * k = 1 – w”
 *
 * @return -
 *
 ************************************************************************************/
public class Exercise_1_2_32 {
    static double C = 0.0;
    static double M = 0.0;
    static double Y = 0.0;
    static double K = 1.0;

    public static void calculateCMYK(double r, double g, double b) {
        if (r == 0 && g == 0 && b == 0) return;
        double w = Math.max((double) r / 255, Math.max((double) g / 255, (double) b / 255));
        C = (w - (r / 255)) / w;
        M = (w - (g / 255)) / w;
        Y = (w - (b / 255)) / w;
        K = 1 - w;
    }

    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);
        double g = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        calculateCMYK(r, g, b);
        System.out.println("CMYK: " + C + "," + M + "," + Y + "," + K);
    }
}
