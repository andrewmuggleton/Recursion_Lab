/**
 * A utility class for performing calculations involving
 * geometric shapes.
 *
 * @author  Prof. David Bernstein, James Madison University
 * @version 1.0
 */
public class Geometry
{
    /**
     * Calculate the area of a circle.
     *
     * @param diameter  The diameter of the circle
     * @return          The area
     */
    public static double circleArea(double diameter)
    {
       double    area, radius;
       
       radius = diameter / 2.0;       
       area   = Math.PI * Math.pow(radius, 2.0);

       return area;       
    }

    /**
     * Calculate the area of a rectangle.
     *
     * @param width  The width of the rectangle
     * @param height The height of the rectangle
     * @return       The area
     */
    public static double rectangleArea(double width, double height)
    {
       double     area;
       
       area = width * height;

       return area;
    }

    /**
     * Calculate the area of a aquare.
     *
     * @param side   The size of the sides
     * @return       The area
     */
    public static double squareArea(double side)
    {
       return rectangleArea(side, side);       
    }

    /**
     * Return the number of angles for a closed geometric
     * shape with the given number of sides.
     *
     * @param sides   The number of sides in the shape of interest
     * @return        The number of angles in the shape
     */
    public static int anglesIn(int sides)
    {
        return sides;
    }
}
