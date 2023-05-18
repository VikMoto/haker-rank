package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usFormat =  NumberFormat.getCurrencyInstance( Locale.US);
        Locale indialoc = new Locale("en", "IN");
        NumberFormat inFormat =  NumberFormat.getCurrencyInstance(indialoc);
        NumberFormat chinaFormat =  NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat =  NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = usFormat.format(payment);
        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
    }
}
