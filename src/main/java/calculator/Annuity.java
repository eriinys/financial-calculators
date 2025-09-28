package calculator;
import  java.util.*;

public class Annuity {
    public static void run (Scanner myScanner) {

        int monthlyPay = readInt(myScanner, "Enter the desired monthly payout amount:");
        int years = readInt(myScanner, "Enter the desired years of payout: ");
        double annualInterest = readDouble(myScanner, "Enter the expected interest rate:");

        int months = years * 12;
        double monthlyInterest = (annualInterest / 100) / 12;
        double presentValue;
        if (monthlyInterest == 0) {
            presentValue = monthlyPay * months;
        } else {
            presentValue = monthlyPay * (1 - Math.pow(1 + monthlyInterest, -months)) / monthlyInterest;
        }

        //output
        System.out.printf("Monthly payout: $%d%n" +
                "Duration: %d years%n" +
                "Expected interest rate: %.2f%%%n" +
                "Required investment amount today: $%.2f%n ", monthlyPay, years, annualInterest, presentValue);

    }

    public static int readInt(Scanner in, String prompt) {
        System.out.println(prompt);
        return  in.nextInt();
    }
    public static double readDouble(Scanner in, String prompt) {
        System.out.println(prompt);
        return  in.nextDouble();
    }
}
