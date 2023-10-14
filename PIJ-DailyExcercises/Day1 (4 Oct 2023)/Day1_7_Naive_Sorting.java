// Write a program that reads three numbers and prints them in order, from lowest to highest.

import java.util.Scanner;
import java.util.Arrays;

public class Day1_7_Naive_Sorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberChoices = 3;
        int[] userArray = new int[3]; //this array stores the 3 numbers

        for (int i = 0; i < numberChoices; i++){
        System.out.print("Enter number " + (i + 1) + ": ");
        userArray[i] = scan.nextInt();

        }
        Arrays.sort(userArray);

        int lowest = userArray[0];
        int mid = userArray [1];
        int highest = userArray[2];

        System.out.println("Lowest: "+lowest+"\nMiddle: "+mid+"\nHighest: "+highest );
        

    
    
}

}
