package com.company;

public class cwh_33 {
    //Varargs : Helps to add as many arguments as we want
    static int add (int ...arr)
    {
        int sum = 0;
        for (int a: arr)
        {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3, 4, 5, 6));
    }
}
