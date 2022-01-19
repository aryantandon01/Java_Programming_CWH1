package com.company;
import java.util.Scanner;

class Krish
{
    static char c = 70;
    public static void main (String[]args)
    {
        Krish krish = new Krish ();
        System.out.print(c + " ");
        krish(c);
        System.out.println (c);
    }
    static void krish (char c)
    {
        int cr = c;
        cr = cr * 2;
        cr = cr + c - 20;
        c = (char) cr;

    }
}