
/**
 * Write a program to calculate the average acceleration of an object.
 * 
 * Open keyboard input
 * Prompt the user for v0, v1, and t
 * Calculate the average acceleration
 * Print results to the terminal
 * Close keyboard input
 * 
 * @author Alexander Foiles
 * @version Lab04 09/09/2015
 */
import java.util.Scanner;
public class AvgA
{
    public static void main(String[] args)
    {
        double a;
        double v0, v1;
        double t;
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.print("Enter v0, v1, and t: ");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();
        
        a = ((v1 - v0)/t);
        
        System.out.printf("The average acceleration is %.4f%n", a);
        System.out.println("End of Program");
        
        input.close();
    }
}
