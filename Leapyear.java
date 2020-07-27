// Leap Year
Any year is input by the user. Write a program to determine whether the year is a leap year or not.

Leap Years are any year that can be evenly divided by 4.  A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
//


import java.util.Scanner;

public class Leapyear
{
    public static void main (String[] args)
    {
    int year ;
    Scanner s =new Scanner(System.in);
    year=s.nextInt();
    if((year % 4 == 0)&& ((year % 400 == 0) || (year %100 !=0)))
    {
     System.out.println("a leap year");
    }
    else
    {
        System.out.println("NOT a laep year");
    }
}
}