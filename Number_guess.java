import java.util.Random;
import java.util.*;
class Number_Guess {
        public static void main(String[] args) {
            Random rand = new Random();
            int numberToGuess = rand.nextInt(100) + 1;
            Scanner scanner = new Scanner(System.in);
            int guess;

            System.out.println("Welcome to the number Game!");
            System.out.println("Guess a number between 1 and 100:");
            int attempt=1;
            int score=100;

            while (true) {
                if(attempt>10) {
                    System.out.println("You have exceeded the maximum attempt limit!\nBetter luck next time!");
                    break;
                }
                guess = scanner.nextInt();

                if (guess == numberToGuess) {
                    System.out.println("Congratulations, you guessed the number!\nYou took "+attempt+" attempts to guess the number!");
                    System.out.println("\nYour performance score is "+score+" percent!");


                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Your guess is too low. Try again:");
                    attempt++;
                    score-=10;
                } else {
                    System.out.println("Your guess is too high. Try again:");
                    attempt++;
                    score-=10;
                }
            }

            scanner.close();
        }
    }

