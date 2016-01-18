
/**
 * Calculate the energy needed to heat water from an initial temperature to a final temperature.
 * 
 * @author Alexander Foiles
 * @version Lab04a 09/09/2015
 */
import java.util.Scanner;
public class CalcQ
{
    public static void main(String[] args)
    {
        double m, q;
        double initialTemperature;
        double finalTemperature;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in kilograms: ");
        m = input.nextDouble();
        
        System.out.print("Enter the initial temperature: ");
        initialTemperature = input.nextDouble();
        
        System.out.print("Enter the final temperature: ");
        finalTemperature = input.nextDouble();
        
        q = m * (finalTemperature - initialTemperature) * 4184;
        
        System.out.printf("The energy needed is %.1f", q);
        
        input.close();
    }
}
