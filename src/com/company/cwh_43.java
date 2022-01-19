package com.company;
import java.util.Scanner;
import java.util.Random;

class guess
{
    int num, sum;
    Random rd = new Random();
    int x = rd.nextInt(100);
    Scanner sc = new Scanner(System.in);

    public void takeUserInput()
    {
        System.out.print("Guess the number: ");
        num = sc.nextInt();
    }
    public int noOfGuesses(int t)
    {
        return t;
    }
    public void isCorrectNumber()
    {
        int sum = 0;
        for (int i = 1; i > 0; i++)
        {
            takeUserInput();
            if (num > x)
            {
                System.out.println(num + " is bigger than the number.\n");
            }
            else if (num < x)
            {
                System.out.println(num + " is smaller than the number.\n");
            }
            else
            {
                System.out.println("Congratulations! The number has been guessed by you.\n");
                System.out.println("It took you " + noOfGuesses(i) + " tries to guess the number.\n");;
                break;
            }
        }
    }
}

public class cwh_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        guess a = new guess();

        a.isCorrectNumber();
    }
}
