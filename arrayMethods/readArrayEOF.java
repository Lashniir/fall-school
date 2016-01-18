
/**
 * Java Look Ahead EOF partial fill
 */
import java.util.Scanner;
import java.io.*;
public class readArrayEOF
{
    public static int readArray(Scanner inF,int a[],int max)
    {
        int k;      
        for(k=0;(inF.hasNext()) &&(k<max); k++ )
        {
            a[k] = inF.nextInt();
        }
        return k;
    }
}
