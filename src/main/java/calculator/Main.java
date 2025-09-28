package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Which calculator would you like to use?:\n" +
                "1 = Mortgage Calculator\n" +
                "2 = CD Calculator");
        int choice = myScanner.nextInt();

        if (choice == 1) {
            MortgageCalculator.run(myScanner);
        } else if (choice == 2) {
            CdCalculator.run(myScanner);
        }

        myScanner.close();
    }
}
