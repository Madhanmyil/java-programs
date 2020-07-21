//


Write a program that prompts the user to input a number. The program should then output the number and a message saying whether the number is positive, negative, or zero.
//


import java .util.Scanner;

public class pnz
{
    public static void main(String[] args)
    {
        int number;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :");
        number=s.
        nextInt();
        if(number > 0)
        {
            
            System.out.println("The number is positive");

        }
        else if(number < 0)
        {
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }

    }
}