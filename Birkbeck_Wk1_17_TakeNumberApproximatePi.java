import java.util.Scanner;

public class Birkbeck_Wk1_17_TakeNumberApproximatePi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int terms = scanner.nextInt();
        double piApproximation = 0.0;


        for (int k = 0; k < terms; k++) {
            double term = (k % 2 == 0) ? 1.0 : -1.0;
            piApproximation += term / (2 * k + 1);
        }

        piApproximation *= 4;

        System.out.println("Approximation of π: " + piApproximation);
    }
}
