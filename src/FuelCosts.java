import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double capacityGas = 0;
        double milesPerGallon = 0;
        double gallonPrice = 0;
        double hundredCost = 0;
        double tankRange = 0;
        String trash = "";
        boolean done = false;

        //Now for the first test

        do {
            System.out.print("Enter your gas tank's capacity in gallons: ");
            if (in.hasNextDouble()) // OK safe to read in an int
            {
                capacityGas = in.nextDouble();
                in.nextLine();
                done = true;
            } else {

                trash = in.nextLine();
                System.out.println("\n You said your tank's capacity was: " + trash);
                System.out.println("You have to enter a valid capacity in gallons.");
            }
        }while(!done);

        //Now to collect the other inputs
        done = false;
        //First time using a second scanner in the same class. Hope it goes okay.
        //Scanner mpg = new Scanner(System.in);

        do {
            System.out.print("Enter your car's miles per gallon: ");
            if (in.hasNextDouble()) // OK safe to read in an int
            {
                milesPerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {

                trash = in.nextLine();
                System.out.println("\n You said your car's miles per gallon was: " + trash);
                System.out.println("You have to enter a valid fuel efficiency.");
            }
        }while(!done);

        //System.out.println(milesPerGallon + " miles per gallon");
        //System.out.println(capacityGas + " gallons");
        //Messing around to get a sense of how to use multiple scanners and if I have correctly integrated them
        done = false;
        //Now to get the price per gallon
        Scanner gallonP = new Scanner(System.in);

        do {
            System.out.print("Enter the price of a gallon of gas: ");
            if (gallonP.hasNextDouble()) // OK safe to read in an int
            {
                gallonPrice = gallonP.nextDouble();
                gallonP.nextLine();
                done = true;
            } else {

                trash = gallonP.nextLine();
                System.out.println("\n You said the price of a gallon was: " + trash);
                System.out.println("You have to enter a valid numeric monetary price.");
            }
        }while(!done);

        //Now it's time to get the outputs ready

        hundredCost = ( 100 / milesPerGallon ) * gallonPrice;
        tankRange = milesPerGallon * capacityGas;

        System.out.println("\nThe cost of driving a hundred miles is: " + hundredCost + " dollars.");
        System.out.println("The range of a tank of gas is: " + tankRange + " miles.");

    }
}
