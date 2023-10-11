import java.util.Scanner;

public class Birkbeck_Wk1_17_TakeNumberApproximatePi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int terms = scanner.nextInt();
        double piApproximation = 0.0;


        for (int k = 0; k < terms; k++) { // Runs loop for up to number entered by user.
            double term = (k % 2 == 0) ? 1.0 : -1.0; // Ternary. If the iteration of k is even, it sets it to positive (1), else sets sign to negative.
            piApproximation += term / (2 * k + 1);
        }

        piApproximation *= 4;

        System.out.println("Approximation of pi: " + piApproximation);
    }
}