/**
 * Write a description of class Grade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;
public class Grade
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        double score, avg;
        String grade = "";
        double totalScores = 0;
        int count = 0;
        
        Scanner in;
        in = new Scanner(new File("scores.txt"));
        
        System.out.printf("Lab 9, Alexander Foiles%n");
        System.out.printf("Score Grade%n");
        System.out.printf("----- -----%n");
        
        while (in.hasNext())
        {
            score = in.nextDouble();
            
            if(Grade.validScore(score))
            {
                grade = Grade.letterGrade(score);
                System.out.printf("%-6.0f%-6s%n", score, grade);
                totalScores += score;
                count += 1;
            }
            else
            {
                System.out.printf("%-6.0f%-6s%n", score, "Invalid Score");
            }
        }
        
        avg = totalScores/count;
        grade = Grade.letterGrade(avg);
        System.out.printf("Average: %5.2f, Letter Grade: %s%n", avg, grade);
        System.out.printf("End of Program%n");
        
        in.close();
    }
    public static String letterGrade(double score)
    {
        String grade = "";
        
        if (90<=score && score<=100)
        {
            grade = "A";
        }
        else if (80<=score && score<=89)
        {
            grade = "B";
        }
        else if (70<=score && score<=79)
        {
            grade = "C";
        }
        else if (60<=score && score<=69)
        {
            grade = "D";
        }
        else if (0<=score && score<=59)
        {
            grade = "F";
        }
        else
        {
            grade = "error";
        }
        return grade;
    }
    public static boolean validScore(double score)
    {
        boolean valid = false;
        if (0<=score && score<=100)
        {
            valid = true;
        }
        return valid;
    }
}
