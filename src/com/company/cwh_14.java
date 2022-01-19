package com.company;
import java.util.Locale;
import java.util.Scanner;

public class cwh_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string whose length you want to check: ");
        String str = sc.nextLine();

//        //Length
//        int value  = str.length();
//        System.out.println("The length of the string i.e. '" + str + "' is "+ value + ".");
//
//        //Upper to Lower Case
//        String lstring = str.toLowerCase();
//        System.out.println("str in lower case: " + lstring);
//
//        //Lower to Upper Case
//        String ustring = str.toUpperCase();
//        System.out.println("str in upper case: " + ustring);
//
//        //Trimmed String
//        String trimstr = str.trim();
//        System.out.println(trimstr);

           //Substring
        System.out.println(str.substring(6)); //Including 6th index till the end
        System.out.println(str.substring(6,9)); //Including 6th index excluding the 9th index

        //Replacing characters
        System.out.println(str.replace("y","lmaooo"));

        //Whether string starts/ends with this or not
        System.out.println(str.startsWith("Ar"));
        System.out.println(str.endsWith("Ar"));

        //Character at a particular index
        System.out.println(str.charAt(3));

        //Find index
        System.out.println(str.indexOf("ry"));
        System.out.println(str.indexOf("chintu")); //-1 indicates it's not there

        //Find index after a particular index
        System.out.println(str.indexOf("an", 4));

    }
}
