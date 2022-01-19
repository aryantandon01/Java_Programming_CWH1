package com.company;

public class cwh_34 {
    static int fact(int x)
    {
        if (x == 0 || x == 1)
        {
            return 1;
        }
        else
        {
            return x * fact(x-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
