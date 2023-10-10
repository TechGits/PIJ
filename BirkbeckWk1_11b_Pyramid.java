import java.util.Scanner;

public class BirkbeckWk1_11b_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int yourNum = scanner.nextInt();

            for (int i = 1; i <= yourNum; i++) {
                // Print leading spaces to right-align the numbers
                for (int j = 0; j < yourNum - i; j++) {
                    System.out.print(" ");
                }

                // Print the current number repeatedly
                for (int j = 0; j < i; j++) {
                    System.out.print(i);
                }

                // Move to the next line after each row
                System.out.println();
            }


    }
}
