package com.company;

interface SampleInterface{
    void meth1();
    void meth2();
}

interface SampleInterface2 extends SampleInterface{
    void meth3();
    void meth4();
}

class MyClass implements SampleInterface2{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}

public class cwh_58 {
    public static void main(String[] args) {
        MyClass x = new MyClass();
        x.meth1();
        x.meth4();
    }
}
