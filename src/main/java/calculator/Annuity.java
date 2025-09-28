package calculator;
import  java.util.*;

public class Annuity {
    public static void run (Scanner myScanner) {

        int monthlyPay = readInt(myScanner, "Enter the desired monthly payout amount:");
        int years = readInt(myScanner, "Enter the desired years of payout: ");
        double interestRate = readDouble(myScanner, "Enter the expected interest rate:");

        double desiredPayTotal = monthlyPay * 12;
        double compoundDouble = 72 / interestRate;
        double presentValue = desiredPayTotal / compoundDouble;

        //output
        System.out.printf("To fund an annuity that pays $%d monthly for %d years and earns an expected %.2f%% interest, you would need to invest $%.2f today.", monthlyPay, years, interestRate, presentValue);

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
