package com.day11_12;

import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

//    CHECK WITHDRAWS MONEY (INSIDE THE BALANCE OR OUT OF THE BALANCE).
    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            System.out.println(" Balance = " + (balance -= amount));
        }
    }

    public static void main(String[] args) {
// CREATE CONSTRUCTOR AND PASS THE PARAMETER THAT IS A BALANCE.
        BankAccount account = new BankAccount(6999);
        Scanner sc = new Scanner(System.in);

// CALLING A METHOD THROUGH OBJECT AND PASSING A PARAMETER.
        System.out.println("Enter amount :");
        double amount = sc.nextInt();
        account.debit(amount);
    }
}
