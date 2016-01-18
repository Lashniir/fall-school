/**
 * Method to print the whole array of integers
 * (to file)
 */
import java.io.*;
public class printArrayFAll
{
    public static void printArrayFAll(PrintWriter outF,int a[])
    {
        for(int k=0;k<a.length;k++)
        {
            outF.printf("%4d",a[k]);
            System.out.printf("%4d",a[k]);
        }
        outF.printf("\n");
        System.out.printf("\n");
    }
}
