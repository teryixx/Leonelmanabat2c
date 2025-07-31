
package manabatleonel;
import java.util.Scanner;

public class Manabatleonel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
  
     System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter total hours worked this week: ");
        double hoursWorked = scanner.nextDouble();


        double grossPay = hourlyRate * hoursWorked;
        double sssContribution = grossPay * 0.10;  
        double netPay = grossPay - sssContribution;

 
        System.out.println("\n===== Wage Summary =====");
        System.out.println("Employee: " + name);
        System.out.printf("Hourly Rate: ₱%.2f\n", hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Gross Pay: ₱%.2f\n", grossPay);
        System.out.printf("SSS Contribution (10%%): ₱%.2f\n", sssContribution);
        
        System.out.printf("Net Weekly Wage: ₱%.2f\n", netPay);


    }
}
    }
    
}
