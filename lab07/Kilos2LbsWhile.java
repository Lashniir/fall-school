
/**
 * Write a description of class Kilos2lbsInfLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Kilos2LbsWhile
{
    public static void main(String[] args)
    {
        int kg;
        double lb;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lab 7, Written by Alexander Foiles");
        System.out.println("-------------------------------------------------------");
        System.out.print("Enter kilograms or a negative number to terminate: ");
        kg = input.nextInt();
        
        while(kg >= 0)
        {
            lb = 2.2 * kg;
            System.out.printf("Pounds = %.1f%n", lb);
            System.out.print("Enter kilograms or a negative number to terminate: ");
            kg = input.nextInt();
        }
        
        System.out.println("End of Program");
        System.out.println("*******************************************************");
        input.close();
    }
}
