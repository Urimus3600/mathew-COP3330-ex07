/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final double ft2_m2Ratio = 0.09290304;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        double lngth = input.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        double wdth = input.nextDouble();

        System.out.print("You entered the dimensions of " + lngth +
                " feet by " + wdth + " feet.\n");
        double areaf2 = lngth * wdth;
        double aream2 = areaf2 * ft2_m2Ratio;
        System.out.print("The area is\n" + areaf2 + " square feet\n" + aream2 + " square meters");
    }
}
