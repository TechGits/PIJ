import java.util.Scanner;

public class Day1_9_GoingUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int prevNum = -1; // Initialize prevNum to a value that won't match the first input
        boolean consecutive = true; // Assume consecutive until proven otherwise
        
        System.out.println("Enter a sequence of positive numbers (end with -1):");

        while (true) {
            System.out.print("Please enter a number: ");
            int num = scanner.nextInt();

            if (num == -1) {
                break; // Exit the loop if -1 is entered
            }

            if (num <= prevNum) {
                consecutive = false; // Numbers are not consecutive
            }

            prevNum = num;
        }

        if (consecutive) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
