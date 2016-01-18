
import java.util.*;
import java.io.*;

public class ArraCalc {
    static final int DATA_SIZE = 11;

    public static void main(String[] args) 
    throws FileNotFoundException
    {
        int k = 0, max = 0, min = 0;
        double avg = 0;

        int[] data = new int[DATA_SIZE];

        Scanner input = new Scanner(new File("data.txt"));

        while (input.hasNext() && k<DATA_SIZE)
        {
            data[k] = input.nextInt();
            k++;
        }
        //print lab headings including your name 
        System.out.printf("****************************************************%n");
        System.out.printf("Lab 12   Fall 2015      Alexander Foiles%n");
        System.out.printf("****************************************************%n%n");
        System.out.println("\n------------- Data Values ----------------------");
        print(data);
        avg = average(data);
        max = max(data);
        min = min(data);
        
        System.out.println("\n------------- Summary Statistics ---------------");
        System.out.printf("Average data value is: %6.2f%n",avg);
        System.out.printf("Min data value is:  %6d%n",min);
        System.out.printf("Max data value is:  %6d%n",max);
    }

    private static double average(int data[])
    {
        int sum = 0;
        double average;
        
        for (int k=0;k<data.length;k++)
        {
            sum+=data[k];
        }
        average = (1.0 * sum)/data.length;
        return average;
    }

    private static int max(int[] data)
    {
        int max = data[0];
        for (int k=1;k<data.length;k++)
        {
            //max = Math.max(max,data[k]);
            
            if (data[k]>max)
            {
                max=data[k];
            }
        }
        return max;
    }

    public static int min(int[] data)
    {
        int min = data[0];
        for (int k=1;k<data.length;k++)
        {
            if (data[k]<min)
            {
                min=data[k];
            }
        }
        return min;
    }
    
    public static void print(int[] data)
    {
        for (int k=0;k<data.length;k++)
        {
            System.out.printf("%4d", data[k]);
            if ((k+1)%5==0)
            {
                System.out.printf("%n");
            }
        }
        System.out.printf("%n");
    }
}