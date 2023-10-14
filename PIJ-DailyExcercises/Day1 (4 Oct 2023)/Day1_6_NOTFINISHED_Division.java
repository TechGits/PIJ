import java.util.Scanner;

/**
 Write a program that requests two positive numbers from the user and then outputs the quotient and the remainder, e.g., if the user enters 7 and 3, your program should output something like “7 divided by 3 is 2, remainder 1”. You cannot use the “/” or “%” operators.

 */
public class Day1_6_NOTFINISHED_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double remainder = 0;
        double divTotal;

        System.out.print("Enter the first number: "); // nmber is 7
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: "); // number is 2
        double num2 = scanner.nextDouble();
     
        for (int i = 0; i < Math.abs(num1);i++){ // gonna iterate 7 times
            divTotal = divTotal + 0.5; // 0 = 0+0.5 it does this 7 times, 
            //coz it loops to num1  (basically, adding half)                  

        }


        System.out.println(num1 + " divided by "+num2 + " = " + divTotal + ". The remainder is "+ remainder);


    }
}