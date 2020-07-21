import java.util.Scanner;
public class circle 
{    
public static void main(String[] args)
{
int radius ;
double circumference;
double area;
 Scanner s = new Scanner(System.in);
 System.out.print("Enter the radius");
 radius=s.nextInt();

 circumference=2 * Math.P.I * radius;
 area =Math.P.I * radius * radius;
 System.out.println("The circumference of circle is  "+circumference);
 System.out.println("The area of circle is "+area);

}

}
