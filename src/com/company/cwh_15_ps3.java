package com.company;
import java.util.Locale;
import java.util.Scanner;

public class cwh_15_ps3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the string here: ");
//        String str = sc.nextLine();
//
//        str = str.toLowerCase();
//        System.out.println(str);
//
//        System.out.println(str.replace(" ", "_"));
//
//        String letter = "Dear |<name>|, thanks a lot!";
//        System.out.print("Enter name of recipient: ");
//        String name = sc.nextLine();
//        System.out.println(letter.replace("|<name>|", name));

        String myStr = "This string  contains   double and triple spacing.";
        System.out.println(myStr.indexOf("  "));
        System.out.println(myStr.indexOf("   "));

    }
}
