
/**
 * Write a description of class LoopFileSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LoopFileSort
{
    public static void main(String[] args)
    {
        int num1, num2, num3, temp;
        Scanner input = new Scanner(System.in);
                
        System.out.println("Project 3 by Alexander Foiles, Due 09/25/2015 at 5pm");
        int sum = 0;
        for(int x=0 ; x<6 ; x++)
        {
        
        System.out.print("Input 3 integers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        
        if (num1 > num2)
        {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3)
        {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2)
        {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.printf("The sorted integers are: %4d %4d %4d\n", num1, num2, num3);
        }
        
        System.out.println("End of program");
        
        input.close();
    }
}
