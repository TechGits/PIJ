/*
 * Write a program that reads a (arbitrarily long) sequence of positive numbers. The sequence is ended when the users enters “-1”. At that point, the program must output the highest number in the se- quence.
 */

import java.util.Scanner;

public class Day1_8_NOTFINISHED_Maximising {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int yourNum = scanner.nextInt();
        while (yourNum != -1){
        System.out.println("You entered "+ yourNum);

        scanner.nextLine();

        }
        System.out.println("Finished");
        
    }
    
}
