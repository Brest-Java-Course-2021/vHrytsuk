package com.epambrest;

public class Main {
    public static void main(String[] args) {
        // Distance
        // Price per km
        // Weight
        // Price per kg
        // Result = d * pr1 + w * pr2

        double distance = -10;
        double price1 = 20.05;
        double weight = 30;
        double price2 = 30.5;

        double result = distance * price1 + weight * price2;

        System.out.println("Result: " + result);
    }
}
