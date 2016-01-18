
/**
 * Write a program that converts inputed feet into meters
 * 
 * @author Alexander Foiles
 * @version Lab03 09/02/2015
 */
import java.util.Scanner;
public class FtoM
{
    public static void main(String[] args)
    {
        double feet;
        double meters;
        Scanner in;
        
        System.out.println("Lab03, Written by Alexander Foiles");
        
        in = new Scanner(System.in);
        System.out.print("Enter a value for feet> ");
        feet = in.nextDouble();
        
        meters = feet * 0.305;
        
        System.out.print(feet);
        System.out.print(" feet is ");
        System.out.printf("%.4f",meters);
        System.out.println(" meters");
        
        in.close();
    }
}
