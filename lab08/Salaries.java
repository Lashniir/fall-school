
/**
 * Write a description of class Salaries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.*;

public class Salaries
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        Scanner in;
        File salaries;
        double salary, maxSalary = 0;
        String name, maxName="";
        String salariesRec;
        
        salaries = new File("salaries.txt");
        in = new Scanner(salaries);
        
        System.out.printf("Lab 08, Written by Alexander Foiles%n%n");
        System.out.printf("%-30s%-10s%n", "Employee Name", "Salary");
        System.out.printf("%-30s%-10s%n", "-------------", "------");
        
        while (in.hasNext())
        {
            salariesRec = in.nextLine();
            
            name = salariesRec.substring(0,24);
            name = name.trim();
            
            String tempSalary = salariesRec.substring(24);
            tempSalary = tempSalary.trim();
            salary = Double.parseDouble(tempSalary);
            
            System.out.printf("%-30s%-10.2f%n", name, salary);
            
            if (maxSalary < salary)
            {
                maxSalary = salary;
                maxName = name;
            }
        }
        
        System.out.printf("%nEmployee: %s has the largest salary: %.2f%n%n",
            maxName, maxSalary);
        System.out.println("End of Program.");
        
        in.close();
    }
}
