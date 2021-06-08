package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i = 2; i < 9; i++){
            System.out.println("Interest for amount 10000 and interest rate " + i + "% is " +String.format("%.2f",calculateInterest(10000,i)) );
        }

        System.out.println("*************************");

        for(int i = 8; i > 1; i--){
            System.out.println("Interest for amount 10000 and interest rate " + i + "% is " +String.format("%.2f",calculateInterest(10000,i)) );
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }
}
