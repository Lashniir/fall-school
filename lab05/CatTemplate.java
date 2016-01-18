/**
 * Open keyboard input 
 * Prompt the user for the temperature
 * category(temp) = "hot",  if temp >= 90
 *              = "mild", if 75 <= temp < 90
 *              = "cool", if temp < 75
 * Print results to the terminal
 * Close keyboard input
 * 
 * @author (Schmidt) 
 * @version (1)
 */
import java.util.Scanner;
public class CatTemplate
{
    public static void main(String[] args) 
    {

        //declare variables
        String cat;     // temperature category
        int temp;       // temperature value
        Scanner in;     // used to read from keyboard

        //Open keyboard input
        in = new Scanner(System.in);

        //Prompt the user for the temperature
        System.out.print("Enter the temperature: ");
        temp = in.nextInt();

        //Calculate the category (complete this in class)
        if (temp >= 90)
        {cat = "hot";}
        else if (temp >= 75 && temp < 90)
        {cat = "mild";}
        else 
        {cat = "cool";}
        
        //Print results to terminal
        System.out.println("The category of the temperature is " + cat);

    }
}
