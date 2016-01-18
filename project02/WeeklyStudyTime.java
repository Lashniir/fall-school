
/**
 * Write a code to determine the expected study time for a student for 4 classes, given credit hours and difficulty
 * 
 * @author Alexander Foiles
 * @version Due Friday September 11, 2015 at midnight
 */
import java.util.Scanner;
public class WeeklyStudyTime
{
    public static void main(String[] args)
    {
        // Heading with project, due date, and name
        
        System.out.println("Project02 by Alexander Foiles, due 09/11/2015");
        
        // Define crHr, effort, stdyTm, weeklyStudy, and input
        
        int crHr1, crHr2, crHr3, crHr4;
        int effort1, effort2, effort3, effort4;     
        int stdyTm1, stdyTm2, stdyTm3, stdyTm4;
        int weeklyStudy;
        Scanner input;
        input = new Scanner(System.in);
        
        //Prompt for Inputs
        
        System.out.print("Enter the number of credit hours for class 1: ");
        crHr1 = input.nextInt();
        System.out.print("Enter the difficulty for class 1: ");
        effort1 = input.nextInt();
        
        System.out.print("Enter the number of credit hours for class 2: ");
        crHr2 = input.nextInt();
        System.out.print("Enter the difficulty for class 2: ");
        effort2 = input.nextInt();
                
        System.out.print("Enter the number of credit hours for class 3: ");
        crHr3 = input.nextInt();
        System.out.print("Enter the difficulty for class 3: ");
        effort3 = input.nextInt();
        
        System.out.print("Enter the number of credit hours for class 4: ");
        crHr4 = input.nextInt();        
        System.out.print("Enter the difficulty for class 4: ");
        effort4 = input.nextInt();
        
        //Calculate stdyTm and weeklyStudy
        
        stdyTm1 = crHr1 * effort1;
        stdyTm2 = crHr2 * effort2;
        stdyTm3 = crHr3 * effort3;
        stdyTm4 = crHr4 * effort4;
        
        weeklyStudy = stdyTm1 + stdyTm2 + stdyTm3 + stdyTm4;
        
        //Print
        System.out.println("         Average Weekly Study Time");
        System.out.println("Credit Hours    Effort Required   Study Time");
        System.out.printf("    %3d             %3d              %3d\r\n", crHr1, effort1, stdyTm1);
        System.out.printf("    %3d             %3d              %3d\r\n", crHr2, effort2, stdyTm2);
        System.out.printf("    %3d             %3d              %3d\r\n", crHr3, effort3, stdyTm3);
        System.out.printf("    %3d             %3d              %3d\r\n", crHr4, effort4, stdyTm4);
        System.out.printf("       Expected Weekly Study Time is %3d hours%n", weeklyStudy);
        System.out.println("End of Program");
        System.out.println(" ");
        System.out.println(" ");
        
        // Extra lines so that multiple runs are more easily distinguished
        
        input.close();
    }
}
