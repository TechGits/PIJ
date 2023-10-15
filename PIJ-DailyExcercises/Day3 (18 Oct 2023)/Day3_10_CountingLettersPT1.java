/*
PART 1
 * Write a program that reads some text from the user and then says how many letters ’e’ are there in that text.

 */

import java.util.Scanner;

public class Day3_10_CountingLettersPT1 {
   
    public static void main(String[] args) {
         char letterToCount = 'e';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String str = scanner.nextLine();

       for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == letterToCount){
         count++;
        }
        
       }
     System.out.println("There are "+count +" "+ letterToCount+"'s in this sentence.");   
    }
}
