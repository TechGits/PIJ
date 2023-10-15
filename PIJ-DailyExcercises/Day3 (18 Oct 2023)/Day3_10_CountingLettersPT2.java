/*
PART 2
 Then modify the program so that it reads the text from the user and then asks for a letter. The program should then say how many times you can find the letter in the text.

 */

import java.util.Scanner;

public class Day3_10_CountingLettersPT2 {
   
    public static void main(String[] args) {
         char letterToCount = 'e';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String str = scanner.nextLine();
        System.out.print("Enter a letter: "); //b for example
        char letter = scanner.next().charAt(0);

       for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == letter){
         count++;
        }
        
       }
     System.out.println("There are "+count +" "+ letter+"'s in this sentence.");   
    }
}
