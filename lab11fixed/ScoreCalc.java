/* 
 *  Lab 11, 11/04/2015
 *  Alexander Foiles
 */
import java.util.*;
import java.io.*;
public class ScoreCalc
{
    static final double MAX_TOTAL = 81;
    public static void main(String[] args)
    throws Exception
    {
        Scanner in = new Scanner(new File("data.txt"));
        System.out.printf("************************************************%n");
        System.out.printf("Lab 11 Fall 2015       Alexander Foiles         %n");
        System.out.printf("************************************************%n%n");
        System.out.println("Student#     Scores                Avg     Grade");
        double avg = 0;
        int studentCount = 0;
        double minAvg = 100;
        double maxAvg = 0;
        while (in.hasNext())
        {
            String scoresRec = in.next();
            studentCount=studentCount + 1;
            System.out.printf("%d            ",studentCount);
            printScores(scoresRec);
            avg = avgScores(scoresRec);
            String grade = calcLetterGrade(avg);
            if (minAvg>avg)
            {
                minAvg = avg;
            }
            if (maxAvg<avg)
            {
                maxAvg = avg;
            }
            System.out.printf("    %5.2f   %s%n", avg, grade);
        }
        System.out.printf("%n------------- Summary Statistics ---------------%n");
        System.out.printf("Total Number of Students: %d%n", studentCount);
        System.out.printf("Max Average is: %5.2f%n", maxAvg);
        System.out.printf("Min Average is: %5.2f%n", minAvg);
        System.out.println("\nEnd of Program");
    }
    
    static void printScores(String scores)
    {
        for (int i=0; i<scores.length(); i++)
        {
            String score_string = scores.charAt(i) + "";
            int score = Integer.parseInt(score_string);
            System.out.printf("%d ",score);
        }
    }
    
    static double avgScores(String scores)
    {
        double sum = 0;
        for (int i=0; i<scores.length(); i++)
        {
            String temp = scores.charAt(i) + "";
            
            int score = Integer.parseInt(temp);
            
            sum = sum + score;
        }
        return sum / MAX_TOTAL * 100;
    }
    
    static String calcLetterGrade(double score)
    {
        String letGrad = "";
        
        if (score>=90)
        {
            letGrad = "A";
        }
        else if (score<90 && score>=80)
        {
            letGrad = "B";
        }
        else if (score<80 && score>=70)
        {
            letGrad = "C";
        }
        else if (score<70 && score>=60)
        {
            letGrad = "D";
        }
        else
        {
            letGrad = "F";
        }
        return letGrad;
    }   
}