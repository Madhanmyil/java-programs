//
        Revenue can be calculated as the selling price of the product times the quantity sold,
         i.e. revenue = price × quantity. Write a program that asks the user to enter product price and quantity and then calculate the revenue.
          If the revenue is more than 5000 a discount is 10% offered. Program should display the discount and net revenue. 
          
          //



          import java.util.Scanner;
          public class revenue
          
          {
              public static void main(String args[])
          {
              int price,quantity,Revenue1;
              int discount = 0 ;
              Scanner s= new Scanner(System.in);
              System.out.print("Enter the price:");
              price=s.nextInt();
              System.out.print("enter the quantity:");
              quantity=s.nextInt();
              Revenue1 = price*quantity;
              if(Revenue1>5000){
              discount=Revenue1*10/100;
              
              Revenue1 = Revenue1 -discount;          
              }
              System.out.println("discount"+discount);
              System.out.println("Net revenue"+Revenue1);
              
          }
          }
          