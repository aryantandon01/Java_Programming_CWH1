package com.company;
import java.util.Scanner;
public class cwh_29_pq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        float [] marks = {92.4f, 95.2f, 89.3f, 88.4f, 94.1f};
//        float sum = 0.0f;
//        for (int i = 0; i < 5; i++)
//        {
//            sum = sum + marks [i];
//        }
//        System.out.println(sum);


//        int sum = 0;
//        int [] marks = {92, 96, 88, 90, 92};
//        System.out.print("Enter the element: ");
//        int n = sc.nextInt();
//        for (int element: marks)
//        {
//            if (element == n)
//            {
//                sum = sum + 1;
//            }
//        }
//        if (sum>0)
//        {
//            System.out.println("Present");
//        }
//        else
//        {
//            System.out.println("Not present");
//        }


//        int sum = 0;
//        int [] marks = {77, 49, 82, 38, 58};
//        for (int element: marks)
//        {
//            sum = sum + element;
//        }
//        float avg = (float)sum/5;
//        System.out.println("The average is "+ avg + ".");


//        int [][] mat1 = new int [2][3];
//        mat1 [0][0] = 3;
//        mat1 [0][1] = 3;
//        mat1 [0][2] = 3;
//        mat1 [1][0] = 3;
//        mat1 [1][1] = 3;
//        mat1 [1][2] = 3;
//
//        int [][] mat2 = new int [2][3];
//        mat2 [0][0] = 6;
//        mat2 [0][1] = 6;
//        mat2 [0][2] = 6;
//        mat2 [1][0] = 6;
//        mat2 [1][1] = 6;
//        mat2 [1][2] = 6;
//
//        for (int i = 0; i <= 1; i++)
//        {
//            for (int j = 0; j <= 2; j++)
//            {
//                System.out.print(mat1[i][j] + mat2[i][j]);
//                System.out.print("  ");
//            }
//            System.out.println("");
//        }


//        System.out.print("Enter the number of elements in the array: ");
//        int n = sc.nextInt();
//        int temp = 0, x = 0;
//        int [] arr = new int[n];
//        for (int i = 0; i < n; i++)
//        {
//            System.out.print("Enter element " + (i+1) + ": ");
//            arr [i] = sc.nextInt();
//        }
//
//        System.out.println("");
//        System.out.println("Original array:");
//        System.out.print("{");
//        for (int i = 0; i < n; i++)
//        {
//            System.out.print(arr[i]);
//            if (i != n-1)
//            {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("}");
//
//        for (int i = 0; i < n/2; i++)
//        {
//            temp = arr [i];
//            arr [i] = arr [n-1-i];
//            arr [n-1-i] = temp;
//        }
//        System.out.println("");
//        System.out.println("Reversed array:");
//        System.out.print("{");
//        for (int i = 0; i < n; i++)
//        {
//            System.out.print(arr[i]);
//            if (i != n-1)
//            {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("}");


        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int max = 0;
        int sum = 0;
        int [] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter element " + (i+1) + ": ");
            arr [i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            if (arr[i] > max)
            {
                    max = arr[i];
            }
        }

        for (int i = 0; i < n; i++)
        {
            sum = sum + arr[i];
        }

        int min = sum;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Greatest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}
