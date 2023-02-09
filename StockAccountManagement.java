package com.day11_12;

import java.util.Scanner;

class Stock {
    private String name;
    private int shares;
    private double price;
    private double value;

    public Stock(String name, int shares, double price) {
        this.name = name;
        this.shares = shares;
        this.price = price;
        this.value = shares * price;
    }

    public String getName() {
        return name;
    }

    public int getShares() {
        return shares;
    }

    public double getPrice() {
        return price;
    }

    public double getValue() {
        return value;
    }
}

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of stocks: ");
        int numStocks = scanner.nextInt();

// CREATE AN ARRAY STORING ALL STOCK DATA IN THIS ARRAY
        Stock[] stocks = new Stock[numStocks];

        double totalValue = 0.0;

        for (int i = 0; i < numStocks; i++) {
            System.out.print("Enter stock name: ");
            String name = scanner.next();

            System.out.print("Enter number of shares: ");
            int shares = scanner.nextInt();

            System.out.print("Enter share price: ");
            double price = scanner.nextDouble();
// Create a new Stock object using the name, shares, and price variables
            Stock stock = new Stock(name, shares, price);

// Here, the stocks array can only store objects of type Stock.
// This makes arrays homogeneous, as all elements in the array
// have the same type.
            stocks[i] = stock;

            totalValue += stock.getValue();
        }

        System.out.println("Stock Report:");
        System.out.println("Name\tShares\tPrice\tValue");
        System.out.println("---------------------------------------------------");
        for (Stock stock : stocks) {
            System.out.println(stock.getName() + "\t" + stock.getShares() + "\t$" + stock.getPrice() + "\t$" + stock.getValue());
        }

        System.out.println("\nTotal Value: $" + totalValue);
    }
}
