
/**
 * Method to read an array of Integers for whole array
 */
import java.util.Scanner;
import java.io.*;
public class readArray
{ public static void readArrayN(Scanner inF,int a[])
     {
       int v;
       for(int k=0;k<a.length;k++)
          {
             v=inF.nextInt();
             a[k] = v;
          }
     }
}
