/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

public class currency {
    public double toUSD(double euro, double rate) {
        return euro * rate;
    }

    public double toEuro(double usd, double rate) {
        return usd * rate;
    }
}
