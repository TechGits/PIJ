// What does the following piece of code do?

import java.util.Scanner;

public class Day1_2_Yet_Another {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while (i<10) {
            i = i + 1;
            int j = scanner.nextInt();
            if (j == 0) {
                break;
            } else if (j != 1) {
                System.out.println(j);
            }

        }System.out.println("Finished!");
    }
    
}

/** ANSWER: It gets a user input, then enters a loop:
 * if user input is equal to or more than 10, it breaks out of loop and prints "finished"
if the user input is less then 10 it increments I. it then asks for another input (j).
If the user inpputted '0', it breaks out of the loop and returns "finished"
If user inout is anything other than "1", it prints that number.
Programme could benefit with some concole printout statements to guide useres, such as "Enter Number: "

*/