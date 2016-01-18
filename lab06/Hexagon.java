/**
 * Calculate the area of a hexagon given an input for the side length
 * 
 * @author Alexander Foiles
 * @version Lab06 section 1 09/23/2015
 */
import java.util.Scanner;
public class Hexagon
{
   public static void main(String args[])
   {
       double numer, denom, area, s;
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the side: ");
       s = input.nextDouble();
       
       numer = 6 * Math.pow(s,2);
       denom = 4 * Math.tan(Math.PI/6);
       area = numer / denom;
       
       System.out.printf("The area of the hexagon is %.2f\n",area);
       input.close();         
    }
}
