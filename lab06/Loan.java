/**
 * Calculate the payment for a loan given the present value of the loan, 
 * the rate per period, and the number of periods
 *
 * @author Alexander Foiles 
 * @version Lab06 section2 09/23/2015
 */
import java.util.Scanner;
public class Loan
{
    public static void main(String[] args)
    {
        double p, pv, r, n;
        double numer, denom;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Present Value (PV): ");
        pv = input.nextDouble();
        System.out.print("Enter the Rate per Period (r): ");
        r = input.nextDouble();
        System.out.print("Enter the Number of Periods (n): ");
        n = input.nextDouble();
        
        r = r/100/12;
        numer = r * pv;
        denom = 1 - Math.pow((1+r),-n);
        p = numer / denom;
                
        System.out.printf("Your payment (P) is: %.2f\n", p);
        
        input.close();
    }
}
