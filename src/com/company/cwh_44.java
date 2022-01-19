package com.company;
import java.util.Scanner;

class cylinder
{
    public int r, h;
    Scanner sc = new Scanner(System.in);
    public cylinder(int x, int y)
    {
        r = x;
        h = y;
    }
    /*public void setRadius()
    {
        System.out.print("Enter the radius: ");
        r = sc.nextInt();
    }
    public int getRadius()
    {
        return r;
    }
    public void setHeight()
    {
        System.out.print("Enter the height: ");
        h = sc.nextInt();
    }
    public int getHeight()
    {
        return h;
    }*/
    public double surfaceArea()
    {
        return (2 * 3.14 * r * (h + r));
    }
    public double volume()
    {
        return (3.14*r*r*h);
    }
}

public class cwh_44 {
    public static void main(String[] args) {
        cylinder a = new cylinder(10,20);
        System.out.println(a.r);
//        a.setRadius();
//        a.setHeight();
//        System.out.println("The radius and height of the cylinder are " + a.getRadius() + "cm and " + a.getHeight() + "cm respectively.");
        System.out.println("The surface area and volume of the cylinder are " + (float)(a.surfaceArea()) + " sq. cm and " + (float)a.volume() + " cubic cm respectively.");
    }
}
