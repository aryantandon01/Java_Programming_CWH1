package com.company;

class Emp2
{
    String str, name;
    int sal;

    public void setSal(int x)
    {
        this.sal = x;
    }
    public int getSal()
    {
        return sal;
    }

    public void setName(String str)
    {
        this.name = str;
    }
    public String getName()
    {
        return name;
    }
}


class cellPhone
{
    public void vib()
    {
        System.out.println("Vibrating...");
    }
    public void ring()
    {
        System.out.println("Ringing...");
    }
}

class square
{
    int s;
    public void calc(int s)
    {
        System.out.println("Area: " + (s*s));
        System.out.println("Perimeter: " + (4*s));
    }
}

public class cwh_39 {
    public static void main(String[] args) {
        Emp2 a = new Emp2();
        a.setSal(20000);
        System.out.println(a.getSal());
        a.setName("Aryan");
        System.out.println(a.getName()+"\n");

        cellPhone apple = new cellPhone();
        apple.vib();
        apple.ring();
        System.out.println("");

        square sq = new square();
        sq.calc(4);
    }
}
