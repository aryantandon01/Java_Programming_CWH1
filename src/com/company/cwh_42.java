package com.company;

class Empl
{
    String name;
    int id;
    public Empl(String str, int x)
    {
        this.name = str;
        this.id = x;
    }
    public Empl(int n)
    {
        id = n+1;
    }
    public Empl()
    {

    }
}

public class cwh_42 {
    public static void main(String[] args) {
        Empl a = new Empl("Rocky", 132);
        System.out.println(a.name);
        System.out.println(a.id);
        Empl b = new Empl(21);
        System.out.println(b.id);
    }
}
