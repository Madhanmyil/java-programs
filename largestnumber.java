// 
Write a program that asks the user to enter a numbers in three variables and then displays the largest number.
//


import java.util.Scanner;

public class largestnumber
{
     public static void main(String[] args) {
      int n1,n2,n3,lar;
      Scanner s =new Scanner(System.in);
      System.out.print("Enter the number1 :");
      n1=s.nextInt();
      
      System.out.print("Enter the number2 :");
      n2=s.nextInt();
      System.out.print("Enter the number3 :");
      n3=s.nextInt();
      if(n1>n2&&n1>n3)
      {
          lar=n1;
      }  
      else if (n2>n3)
      {
        lar=n2;
        }
else{
    lar = n3;

}
System.out.println("Largest number"+lar);    } 
}