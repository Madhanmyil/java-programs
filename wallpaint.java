import java.util.Scanner;
public class wallpaint
{
    public static void main (String[] args )
    {
        int lenght,width,height,numberofdoors,numberofwindows,noofrooms;
        Scanner z = new Scanner(System.in);
        System.out.print("Enter length:");
        lenght= z.nextInt();
        System.out.print("Enter width:");
        width= z.nextInt();
        System.out.print("Enter height:");
        height= z.nextInt();
        System.out.print("Enter number of  doors:");
        numberofdoors= z.nextInt();
        System.out.print("Enter number of windows:");
        numberofwindows= z.nextInt();
         int totalSurfaceArea = 2 * (length * width + length
                * height + width * height);

        int areaOfFloor = length * width;
        
        int areaOfDoors = 20 * numberOfDoors;
        
        int areaOfWindows = 15 * numberOfWindows;
        
        int totalPaintArea = totalSurfaceArea - areaOfFloor
                - areaOfDoors - areaOfWindows;
        
        int requiredPaint = totalPaintArea / 350;

        System.out.println("Paint required "
                + requiredPaint + " gallons.");
        
        
            }
}