import java.util.Scanner;

/** Write a program that asks for a number from the user, then says whether the number is prime or not. Remember that a prime number is a positive number (i.e., it is greater than 0) that is divisible only by 1 and itself. You can use the modulo operator (if a % b is zero, then a is divisible by b). */

public class Day1_4_Prime_Numbers {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Number: ");
    double userNum = scanner.nextDouble();
   
    boolean isPrime = true;
    if (userNum <=1) {
        isPrime = false;
    } else {

        for (double i = 2; i< userNum; i++){
            if (userNum % i == 0){
                isPrime = false;
                break;
            }
        }
    } if (isPrime) {
        System.out.println(userNum + "is a prime number.");
    } else {
        System.out.println(userNum + "is not a prime number.");
    }

    }
    
}
    

