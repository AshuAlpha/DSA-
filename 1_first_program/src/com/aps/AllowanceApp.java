package com.aps;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;

public class AllowanceApp {
    private double totalAmount;
    private int numberOfDays;

    public AllowanceApp(double totalAmount, int numberOfDays) {
        this.totalAmount = totalAmount;
        this.numberOfDays = numberOfDays;
    }

    public void spendMoney(double amountSpent) {
        if (amountSpent <= totalAmount) {
            totalAmount -= amountSpent;
            System.out.println("You spent $" + amountSpent + ". You have $" + totalAmount + " left.");
            System.out.println("You can spend $" + (totalAmount / numberOfDays) + " per day for the remaining " + numberOfDays + " days.");
        } else {
            System.out.println("Insufficient funds. You have $" + totalAmount + " left.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the initial amount of money
        System.out.print("Enter the total amount of money: $");
        double totalAmount = scanner.nextDouble();

        // Ask the user for the number of days they want to spend the money
        System.out.print("Enter the number of days you want to spend the money: ");
        int numberOfDays = scanner.nextInt();

        AllowanceApp app = new AllowanceApp(totalAmount, numberOfDays);

        while (true) {
            System.out.print("Enter amount to spend (0 to quit): $");
            double amountSpent = scanner.nextDouble();

            if (amountSpent == 0) {
                System.out.println("Exiting...");
                break;
            }

            app.spendMoney(amountSpent);
        }

        scanner.close();
    }
}
