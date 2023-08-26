package com.nikita;
import java.util.Random;
import java.util.Scanner;

class Game
{
    public int number,noOfGasses=0,input;

    public int getNoOfGasses()
    {
        return noOfGasses;
    }

    public void setNoOfGasses(int noOfGasses)
    {
        this.noOfGasses = noOfGasses;
    }

    Game()
    {
        Random rand=new Random();
        this.number= rand.nextInt(100);
    }

    void takeUserinput()
    {
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();

    }
    
    boolean isCorrect()
    {
        noOfGasses++;
        if(input==number)
        {
            System.out.println("your number is correct!!!!!!!!!!");
            System.out.println("no of guesses : "+noOfGasses);
            if(noOfGasses<=5)
            {
                System.out.println("Your guessing power is brilliant!!!!");
            }
            else if(noOfGasses<=10)
            {
                System.out.println("Your guessing power is good");
            }
            else
            {
                System.out.println("Your guessing power is not very well");
            }
            return true;
        }

        else
        {
            if(input>number)
            {
                System.out.println("too high...");
            }
            else
            {
                System.out.println("too low...");
            }
            return false;
        }
    }
}

public class GuessNumberGame
{
    public static void main(String[] args)
    {

        Game g=new Game();

       boolean b=false;

       while(!b)
       {
           g.takeUserinput();
           b=g.isCorrect();
           System.out.println(b);
       }
    }
}