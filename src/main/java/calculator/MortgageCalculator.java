package calculator;
import java.util.*;

public class MortgageCalculator {
    public static void run(Scanner myScanner) {

        double principal = readDouble(myScanner,"Please enter the principal amount:");
        double annualRate = readDouble(myScanner,"Please enter the annual interest rate (only number):");
        int loanTermYears = readInt(myScanner,"Please enter the loan term in years:");

        //n = number of monthly payments
        // r = annual interest rate
        // i = monthly interest rate
        int n = 12 * loanTermYears;
        double r = annualRate / 100;
        double i = r / 12;

        double  monthlyPayment;
        if (i == 0.00) {
            monthlyPayment = principal / n;
        } else {
            double pow = Math.pow(1 + i, n);
            monthlyPayment = principal * (i * pow) / (pow - 1);
        }

        double totalInterest = (monthlyPayment * n) - principal;

        //output
        System.out.printf("Expected monthly payment (minus insurance and tax) is: $%.2f%n", monthlyPayment);
        System.out.printf("Total interest you would pay off within %d years: $%.2f%n", loanTermYears, totalInterest);
    }

    //parameter

    public static double readDouble(Scanner in, String prompt) {
        System.out.println(prompt);
        return  in.nextDouble();
    }

    public static int readInt(Scanner in, String prompt) {
        System.out.println(prompt);
        int number = in.nextInt();
        return number;
    }
}

