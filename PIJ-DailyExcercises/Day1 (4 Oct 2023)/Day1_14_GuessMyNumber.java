import java.util.Random;
import java.util.Scanner;

public class BirkbeckWk1_14_GuessMyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 1000;
        int yourGuess = 0;
        int numGuesses = 0;
        int ranNum = random.nextInt(max - min + 1) + 1;

        Scanner scanner = new Scanner(System.in);
        while (yourGuess != ranNum) {
            System.out.print("Enter a number: ");
            yourGuess = scanner.nextInt();
            numGuesses++;

            if (yourGuess < ranNum) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }

        }
            System.out.println("Correct. The number was "+ranNum + ". You took " +numGuesses + " guesses.");

        scanner.close();




    }
}
