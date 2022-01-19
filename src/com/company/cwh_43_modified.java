package com.company;
import java.util.Scanner;
import java.util.Random;


class Game
{
    public int num, x, guesses = 0;

    int game()
    {
        Random rd = new Random();
        x = rd.nextInt(100);
        return x;
    }
    public void takeUserInput()
    {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    }
    public boolean isCorrectNumber()
    {
        if (num == x)
        {
            return true;
        }
        else if (num > x)
        {
            System.out.println("Too high.\n");
        }
        else if (num < x)
        {
            System.out.println("Too low.\n");
        }
        return false;
    }
    public void setNoOfGuesses()
    {
        guesses += 1;
    }
    public int getNoOfGuesses()
    {
        return guesses;
    }
}

public class cwh_43_modified {
    public static void main(String[] args) {
        Game g = new Game();
        g.game();
        for (int i = 1; i > 0; i++)
        {
            g.takeUserInput();
            g.setNoOfGuesses();
            if (g.isCorrectNumber())
            {
                System.out.print("Congrats!");
                break;
            }
            else
            {
                continue;
            }
        }
        System.out.println(" It took you " + g.getNoOfGuesses() + " guesses to find the number.");
    }
}