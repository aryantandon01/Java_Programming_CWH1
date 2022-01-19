package com.company;

class rectangle
{
    public int l, b;
    public rectangle()
    {
        l = 4;
        b = 5;
    }
    public rectangle(int x, int y)
    {
        l = x;
        b = y;
    }
    public int getLength()
    {
        return l;
    }
    public int getBreadth()
    {
        return b;
    }
}

public class cwh_44_part2 {
    public static void main(String[] args) {
        rectangle a = new rectangle(21,12);
        System.out.println(a.getLength());
        System.out.println(a.getBreadth());
    }
}
