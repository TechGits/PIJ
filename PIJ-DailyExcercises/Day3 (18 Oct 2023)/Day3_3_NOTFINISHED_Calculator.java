/*
 * Write a program that reads two numbers from the user and then offers a menu with the four basic
operations: addition, subtraction, multiplication, and division. Once the user has selected an operation
from the menu, the calculator performs the operation.
Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is
also a Double.parseDouble() method to parse real numbers. Similarly, class java.util.Scanner has
a method nextDouble().


 */

import java.util.Scanner;

public class Day3_3_NOTFINISHED_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();
        int mathChoice = 0;

        while (true) {            
        System.out.println("\nPress 1 to Add "+num1 + " to "+num2+":");
        System.out.println("Press 2 to Subtract "+num1 + " from "+num2+":");
        System.out.println("Press 3 to Multiply "+num1 + " by "+num2+":");
        System.out.println("Press 4 to Divide "+num1 + " by "+num2+":");
        System.out.println("Press 0 to quit:");
        System.out.print("\n>");
        int userChoice = scanner.nextInt();
        if (userChoice > 4 || userChoice <0){
            System.out.println("Invalid Input. Try again.");
        } else {
           switch (mathChoice) {
            case 1:
                double addTotal = num1 + num2;
                System.out.println(addTotal);
                break;
              
            case 2:
                double subtractTotal = num1 - num2;
                break;

            case 3:
                double timesTotal = num1 * num2;
                break;

            case 4:
                double divTotal = num1 - num2;
                break;

            default:
            System.out.println("Bye-Bye");
           

            
    


            
           }
        }
           
        
    }
    }
    
}
