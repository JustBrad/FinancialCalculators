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

    public static void getFutureValue()
    {
        // Initial variables
        double deposit;
        double interestRate;
        double numYears;

        // Query user
        System.out.print("Enter deposit amount: ");
        deposit = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter interest rate: ");
        interestRate = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter number of years: ");
        numYears = scanner.nextDouble();
        scanner.nextLine();

        double futureValue = deposit * Math.pow(1 + (interestRate / 100), numYears);
        double totalInterest = futureValue - deposit;

        System.out.printf("Future value: %.2f$\n", futureValue);
        System.out.printf("Total interest paid: %.2f$\n",  totalInterest);
    }

    public static void displayMenu()
    {
        String option;
        System.out.println("Pick an option:\n1 Mortgage Calculator\n2 Future Value");
        System.out.print("Enter 1 or 2: ");
        option = scanner.nextLine();

        if (option.equalsIgnoreCase("1"))
        {
            getMortgage();
        }
        else if (option.equalsIgnoreCase("2"))
        {
            getFutureValue();
        }
    }

    public static void main(String[] args)
    {
        displayMenu();
    }
}
