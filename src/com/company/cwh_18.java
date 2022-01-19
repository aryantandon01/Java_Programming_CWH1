package com.company;
import java.util.Scanner;

public class cwh_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String house, colour;
        System.out.print("Enter colour name: ");
        colour = sc.nextLine();
        switch(colour){
            case "Yellow":
                System.out.println("Amaltas");
                break;
            case "Pink":
                System.out.println("Kachnar");
                break;
            case "Red":
                System.out.println("Gulmohar");
                break;
            case "Orange":
                System.out.println("Palash");
                break;
            default:
                System.out.println("N/A");
        }
        }
}
