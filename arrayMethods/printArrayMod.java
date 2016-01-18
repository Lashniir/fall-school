
/**
 * Print partial array with modulus
 */
import java.io.*;
public class printArrayMod
{
    public static void printArrayL(int a[],int num, int mod)
    {
        for(int k=0;k<num;k++)
        {
            System.out.printf("%4d",a[k]);
            if((k+1)%mod == 0)
            {
                System.out.printf("\n");
            }
        }
        System.out.printf("\n");
    }
}
