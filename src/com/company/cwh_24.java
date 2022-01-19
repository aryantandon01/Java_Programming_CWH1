package com.company;

public class cwh_24 {
    public static void main(String[] args) {
        // Break and continue

        for (int i = 0; i < 20; i+=2)
        {
            if (i%4==0)
            {
                System.out.println(i);
            }
            else
//                continue;
                break;
            // "break" will end the loop as soon as else condition is fulfilled while "continue" will continue to
        }
    }
}
