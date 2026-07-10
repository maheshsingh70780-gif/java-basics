import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class mahesh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char playAgain;
        int totalScore = 0;
        int gamesPlayed = 0;
        int gamesWon = 0;

        do {

            gamesPlayed++;

            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            int guess = 0;
            boolean guessed = false;

            System.out.println();
            System.out.println("========================================================");
            System.out.println("             DECODELABS JAVA PROJECT - 1");
            System.out.println("               NUMBER GUESSING GAME");
            System.out.println("========================================================");

            System.out.println("Mission Specifications");
            System.out.println("--------------------------------------------------------");
            System.out.println("Target Range      : 1 - 100");
            System.out.println("Maximum Attempts  : " + maxAttempts);
            System.out.println("Random Engine     : java.util.Random");
            System.out.println("Feedback          : Too High / Too Low");
            System.out.println("--------------------------------------------------------");
            System.out.println();

            while (attempts < maxAttempts) {

                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + " : ");

                try {

                    guess = sc.nextInt();
                    attempts++;
                    if (guess == secretNumber) {

                        guessed = true;
                        gamesWon++;

                        int score = (maxAttempts - attempts + 1) * 20;
                        totalScore += score;

                        System.out.println();
                        System.out.println("************************************************");
                        System.out.println("*              CONGRATULATIONS!                 *");
                        System.out.println("************************************************");
                        System.out.println("You guessed the correct number.");
                        System.out.println("Hidden Number : " + secretNumber);
                        System.out.println("Attempts Used : " + attempts);
                        System.out.println("Score Earned  : " + score);
                        System.out.println("Total Score   : " + totalScore);

                        break;

                    } else if (guess < secretNumber) {

                        System.out.println("Hint : TOO LOW");
                        System.out.println("Try a Bigger Number.");

                    } else {

                        System.out.println("Hint : TOO HIGH");
                        System.out.println("Try a Smaller Number.");

                    }

                } catch (InputMismatchException e) {

                    System.out.println("Invalid Input!");
                    System.out.println("Please enter numbers only.");
                    sc.next();
                }

            }
            if (!guessed) {

                System.out.println();
                System.out.println("************************************************");
                System.out.println("*                  GAME OVER                   *");
                System.out.println("************************************************");
                System.out.println("Mission Failed!");
                System.out.println("Correct Number : " + secretNumber);
                System.out.println("Attempts Used  : " + maxAttempts);
                System.out.println("Score Earned   : 0");
            }

            System.out.println();
            System.out.println("=============== GAME SUMMARY =================");
            System.out.println("Games Played : " + gamesPlayed);
            System.out.println("Games Won    : " + gamesWon);
            System.out.println("Games Lost   : " + (gamesPlayed - gamesWon));
            System.out.println("Total Score  : " + totalScore);
            System.out.println("==============================================");

            System.out.print("\nPlay Again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');
        System.out.println();
        System.out.println("========================================================");
        System.out.println("               DEFINITION OF DONE");
        System.out.println("========================================================");
        System.out.println("[OK] Random Number Generation");
        System.out.println("[OK] Scanner Input");
        System.out.println("[OK] High / Low Hint");
        System.out.println("[OK] While Loop");
        System.out.println("[OK] Maximum 5 Attempts");
        System.out.println("[OK] Input Validation");
        System.out.println("[OK] Score Tracking");
        System.out.println("[OK] Play Again Feature");
        System.out.println("========================================================");

        System.out.println();
        System.out.println("**************** FINAL REPORT ****************");
        System.out.println("Games Played : " + gamesPlayed);
        System.out.println("Games Won    : " + gamesWon);
        System.out.println("Games Lost   : " + (gamesPlayed - gamesWon));
        System.out.println("Final Score  : " + totalScore);
        System.out.println("************************************************");

        System.out.println();
        System.out.println("########################################################");
        System.out.println("#             THANK YOU FOR PLAYING!                   #");
        System.out.println("#         DecodeLabs Java Project 1 Completed          #");
        System.out.println("#               Keep Coding, Keep Growing!             #");
        System.out.println("########################################################");

        sc.close();
    }
}
