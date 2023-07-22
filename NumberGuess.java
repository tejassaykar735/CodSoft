import java.util.*;

public class NumberGuess 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String read = "yes";

        while(read.equals("yes"))
        {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
 
            while(guess != randNum)
            {
                System.out.println("Guess a number between 1 and 100: ");
                guess = sc.nextInt();
                tries++;
                if(guess == randNum)
                {
                    System.out.println("Great!!! you guessed the number!!!");
                    System.out.println("You took "+tries+" to guess the number");
                    System.out.println("Play Again!!! (Yes or No):");
                    read = sc.next().toLowerCase();
                }
                else if(guess > randNum)
                {
                    System.out.println("Your Guess is High from number,try Again.");
                }
                else
                {
                    System.out.println("Your Guess is Low from number,try Again.");
                }
            }
        }
       sc.close();
    }    
}