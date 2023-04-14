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
        double annualIR;
        double monthlyIR;
        int loanLength;
        double monthlyPayment;
        double numPayments;
        double totalInterest;

        // Query user & assign variables
        System.out.print("Enter loan amount: ");
        principal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter annual interest rate: ");
        annualIR = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter number of years: ");
        loanLength = scanner.nextInt();
        scanner.nextLine();

        // Calculate
        numPayments = loanLength * 12;
        monthlyIR = annualIR / 1200;
        monthlyPayment = principal * (monthlyIR * Math.pow(1 + monthlyIR, numPayments)) / (Math.pow(1 + monthlyIR, numPayments) - 1);
        totalInterest = (monthlyPayment * numPayments) - principal;

        System.out.printf("Monthly payment: %.2f$\n", monthlyPayment);
        System.out.printf("Total interest paid: %.2f$\n",  totalInterest);
    }

    public static void main(String[] args)
    {
        getMortgage();
    }
}
