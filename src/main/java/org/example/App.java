/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double principal, rate, time, total;
        String text;
        System.out.print("Enter the principal: ");
        text = input.nextLine();
        principal = Double.parseDouble(text);

        System.out.print("Enter the rate of interest: ");
        text = input.nextLine();
        rate = Double.parseDouble(text);

        System.out.print("Enter the number of years: ");
        text = input.nextLine();
        time = Double.parseDouble(text);

        total = (1 + ((rate/100)* time)) * principal;
        //System.out.printf("%.2f", total);
        System.out.printf("After %.0f years at %.1f%%, the investment will be worth $%.2f", time, rate, total);

    }
}
