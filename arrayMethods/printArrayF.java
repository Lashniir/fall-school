
/**
 * Method to print part of an array of integers
 * (to file)
 */
import java.io.*;
public class printArrayF
{
    public static void printArrayF(PrintWriter outF,int a[],int num)
    {
        for(int k=0;k<num;k++)
        {
            outF.printf("%4d",a[k]);
            System.out.printf("%4d",a[k]);
        }
        outF.printf("\n");
        System.out.printf("\n");
    }
}
