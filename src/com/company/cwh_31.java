package com.company;
import java.util.*;

import java.util.Scanner;
public class cwh_31 {
//    void diff(int x, int y)
    static void diff(int x, int y)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        y = sc.nextInt();
        int z;

        if (x > y)
        {
            z = x - y;
        }
        else
        {
            z = y - x;
        }
        System.out.println("The difference is "+ z +".");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        int max = Integer.MAX_VALUE;

//        cwh_31 obj = new cwh_31();
//        obj.diff(x, y);       --> These 2 lines are written when we write void diff() instead of static void diff().
        diff(x, y);

        int ans;

        for (int i = 0; i < max; i++)
        {
            System.out.println("Do you want to find the difference between two more numbers? Type 1 if your answer is yes, and 0 if it is no.");
            ans = sc.nextInt();

            if (ans == 1)
            {
                diff(x, y);
            }
            else if (ans == 0)
            {
                break;
            }
            else
            {
                System.out.println("Type 1 or 0.");
                continue;
            }
        }
    }
}
