import java.util.Scanner;

public class BirkbeckWk1_16_OptimusPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int yourNum = scanner.nextInt();
        boolean isPrime = true;

        if (yourNum <= 1) { // Prime numbers cannot be 1 or 0
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(yourNum); i++) {
                if (yourNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(yourNum + " is a prime number.");
        } else {
            System.out.println(yourNum + " is not a prime number.");
        }
    }
}
