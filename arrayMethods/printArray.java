
/**
 * Method to print the whole array of Integers
 * (to screen)
 */
public class printArray
{
    public static void printArray(int a[])
    {
        for(int k=0;k<a.length;k++)
        {
            System.out.printf("%4d",a[k]);
        }
        System.out.printf("\n");
    }
}
