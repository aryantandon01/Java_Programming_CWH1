package com.company;

class X{
    public void meth1()
    {
        System.out.println("Meth 1-X");
    }
    public void meth2()
    {
        System.out.println("Meth 2-X");
    }
}

class Y extends X{
    public void meth2()
    {
        System.out.println("Meth 2-Y");
    }
    public void meth3()
    {
        System.out.println("Meth 3-Y");
    }
}

public class cwh_48 {
    public static void main(String[] args) {
        X obj1 = new X();
        Y obj2 = new Y();

        obj1.meth2();
        obj2.meth2();
        //Although the method names are same, they can have difference functions w.r.t a particular class.
        //This is method overriding.
    }
}
