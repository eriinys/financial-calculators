package calculator;
import  java.util.*;

public class Annuity {
    public static void run (Scanner myScanner) {

        int monthlyPay = readInt(myScanner, "Enter the monthly payment amount:");
        int years = readInt(myScanner, "Enter the years to pay out: ");
        double interestRate = readDouble(myScanner, "Enter the interest rate:");

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
