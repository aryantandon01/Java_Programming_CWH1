package com.company;

class Base1{
    Base1()
    {
        System.out.println("I'm a Base Constructor");
    }
}

class Derived1 extends Base1{
    Derived1()
    {
        System.out.println("I'm a Derived Constructor");
    }
    Derived1(int x)
    {
        System.out.println("I'm an overloaded constructor");
    }
}

class childOfDerived extends Derived1{
    childOfDerived()
    {
        System.out.println("I'm the Child of Derived");
    }
}

public class cwh_46 {
    public static void main(String[] args) {
        childOfDerived d = new childOfDerived();
//        d.Derived1();
//        d.Base1();
    }
}
