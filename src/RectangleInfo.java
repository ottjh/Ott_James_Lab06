import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        //Okay, we are asking for the sides of a rectangle then outputting Perimeter, area, and diagonal length
        //First initialize and declare length, width, area, perimeter, diagonalLength, trash, and done
        //Scanner then test for valid input
        //Solve for outputs then output
        //a^2+b^2=c^2
        //Not sure how to do this in one line. Might have to make it two

        double length = 0.0;
        double width = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonalLength = 0.0;
        double squareDiagonalLength = 0.0;
        String trash = "";
        boolean done = false;
        Scanner sLength = new Scanner(System.in);

        //Now to test each input
        do {
            System.out.print("Enter the length of the rectangle: ");
            if (sLength.hasNextDouble())
            {
                length = sLength.nextDouble();
                sLength.nextLine();
                done = true;
            } else {

                trash = sLength.nextLine();
                System.out.println("\nYou said the length of the rectangle was: " + trash);
                System.out.println("You have to enter a valid number.");
            }
        }while(!done);

        done = false;
        //Now to do width
        Scanner sWidth = new Scanner(System.in);

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (sWidth.hasNextDouble())
            {
                width = sWidth.nextDouble();
                sWidth.nextLine();
                done = true;
            } else {

                trash = sWidth.nextLine();
                System.out.println("\nYou said the width of the rectangle was: " + trash);
                System.out.println("You have to enter a valid number.");
            }
        }while(!done);

        //Now to calculate the values
        area = length * width;
        perimeter = 2 * length + 2 * width;
        squareDiagonalLength = length * length + width * width;
        diagonalLength = Math.sqrt(squareDiagonalLength);
        //Had to look up how to do square roots in Java, but I am hoping it works.

        //Now to display the values
        System.out.println("\nThe area of the rectangle is: " + area + ".");
        System.out.println("The perimeter of the rectangle is: " + perimeter + ".");
        System.out.println("The length of the diagonal is: " + diagonalLength + ".");
    }
}
