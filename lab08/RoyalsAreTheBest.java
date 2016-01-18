
/**
 * Write a description of class RoyalsAreTheBest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;

public class RoyalsAreTheBest
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        Scanner in;
        File standings;
        String name;
        String maxName = "";
        String standingsRec;
        int wins, losses;
        double maxWinPct = 0;
        double maxWins = 0;
        
        standings = new File("standings.txt");
        in = new Scanner(standings);
        
        System.out.printf("Lab 08, Written by Alexander Foiles%n%n");
        System.out.printf("%-12s%-4s%-4s%n", "Team", "W", "L");
        System.out.printf("%-12s%-4s%-4s%n", "----------", "---", "---");
        
        while (in.hasNext())
        {
            standingsRec = in.nextLine();
            
            name = standingsRec.substring(0,11);
            name = name.trim();
            
            String tempWins = standingsRec.substring(11,14);
            tempWins = tempWins.trim();
            wins = Integer.parseInt(tempWins);
            
            String tempLosses = standingsRec.substring(14);
            tempLosses = tempLosses.trim();
            losses = Integer.parseInt(tempLosses);
            
            System.out.printf("%-12s%-4d%-4d%n", name, wins, losses);
            
            if (maxWins < wins)
            {
                maxWins = wins;
                maxName = name;
                maxWinPct = (1.0*wins)/(wins+losses);
            }
        }
        
        System.out.println("---------------------------------------------------------");
        System.out.printf("%s has the most wins with a winning pct of %.3f%n", maxName, maxWinPct);
        System.out.println("---------------------------------------------------------");
        System.out.println("End of Program.");
        
        in.close();
    }
}
