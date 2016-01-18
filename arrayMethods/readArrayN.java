
/**
 * Method to read an array of Integers
 */
import java.util.Scanner;
import java.io.*;
public class readArrayN
{
    public static void readArrayN(Scanner inF,int a[],int num)
    {
        int v;
        for(int k=0;k<num;k++)
        {
            v=inF.nextInt();
            a[k] = v;
        }
    }
}
