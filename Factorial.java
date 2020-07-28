// Write a program to find the factorial value of any number entered through the keyboard.  //


import java.util.Scanner;
 public class Factorial
 {
     public static void main (String args[])
     {
        
         Scanner c = new Scanner(System.in);
         int num , i;
         int fact = 1;
         System.out.print("enter the factorial number");
         num = c .nextInt();
      for(i=1; i<=num ; i++){
          
      
      fact *= i;
      }
      System.out.println("fact value"+fact);
     
     
 }
 } 