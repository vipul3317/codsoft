import java.util.*;
public class number_guessing {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Random r= new Random();

    System.out.println("Welcome to the Number Guessing Game!"); 
        int score =0;
        boolean playAgain=true;

    while(playAgain){ 
        int targetNumber=r.nextInt(100)+1;
        int attempts=0;
        int maxAttempts=5;
     System.out.println("Hey! I've guessed the number between 1 and 100. Can you guess it ?"); 
     while (attempts<maxAttempts) {
        System.out.println("Enter your guessed number :");
        int userGuess=s.nextInt();
        s.nextLine();

        attempts++;

        if(userGuess==targetNumber){
            System.out.println("Congrats! You've guessed the right number in "+attempts+" attempts.");
            score++;
            break;
        } else if(userGuess<targetNumber) {
            System.out.println("Too low! Take another try.");
        } else {
            System.out.println("Too high! Take another try.");
        }
    }
    if (attempts>maxAttempts) {
        System.out.println("Sorry, you've run out of attempts. The correct number was" + targetNumber + ".");
    }
    System.out.println("Do you want to play again? (yes/no) :");
    String playAgainInput=s.nextLine();
    playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score: " + score);

        s.close();
    }
} 