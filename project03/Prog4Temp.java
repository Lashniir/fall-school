
/**
 * Write a description of class Prog4Temp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.Scanner;
public class Prog4Temp
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        int num1, num2, num3, temp;
        Scanner inF = new Scanner(new File("data4Sam.txt"));
        PrintWriter outF = new PrintWriter(new File("data4SamOut.txt"));
        
        outF.println("Project 3 by Alexander Foiles, Due 09/25/2015 at 5pm");
        int sum = 0;
        
        for(int x=0 ; x<6 ; x++)
        {
        num1 = inF.nextInt();
        num2 = inF.nextInt();
        num3 = inF.nextInt();
        
        outF.printf("3 integers inputed are:  %4d %4d %4d%n", num1, num2, num3);
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
        
        outF.printf("The sorted integers are: %4d %4d %4d%n%n", num1, num2, num3);
        }
        
        outF.println("End of program");
        System.out.println("Program Completed, Check data4SamOut.txt");
        
        inF.close();
        outF.close();
    }
}
