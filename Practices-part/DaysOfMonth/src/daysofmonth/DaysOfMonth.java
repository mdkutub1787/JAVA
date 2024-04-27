import java.util.Scanner;

public class daysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Prompt the user to enter the first three letters of a month name
        System.out.print("Enter the first three letters of a month name (e.g., Jan): ");
        String monthInput = scanner.next().toUpperCase();
        int daysInMonth = 0;

        // Determine the number of days in the entered month
        switch (monthInput) {
            case "JAN":
            case "MAR":
            case "MAY":
            case "JUL":
            case "AUG":
            case "OCT":
            case "DEC":
                daysInMonth = 31;
                break;
            case "APR":
            case "JUN":
            case "SEP":
            case "NOV":
                daysInMonth = 30;
                break;
            case "FEB":
                // Check if it's a leap year
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    daysInMonth = 29;
                else
                    daysInMonth = 28;
                break;
            default:
                System.out.println("Invalid month input.");
                System.exit(0);
        }

        // Display the number of days in the entered month
        System.out.println("Number of days in " + monthInput + " " + year + " is: " + daysInMonth);
    }
}
