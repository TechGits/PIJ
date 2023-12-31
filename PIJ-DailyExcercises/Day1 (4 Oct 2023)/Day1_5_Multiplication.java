import java.util.Scanner;

/**
 Write a program that requests two numbers from the user and then outputs their product. You can- not use the “*” operator.
Can you make your program work correctly also if one or both numbers are negative?
 */
public class Day1_5_Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: "); // example, i enter 2
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: "); // example, i enter 7
        int num2 = scanner.nextInt();

        int product = 0;

        for (int i = 0; i < Math.abs(num1); i++) {
            product += num2; // 0 = 0 +7.. it does this two times, 
            //coz it loops to num1
        }

        // Handle the case when one or both numbers are negative
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            product = -product;
        }

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        scanner.close();


    }
    
}
