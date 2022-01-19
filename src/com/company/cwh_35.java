package com.company;

public class cwh_35 {
    static void table(int x)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d\n", x, i, (x*i));
        }
    }


    static void patt1(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for ( int j = n-i-1; j < n; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


    static int add(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            return n + add (n-1);
        }
    }


    static void patt2(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


    static int fibo(int n)
    {
        if (n == 1)
        {
            return 0;
        }
        else if (n == 2)
        {
            return 1;
        }
        else
        {
            return (fibo(n-1) + fibo(n-2));
        }
    }


    static int avg(int ...arr)
    {
        int sum = 0;
        for (int element: arr)
        {
            sum += element;
        }
        int result = sum/arr.length;
        return result;
    }


    static int rep4()
    {
        System.out.println(4);
        return rep4();
    }


    static int rep2()
    {
        System.out.println(2);
        return rep2();
    }


    static float celFar(float n)
    {
        return (n*9/5) + 32;
    }


    static void rep3()
    {
        for (int i = 0; i<Integer.MAX_VALUE; i++)
        {
            System.out.println(3);
        }
    }


    public static void main(String[] args) {
        table(4);
        System.out.println("\n");
        patt1(4);
        System.out.println("\n");
        System.out.println(add(10));
        System.out.println("\n");
        patt2(4);
        System.out.println("\n");
        System.out.println(fibo(6));
        System.out.println("\n");
        System.out.println(avg(5,10,15,20,25));
        System.out.println("\n");
//        rep4();
//        rep2();
        System.out.println(celFar(37));
        System.out.println("\n");
        rep3();
    }
}
