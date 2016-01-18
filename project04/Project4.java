/**
 * Write a program that reads three integers from a text file and prints the integers in 
 * non-decreading order to a new text file. Have this program loop six times.
 * 
 * @author Alexander Foiles
 * @version Project 4 Due 10/01/2015 by 11pm
 */
import java.io.*;
import java.util.Scanner;
public class Project4
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        int num1, num2, num3, temp;
        Scanner inF = new Scanner(new File("data4.txt"));
        PrintWriter outF = new PrintWriter(new File("data4Output.txt"));

        outF.printf("Project 4 by Alexander Foiles, Due 10/01/2015 by 11pm%n%n");

        for(int x=0 ; x<6 ; x++)
        {
            num1 = inF.nextInt();
            num2 = inF.nextInt();
            num3 = inF.nextInt();

            outF.printf("3 integers inputed are:  %6d %6d %6d%n", num1, num2, num3);
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

            outF.printf("The sorted integers are: %6d %6d %6d%n%n", num1, num2, num3);
        }

        outF.println("End of program");

        inF.close();
        outF.close();
    }
}