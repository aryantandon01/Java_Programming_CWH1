package com.company;
import java.util.Scanner;

public class cwh_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("You're allowed to drive.");
        }
        else {
            System.out.println("You're not allowed to drive.");
        }

    }
}
