/**
 * Method to count values greater than average of an array of integers
 */
public class countAvg
{
    public static int countAvg(double avg,int a[], int num)
    {
        int ctr=0;
        for(int k=0;k<num;k++)
            if(a[k]>avg)
                ctr++;
        return ctr;
    }
}
