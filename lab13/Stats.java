import java.util.*;
import java.io.*;
 
public class Stats 
{
    static final int DATA_SIZE = 100;
    
    public static void main(String[] args) 
            throws FileNotFoundException
    {
 
        int k = 0, max = 0, min = 0, above = 0, below = 0;
        double avg = 0, dev = 0;
        
        int[] data = new int[DATA_SIZE];
        
        Scanner input = new Scanner(new File("data.txt"));
        
        //load the data array
        while (input.hasNext() && k<DATA_SIZE)
        {
            data[k] = input.nextInt();
            k++;
        }
        
        //todo: print banner
        System.out.printf("****************************************************%n");
        System.out.printf("Lab 13   Fall 2015       Alexander Foiles%n");
        System.out.printf("****************************************************%n");
        
        //System.out.println("\n------------- Data Values ----------------------");
        //TODO: as you get the methods working uncomment the calls
        //      as necessary
        avg = average(data,k);
        dev = deviation(data,avg,k);
        max = max(data,k);
        min = min(data,k);
        above = countAbove(data,avg,k);
        below = k - above;
        System.out.println("------------- Summary Statistics ---------------");
        System.out.printf("Average data value is:      %6.2f%n",avg);
        System.out.printf("The standard deviation is:  %6.2f%n",dev);
        System.out.printf("Min data value is:          %6d%n",min);
        System.out.printf("Max data value is:          %6d%n",max);
        System.out.printf("Count above avg is:         %6d%n",above);
        System.out.printf("Count below avg is:         %6d%n",below);
               
         
    }
    
    private static double average(int[] data, int cnt)
    {
        int sum=0;
        for (int k=0;k<cnt;k++)
        {
            sum+=data[k];
        }
        return sum*(1.0/cnt);
    }
    
    private static int max(int[] data, int cnt)
    {
        int max = data[0];
        for (int k=1;k<cnt;k++)
        {
            //max = Math.max(max,data[k]);
            
            if (data[k]>max)
            {
                max=data[k];
            }
        }
        return max;
    }
    
    public static int min(int[] data, int cnt)
    {
        int min = data[0];
        for (int k=0; k<cnt; k++)
        {
            if (data[k]<min)
            {
                min=data[k];
            }
        }
        return min;
    }

    public static int countAbove(int[] data, double mean, int cnt)
    {
        int cntAbove=0;
        for (int k=0;k<cnt;k++)
        {
            if (data[k]>mean)
            {
                cntAbove++;
            }
        }
        return cntAbove;
    }
    
    public static double deviation(int[] data, double avg, int cnt)
    {
        double sum=0;
        int k=0;
        
        while (k<cnt)
        {
            sum=sum+Math.pow(data[k]-avg,2);
            k++;
        }
        return Math.sqrt(sum/(cnt-1));
    }
}
