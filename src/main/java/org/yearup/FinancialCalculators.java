package org.yearup;

import java.util.Scanner;

public class FinancialCalculators
{
    // Initialize scanner
    static Scanner scanner = new Scanner(System.in);

    public static void getMortgage()
    {
        // Variables
        double principal;
        double interestRate;
        int loanLength;

        // Query user & assign variables
        System.out.print("Enter your amount: ");
        principal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter your interest rate: ");
        interestRate = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter number of years: ");
        loanLength = scanner.nextInt();
        scanner.nextLine();

        System.out.println(principal + " " + interestRate + " " + loanLength);
    }

    public static void main(String[] args)
    {
        getMortgage();
    }
}
