/**
 * A program for calculating the area of different geometric
 * shapes.
 *
 * @author  Prof. David Bernstein, James Madison University
 * @version 1.0
 */
public class AreaCalculator
{
    /**
     * The entry point of the application.
     *
     * @param args  The command-line arguments (which are ignored).
     */
    public static void main(String[] args)
    {
        double area, diameter, height, width;        
        int    shape;

        JMUConsole.open();        

        JMUConsole.print("Enter the shape (0, 4): ");
        shape = JMUConsole.readInt();
        
        if (shape == 0)
        {
            JMUConsole.print("Enter the diameter: ");
            diameter = JMUConsole.readDouble();            
            area = Geometry.circleArea(diameter);
        }
        else 
        {
            JMUConsole.print("Enter the width: ");
            width = JMUConsole.readDouble();
            JMUConsole.print("Enter the height: ");
            height = JMUConsole.readDouble();
            area = Geometry.rectangleArea(width, height);
        }
        
        JMUConsole.printf("The area is: %5.1f", area);
        JMUConsole.close();        
    }
}

