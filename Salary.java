// Salary.java
// Calculates and displays the weekly salary for an employee // who earns time and one-half
// (wage * 1.5) for overtime hours worked.
import java.util.Scanner;
class Salary
{
    public static void main(String[] args)
    {
        double hourly; 
        double regHrs; 
        double overtimeHrs;
        final double OTRATE = 1.5;
        double weekly;
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a hourly pay rate ");
        hourly = input.nextDouble();
        System.out.print("Enter regular hours ");
        regHrs = input.nextDouble();
        System.out.print("Enter overtime hours ");
        overtimeHrs = input.nextDouble();
        weekly = calculate(hourly, regHrs, overtimeHrs, OTRATE); 
        System.out.println("An employee who makes $" + hourly); 
        System.out.println("	and works " + regHrs +
        " regular hours " + overtimeHrs + " overtime hours"); 
        System.out.println("	earns $" + weekly + " in a week");
}
public static double calculate(double hourly,
    double regHrs, double otHrs, double rate)
    {
        double result;
        result = (hourly * regHrs)+ (hourly * otHrs * rate); 
        return result;
    }
}