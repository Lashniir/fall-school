
/**
 * Method to print part of an array of Integers
 * (to screen)
 */
public class printArrayN
{
    public static void printArrayN(int a[],int num)
    {
        for(int k=0;k<num;k++)
        {
            System.out.printf("%4d",a[k]);
        }
        System.out.printf("\n");
    }
}
