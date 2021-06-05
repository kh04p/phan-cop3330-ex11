/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        currency currency = new currency();
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the currency you want to exchange to: ");
        String choice = input.nextLine().trim().toLowerCase();

        switch(choice) {
            case "usd": //converts to USD
                System.out.print("How many Euros are you exchanging? ");
                double euro = input.nextDouble();
                System.out.print("What is the exchange rate from Euro to US dollar? ");
                double rateEuro = input.nextDouble();
                double resultEuro = currency.toUSD(euro, rateEuro);
                System.out.printf("%.2f Euros at an exchange rate of %.4f is %.2f US dollars.", euro, rateEuro, resultEuro);
                break;
            case "euro": //converts to Euro
                System.out.println("How many US dollars are you exchanging? ");
                double usd = input.nextDouble();
                System.out.println("What is the exchange rate from US dollar to Euro? ");
                double rateUSD = input.nextDouble();
                double resultUSD = currency.toEuro(usd, rateUSD);
                System.out.printf("%.2f Euros at an exchange rate of %.4f is %.2f US dollars.", usd, rateUSD, resultUSD);
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }
}
