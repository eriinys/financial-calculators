package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which calculator would you like to use?:\n" +
                "1 = Mortgage Calculator\n" +
                "2 = CD Calculator");
        int choice = input.nextInt();

        if (choice == 1) {
            MortgageCalculator.run(input);
        } else if (choice == 2) {
            CdCalculator.run(input);
        }

        input.close();
    }
}
