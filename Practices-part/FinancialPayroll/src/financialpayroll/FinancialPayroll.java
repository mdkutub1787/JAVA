package financialpayroll;

import java.util.Scanner;

/**
 *
 * @author MD KUTUB UDDIN
 */
public class FinancialPayroll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read employee information
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter deductions (if any): ");
        double deductions = scanner.nextDouble();

        System.out.print("Enter bonuses (if any): ");
        double bonuses = scanner.nextDouble();

        // Calculate gross pay
        double grossPay = hourlyWage * hoursWorked;
        
        // Calculate net pay
        double netPay = grossPay - deductions + bonuses;

        // Print payroll statement
        System.out.println("\nPayroll Statement for " + name);
        System.out.println("==========================");
        System.out.println("Hourly Wage: " + hourlyWage);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonuses: " + bonuses);
        System.out.println("--------------------------");
        System.out.println("Net Pay: " + netPay);

        // Close scanner
        scanner.close();
    }
}
