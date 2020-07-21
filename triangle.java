import java.util.Scanner;

public class triangel
{
    public static void main (String[] args)
    {
        double a, b, c;
        Scanner z = new Scanner(System.in);
        System.out.print("enter the side 1:");
      a=z.nextInt();

        System.out.print("enter the side 2:");
      b=z.nextInt();

        System.out.print("enter the side 3:");
      c=z.nextInt();
    
  double  s=(a+b+c)/2;
  double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("the area of Triangel is" +area);
    
    }

}