package calculator;
import java.util.*;

public class CdCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);

        double principal = readDouble("Please enter the principal amount:");
        double annualRate = readDouble("Please enter the annual interest rate:");
        int loanTermYears = readInt("Please enter the loan term in years:");


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
        }
        principal * (i * (1 + i)^n / ((1 + annualRate)^n) - 1) );

        double totalInterest =




    }
}
