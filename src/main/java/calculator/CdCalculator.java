package calculator;
import java.util.*;

public class CdCalculator {
    public static void run(Scanner myScanner) {

        int principal = readInt(myScanner,"Please enter the deposit amount:");
        double interestRate = readDouble(myScanner,"Please enter the interest rate:");
        int years = readInt(myScanner, "Please enter the number of years:");

        double r = interestRate / 100.00;
        double numDays = 365 * years;

        double pow = Math.pow((1 + (r / 365)), (365 * years));

        double FV = principal * pow;
        double  totalInterest = FV - principal;

        System.out.printf("You deposited %.2f in a CD that earns %.2f% interest and matures in %d years.%n" +
                "Your CD's ending balance will be $%.2f and you would have earned $%.2f in interest.", principal, interestRate, years,FV, totalInterest);

    }

    public static int readInt (Scanner in, String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }

    public static double readDouble(Scanner in, String prompt){
        System.out.println(prompt);
        return in.nextDouble();

    }

}