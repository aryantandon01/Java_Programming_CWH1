package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
//	int a = 6;
//	int b = ++a; // First a is incremented then b is assigned
//	    System.out.println(a); // a = 7 cos increment kar diya
//	    System.out.println(b); // b = 7 cos pre increment
//	int c = 34;
//	int d = c++; // First d is assigned then c is incremented
//        System.out.println(c); // c = 35 cos increment kar diya
//        System.out.println(d); // d = 34 cos post increment hi hua hai
//
//    char ch = 'a';
//        System.out.println(++ch);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--)
        {
            for (int j = i; j > 0; j--)
            {
                System.out.print("* ");
            }
            System.out.println("");

            for (int k = n+1; k > i; k--)
            {
                System.out.print(" ");
                if (k == n)
                {
                    continue;
                }
            }
        }
    }
}
