package com.company;

public class cwh_32 {

    static void change1(int a)
    {
        a = 98;
    }

    static void change2(int [] a)
    {
        a[0] = 98;
    }

//    This is Method Overloading, here the names of the methods are the same but the number of parameters are different.
    static void ArgPara(int x)
    {
        System.out.println("There are " + x + " students in our college.");
    }
    static void ArgPara(int x, int y)
    {
        System.out.println("There are " + x + " students in my college and " + y + " students in his college.");
    }

    public static void main(String[] args) {
//        Case 1
        int x = 39;
        change1(x);
        System.out.println(x);

//        Case 2
        int [] y = {23, 65, 34, 32, 53};
        change2(y);
        System.out.println(y[0]);

//        In the first case, the copy of the integer is sent to the method, so it doesn't change.
//        In the second case the address of the element is sent to the method, so it changes.

      ArgPara(3000, 4000); //x & y are the parameters and 3000 & 4000 are the arguments.
      ArgPara(10000);
    }
}
