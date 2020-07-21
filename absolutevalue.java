import java.util.Scanner;
    public class absolutevalue
{
    public static void main (String args [])
    {  int a;
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number");
        a=s.nextInt();
        if(a<0){
            a=-a;
            

        }
        System.out.println("Absolute value"+a)
    }
}