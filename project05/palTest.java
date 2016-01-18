/**
 * Write a program that prompts the user to enter a string and displays
 * the string in reverse order, hen test the new string for equality with
 * the input string to determine if it is a palindrome.
 * 
 * @author Alexander Foiles 
 * @version Project 05 Due 10/20/2015
 */
import java.io.*;
import java.util.Scanner;
public class palTest
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        String inString = "";
        String newString = "";
        int sLength = 0;
        int count = 0;
        Scanner in = new Scanner(new File("data5.txt"));
        PrintWriter out = new PrintWriter(new File("palTestResults.txt"));
        
        out.printf("Project 05 by Alexander Foiles, Due 10/20/2015 by 8pm%n");
        out.printf("%-15s %-20s %-20s%n", "Palindrome", "Input String", "New String");
        
        while(in.hasNext())
        {
            inString = in.nextLine();
            inString = inString.trim();
            sLength = inString.length();
            
            for(int k=0 ; k < sLength ; k++)
            {
                newString = inString.charAt(k) + newString;
            }
            
            if(inString.equals(newString))
            {
                out.printf("  yes           %-20s %-20s%n", inString, newString);
            }
            else
            {
                out.printf("  no            %-20s %-20s%n", inString, newString);
            }
            count+=1;
            inString = "";
            newString = "";
        }
        
        out.printf("end of program %d strings were processed", count);
        in.close();
        out.close();
    }
}