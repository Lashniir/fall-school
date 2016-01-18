
/**
 * Write a description of class InvestmentCalculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class InvestmentCalculator
{
    public static void main(String[] args)
    {
        double amt, rate, futureAmt;
        int years, count;
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Lab 10 by Alexander Foiles 10/28/2015%n%n");
        
        System.out.printf("Enter Amount> ");
        amt = in.nextDouble();
        
        System.out.printf("Enter Annual Percentage Rate> ");
        rate = in.nextDouble();
        
        System.out.printf("Enter Number of Years> ");
        years = in.nextInt();
        
        System.out.printf("The amount invested: %.2f%n", amt);
        System.out.printf("Annual percentage intrest rate: %.1f%n", rate);
        System.out.printf("Number of Years: %d%n", years);
        System.out.printf("Years       Future Value%n");
        
        count = 0;
        
        while (count < years)
        {
            count+=1;
            futureAmt = InvestmentCalculator.futureInvestmentValue(amt,rate,count);
            System.out.printf("%2d%21.2f%n", count, futureAmt);
        }
        System.out.printf("End of Program%n%n");
    }
    public static double futureInvestmentValue
        (double investmentAmount, double annualPctRate, int numberOfYears)
    {
        double monthlyPctRate = (annualPctRate/1200);
        double futureValue = investmentAmount * Math.pow((1 + monthlyPctRate),(numberOfYears * 12));
        return futureValue;
    }
}
