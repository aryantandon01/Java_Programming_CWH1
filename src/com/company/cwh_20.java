package com.company;
import java.util.Random;

public class cwh_20 {
    public static void main(String[] args) {
        Random rd = new Random();
        char ch1 = 0, ch2 = 0;
        String str = null;
        String ss1 = null, ss2 = null;
        int a = rd.nextInt(99);
        if ((a)%3==0)
        {
            ch1 = 'r';
            ss1 = "rock";
        }
        else if ((a)%3==1)
        {
            ch1 = 'p';
            ss1 = "paper";
        }
        else if ((a)%3==2)
        {
            ch1 = 's';
            ss1 = "scissors";
        }

        int b = rd.nextInt(99);
        if ((b)%3==0)
        {
            ch2 = 'r';
            ss2 = "rock";
        }
        else if ((b)%3==1)
        {
            ch2 = 'p';
            ss2 = "paper";
        }
        else if ((b)%3==2)
        {
            ch2 = 's';
            ss2 = "scissors";
        }

        if (ch1=='r')
        {
            if (ch2=='r')
            {
                str = "It's a draw.";
            }
            if (ch2=='p')
            {
                str = "B won.";
            }
            if (ch2=='s')
            {
                str = "A won.";
            }
        }
        else if (ch1=='p')
        {
            if (ch2=='r')
            {
                str = "A won.";
            }
            if (ch2=='p')
            {
                str = "It's a draw.";
            }
            if (ch2=='s')
            {
                str = "B won.";
            }
        }
        else if (ch1=='s')
        {
            if (ch2=='r')
            {
                str = "B won.";
            }
            if (ch2=='p')
            {
                str = "A won.";
            }
            if (ch2=='s')
            {
                str = "It's a draw.";
            }
        }


        System.out.println("A chose " + ss1 + " and B chose " + ss2 + ". " + str);


    }
}
