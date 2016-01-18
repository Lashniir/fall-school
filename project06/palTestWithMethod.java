/**
 * Write a program that prompts the user to enter a string and displays
 * the string in reverse order, then test the new string for equality with
 * the input string to determine if it is a palindrome.
 * 
 * @author Alexander Foiles 
 * @version Project 06 Due 10/30/2015
 */
import java.io.*;
import java.util.Scanner;
public class palTestWithMethod
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        String inString = "";
        String newString = "";
        int count = 0;
        Scanner in = new Scanner(new File("data6.txt"));
        PrintWriter out = new PrintWriter(new File("project06Results.txt"));
        
        out.printf("Project 06 by Alexander Foiles, Due 10/30/2015 by 12pm%n");
        out.printf("%-15s %-20s %-20s%n", "Palindrome", "Input String", "New String");
        
        while(in.hasNext())
        {
            inString = in.nextLine();
            
            inString = inString.trim();
            
            newString = palTestWithMethod.stringRev(inString);
            
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
    
    
    
    
    
    
    
    // Project 06 by Alexander Foiles, Due 10/30/2015 by 12pm (page 2)
    
    public static String stringRev(String str)
    {
        String reverse = "";
        int sLength = str.length();
        
        for(int k=0 ; k<sLength ; k++)
        {
            reverse = str.charAt(k) + reverse;
        }
        return reverse;
    }
}