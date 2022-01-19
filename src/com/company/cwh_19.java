package com.company;
import java.util.Scanner;

public class cwh_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year:");
        int year = sc.nextInt();

        if (year%400==0)
        {
            System.out.println("It's a leap year.");
        }
        else if (year%4==0 && year%100!=0)
        {
            System.out.println("It's a leap year.");
        }
        else
        {
            System.out.println("It's not a leap year.");
        }

    }
}
