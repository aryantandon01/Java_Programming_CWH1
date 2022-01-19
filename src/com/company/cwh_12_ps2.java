package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;

public class cwh_12_ps2 {
    static void lcm(int a, int b){
        int x;
        int y;
        if(a > b){
            x = a;
            y = b;
        }
        else{
            x = b;
            y = a;
        }
        int lcm = 1;
        for(int i = 1; i <= y; i++){
            if((x * i) % y == 0){
                System.out.println(x * i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        // Implement your code here
        lcm(7, 5);
    }
}