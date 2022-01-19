package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.*;

public class cwh_26 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String res;
//        String str = sc.nextLine();
//        String str2 = "ces";
//        if (str.equals("ces"))
//        {
//            res = "Yes";
//        }
//        else
//        {
//            res = "No";
//        }
//        System.out.println(res);
//    }
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp = 0;
        int[] arr = new int[y-x];
        for(int i = x; i < y; i++)
        {
            for(int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    temp += 1;
                }
            }
            for (int j = 0; j < y-x; j++)
            {
                if (temp == 4)
                {
                    arr[j] = i;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}