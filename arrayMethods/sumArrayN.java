
/**
 * Method to sum array of integers
 */
public class sumArrayN
{
    public static int sumArray(int a[], int num)
    {
        int sum=0;
        for(int k=0;k<num;k++)
            sum+=a[k];
        return sum;
    }
}
