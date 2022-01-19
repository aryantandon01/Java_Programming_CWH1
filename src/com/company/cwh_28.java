package com.company;
import java.util.Scanner;

public class cwh_28 {
    public static void main(String[] args) {
        int [] [] room = new int [3] [3];
        room [0] [0] = 101;
        room [0] [1] = 102;
        room [0] [2] = 103;
        room [1] [0] = 201;
        room [1] [1] = 202;
        room [1] [2] = 203;

//        for (int i = 1; i >=  0; i--)
//        {
//            for (int j = 2; j >= 0; j--)
//            {
//                System.out.print(room[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
        for (int i = 1; i >=  0; i--)
        {
            for (int j = 2; j >= 0; j--)
            {
                System.out.print(room[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
