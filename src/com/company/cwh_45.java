package com.company;

class base
{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void printMe()
    {
        System.out.println("Me");
    }
}



class Derived extends base { //Derived is inheriting properties from Base
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

public class cwh_45 {
    public static void main(String[] args) {
        Derived b = new Derived();
        b.setY(4);
        System.out.println(b.getY());
    }

}
