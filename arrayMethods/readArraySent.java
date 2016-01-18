/**
 * Method to partially fill an array of integers
 * Until out of Data
 */
import java.util.Scanner;
public class readArraySent
{
    public static int readArraySent(Scanner inF,int a[],int max)
    {
        int k=0;
        int v;
        v=inF.nextInt();
        while((v!=-999) &&(k<max))
        {
            a[k] = v;
            k++; 
            v=inF.nextInt();
        }
        return k;
    }
}
