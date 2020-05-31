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
 *
 * @implSpec - Several different formats are used to represent color.
 * For example, the primary format for LCD displays, digital cameras,
 * and web pages—known as the RGB format—specifies the level of red (R),
 * green (G), and blue (B) on an integer scale from 0 to 255.
 * The primary format for publishing books and magazines—known as
 * the CMYK format—specifies the level of cyan (C), magenta (M),
 * yellow (Y), and black (K) on a real scale from 0.0 to 1.0.
 *
 * Write a program CMYKtoRGB.java that converts from CMYK format
 * to RGB format using these mathematical formulas:
 *
 * white = 1−black
 * red = 255×white×(1−cyan)
 * green = 255×white×(1−magenta)
 * blue = 255×white×(1−yellow)
 *
 * Your program must take four double command-line arguments
 * cyan, magenta, yellow, and black;
 * compute the corresponding RGB values, each rounded to the nearest integer;
 * and print the RGB values, as in the following sample executions:
 *
 *
 ************************************************************************************/
public class CMYKtoRGB {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);
        double w = 1 - k;
        double r = 255 * w * (1 - c);
        double g = 255 * w * (1 - m);
        double b = 255 * w * (1 - y);
        System.out.println("red = " + Math.round(r));
        System.out.println("blue = " + Math.round(g));
        System.out.println("green = " + Math.round(b));
    }
}
