
/**
 * Write a description of class Kilos2lbs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Kilos2lbsFor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int startingKg, endingKg, kg;
        double lb;
        
        System.out.print("Enter the starting value: ");
        startingKg = input.nextInt();
        
        System.out.println("Conversion Table from KS(s) to LB(s)");
        System.out.println("Kilograms     Pounds");
        System.out.println("--------------------");
        
        endingKg = startingKg + 19;
        
        for (kg = startingKg;kg <= endingKg;kg++)
        {
            lb = 2.2 * kg;
            System.out.printf("%-14d%-5.1f%n",kg,lb);
        }
        
        System.out.println("--------------------");
        System.out.println("End of Program");
        input.close();
    }
}
