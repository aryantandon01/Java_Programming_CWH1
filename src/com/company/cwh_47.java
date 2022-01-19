package com.company;

class A{
    int a = 10;
}

class B extends A{
    int a = 20;
    void show (int a)
    {
        System.out.println(a);
        System.out.println(this.a); // 'this' is a reference variable which refers to the object of this class
        System.out.println(super.a); // 'super is a reference variable which refers to the parent class
    }
}

public class cwh_47 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(30);
    }
}
