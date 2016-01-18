/**
 * Convert slide #9 from Ch07rjb.ppt to a program and run it.  Hand in the code and output.
 * Then modify it for 8 integers, run it again.  Hand in the code and output.
 * 
 * @author Alexander Foiles 
 * @version Homework 02 due 11/05/2015 before class
 */
import java.util.Scanner;
public class modAvgArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[]x=new int[8];
        int sum,ctr;
        double avg;
        
        System.out.printf("Homework 02 (part 2) by Alexander Foiles due 11/05/2015%n%n");
        System.out.printf("Enter eight numbers: ");
        for(int k=0 ; k<8 ; k++)
        {
            x[k] = input.nextInt();
        }       
        for(int k=0 ; k<8 ; k++)
        {
            System.out.printf("%5d", x[k]);
        }       
        System.out.printf("\n");
        sum=0;
        
        for(int k=0 ; k<8 ; k++)
        {
            sum= sum + x[k];
        }
        avg= sum/8.0;
        System.out.printf("\n sum is %3d and avg is %8.2f\n", sum, avg);
        ctr=0;
        
        for(int k=0 ; k<8 ; k++)
        {
            if(x[k] > avg)
            {
                ctr++;
            }
        }
        System.out.printf(" count greater than avg is %3d\n", ctr);
        System.out.printf("End of program%n");
        
    }
}
