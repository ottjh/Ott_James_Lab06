import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CtoFConverter
{
    public static void main(String[] args)
    {
        //Okay, we are converting a given celcius temperature to fahrenheit
        //initialize and declare scanner, cDegree, and fDegree
        //Use a loop to test that input cDegree is valid
        //convert cDegree via a formula into fDegree
        //Output fDegree
        Scanner in = new Scanner(System.in);
        double cDegree = 0;
        double fDegree = 0;
        String trash = "";
        boolean done = false;

        //Now to ensure they give a proper response
        do {
            System.out.print("Enter the temperature in Celcius: ");
            if (in.hasNextDouble()) // OK safe to read in a double
            {
                cDegree = in.nextDouble();
                in.nextLine();
                done = true;
            } else {

                trash = in.nextLine();
                System.out.println("\n You said the temperature was: " + trash);
                System.out.println("You have to enter a valid temperature in Celcius.");
            }
        }while(!done);

        //Now we need to convert it and output it

        fDegree=(9/5)*cDegree+32;
        System.out.println("Your temperature in Fahrenheit is: " + fDegree + ".");
    }
}