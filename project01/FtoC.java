
/**
 * Write a description of class FtoC here.
 * 
 * @author (your name) Alexander Foiles
 * @version (a version number or a date) Project01 due 08/28/15
 */
import java.util.Scanner;

public class FtoC
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double fTemp;
        double cTemp;
        
        System.out.println("Project #1 by Alexander Foiles, Due 08/28/15");
        System.out.print("Enter Fahrenheit Temperature: ");  // Input prompt
        fTemp = input.nextDouble();
        cTemp = 5./9*(fTemp-32);
        System.out.println("\nTemperature Conversion");
        System.out.println("FTemp   Ctemp");
        System.out.println(fTemp + "   " + cTemp);
        System.out.println("End of Program");
    }
}
