package com.company;

abstract class Parent{
    Parent(){
        System.out.println("Parent Class");
    }
    void hello(){
        System.out.println("Hello");
    }
    abstract void greet();
}
class Child extends Parent{
    void greet(){
        System.out.println("Wassup");
    }
}
abstract class Child2 extends Parent{
    void good(){
        System.out.println("I'm good");
    }
}
public class cwh_52 {
    public static void main(String[] args) {
        Child c = new Child();
//        Parent p = new Parent();    ---> Error
        Parent p = new Parent() {
            @Override
            void greet() {
                System.out.println("Good morning");
            }
        };
        p.greet();
        c.greet();
//        Child2 c2 = new Child2();    -----> Error
    }
}
