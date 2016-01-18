/**
 * Write a program to read in a set of real scores(no more than 150 scores) 
 *      and count the scores, print the scores out 6 per line, calculate the
 *      mean (average) of the numbers, then print the count and the mean, 
 *      then print the scores out 9 per line
 * 
 * @author Alexander Foiles 
 * @version Project 07 due 11/17/2015 at classtime
 */
import java.util.Scanner;
import java.io.*;
public class scoresArray
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        double[] scores=new double[150];
        int count=0;
        double mean;
        
        Scanner inF = new Scanner(new File("data7.txt"));
        PrintWriter outF = new PrintWriter(new File("data7Out.txt"));
        outF.printf("Project 7 due 11/17/15 by Alexander Foiles%n%n");
        
        count=readArray(inF, scores);
        
        prntArray(outF, scores, count, 6);
        
        mean=meanArray(scores, count);
        
        outF.printf("There are %4d numbers in the array%n", count);
        outF.printf("with a mean of %6.2f%n%n", mean);
        
        prntArray(outF, scores, count, 9);
        
        outF.printf("End of Project 7%n%n");
        inF.close();
        outF.close();
    }

    public static int readArray(Scanner inF,double a[])
    {
        int k;      
        for(k=0;(inF.hasNext())&&(k<a.length);k++ )
        {
            a[k]=inF.nextDouble();
        }
        return k;
    }

    
    
    
    
    
    
    //Project 7 due 11/17/15 by Alexander Foiles
    public static void prntArray(PrintWriter fl,double a[],int num,int ls)
    {
        for(int k=0;k<num;k++)
        {
            fl.printf("%7.2f",a[k]);
            if((k+1)%ls == 0)
            {
                fl.printf("%n");
            }
        }
        fl.printf("%n%n");
    }

    public static double meanArray(double a[], int num)
    {
        double sum = 0;
        double average;
        
        for (int k=0;k<num;k++)
        {
            sum+=a[k];
        }
        average = sum/num;
        return average;
    }
}