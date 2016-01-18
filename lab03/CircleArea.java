
/**
 * Program that accepts the radius of a circle and calculates its area rounded to two decimal points.
 * 
 * @author Alexander Foiles 
 * @version Lab03 09/02/2015
 */
import java.util.Scanner;
public class CircleArea
{
        public static void main(String[] args)
    {
        double radius;
        double area;
        double roundedArea;
        Scanner in;
        
        in = new Scanner(System.in);
        
        System.out.print("Enter the value for radius: ");
        
        radius = in.nextDouble();
        
        area = Math.PI * radius * radius;
        
        roundedArea = ((int)(area * 100 + 0.5))/100.0;
        
        System.out.println("The area of the circle is: " + roundedArea);
        
        in.close();
    }
}
