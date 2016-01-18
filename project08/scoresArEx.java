/**
 * Write a program to read in a set of real scores(no more than 100 scores),
 *  calculate their mean, sort them, and find their median and mode.
 * 
 * Alexander Foiles
 * Project 8 due 11/24/15 by classtime
 */
import java.util.Scanner;
import java.io.*;
public class scoresArEx
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        double[] scores=new double[100];
        int count=0;
        double mean;
        double median;
        double mode;

        Scanner inF = new Scanner(new File("data8b.txt"));
        PrintWriter outF = new PrintWriter(new File("data8bOut.txt"));
        outF.printf("Fall 2015 Project 8 due 11/24/15 by Alexander Foiles%n%n");

        count=readArray(inF, scores);

        prntArray(outF, scores, count, 7);

        mean=meanArray(scores, count);
        outF.printf("There are %4d numbers in the array with a mean of %6.2f%n", count, mean);
        
        sort(scores, count);
        median=findMedian(scores, count);
        mode=findMode(scores, count);
        
        outF.printf("with a median of %9.3f and a mode of %9.2f%n%n", median, mode);
        outF.printf("        Sorted Values:%n");

        prntArray(outF, scores, count, 11);
        
        outF.printf("End of Project 8%n%n");
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

            
    //Project 8 due 11/24/15 by Alexander Foiles
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

    public static void sort(double a[], int num)
    {
        for (int k=0;k<num;k++)
        {
            for (int m=0;m<(num-1);m++)
            {
                if(a[m]<a[m+1])
                {
                    double temp = a[m];
                    a[m] = a[m+1];
                    a[m+1] = temp;
                }
            }
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Project 8 due 11/24/15 by Alexander Foiles
    public static double findMedian(double a[], int num)
    {
        int midLoc=0;
        double medVal=0;
        if (num%2==0)
        {
            midLoc = (num/2);
            medVal = a[midLoc-1]+((a[midLoc]-a[midLoc-1])/2);
        }
        else
        {
            midLoc = (num/2);
            medVal = a[midLoc];
        }
        return medVal;
    }

    public static double findMode(double a[], int num)
    {
        double modeFreq = 0;
		double mode = 0;
		double tempFreq;
		for (int k=0;k<num;k++)
		{
			tempFreq = 0;
			for (int m=k+1;m<num;m++)
			{
				if (a[k]==a[m])
				{
					tempFreq++;
				}
			}
			if (tempFreq > modeFreq)
			{
				modeFreq = tempFreq;
				mode = a[k];
			}
		}
		return mode;
    }
}