/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Rielly Donnell
 */

/*
n = -(1/ex30) * log(1 + b/p * (1 - (1 + i)^ex30)) / log(1 + i)
where

n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
*/
package ex26.base;

import static java.lang.Math.*;

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(double balance, double apr, double payment) {
        double dailyRate = apr/365.0/100.0;
        return (int) ceil((-1.0/30.0) * Math.log(1.0 + (balance/payment * (1.0 - Math.pow(1.0 + dailyRate,30.0)))) / Math.log(1.0 + dailyRate));
    }
}
