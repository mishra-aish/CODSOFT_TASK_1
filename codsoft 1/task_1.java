import java.util.Random;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rannum = random.nextInt(10) + 1;
        int amp = 0;
        boolean hasGuessed = false;

        System.out.println("Welcome to Guess the Number game!");

        System.out.println("Enter a number to Guess b/w 1--10 :");

        while (!hasGuessed)
        {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            amp++;

            if (guess == rannum)
             {
                hasGuessed = true;
                System.out.println("Congratulations! You've guessed the number " + rannum + " correctly!");
                System.out.println("Number of attempts Taken : " + amp);
            } 
            else if (guess < rannum)
             {
                System.out.println("Too low! Try again.");
            } 
            else 
            {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}
