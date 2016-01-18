
/**
 * Write a description of class ShippingCost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ShippingCost
{
    public static void main(String[] args)
    {
        String cat;
        double w;
        Scanner in;
        
        in = new Scanner(System.in);
        
        System.out.println("Lab 5, Alexander Foiles");
        
        System.out.print("What is the weight of your package in pounds? ");
        w = in.nextDouble();
        
        if (w < 1)
        {
            cat = "$3.50";
        }
        else if (w >= 1 && w < 5)
        {
            cat = "$5.25";
        }
        else if (w >= 5 && w < 10)
        {
            cat = "$8.00";
        }
        else if (w >= 10 && w < 20)
        {
            cat = "$15.00";
        }
        else 
        {
            cat = "Package cannot be shipped.";
        }
        
        System.out.println("The cost to ship this package is: " + cat);
        
        in.close();
    }
}
