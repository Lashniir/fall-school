
/**
 * Write a description of class FormatedCircleArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FormatedCircleArea
{
        public static void main(String[] args)
    {
        double radius;
        double area;
        Scanner in;
        
        in = new Scanner(System.in);
        
        System.out.print("Enter the value for radius: ");
        
        radius = in.nextDouble();
        
        area = Math.PI * radius * radius;
        
        System.out.printf("The area of the circle is: %.2f",area);
        
        in.close();
    }
}
