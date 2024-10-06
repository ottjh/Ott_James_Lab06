import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class HighorLow
{
    public static void main(String[] args)
    {
        //We are making a game that generates a random number from 1 to 10 and makes the user guess
        //The game responds by telling them if they guessed too high, too low, or correctly
        //Initialize and declare playerGuess, genNum, trash, and done
        //import scanner and test player guess input and output result
        Random generator = new Random();
        //Scanner in = new Scanner(System.in); removing this to try to see if putting it in range helps
        int playerGuess = 0;
        int genNum = generator.nextInt(10) + 1;
        int outRangeTrash = 0;
        String trash = "";
        boolean done = false;
        boolean inRange = false;

        //Time to test for valid response
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your guess of a randomly generated number [1-10]: ");
            if (in.hasNextInt())
            {
                playerGuess = in.nextInt();
                in.nextLine();
                if (playerGuess > 0 && playerGuess < 11)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Your guess of : " + playerGuess + " is out of range.");
                    System.out.println("Please enter a whole number between 1 and 10");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou guessed that the number was: " + trash);
                System.out.println("You have to enter a valid whole number between 1 and 10.");
            }
        }while(!done);

        //I spent way too long on fixing that to determine both integer and range
        if (playerGuess == genNum)
        {
            System.out.println("Your guess of : " + playerGuess + " is right!");
        } else if (playerGuess > genNum)
        {
            System.out.println("Your guess of : " + playerGuess + " is too high!.");
        }
        else
        {
            System.out.println("Your guess of : " + playerGuess + " is too low!");
        }
    }
}
