/*
Write a program that reads a series of numbers from the user, until the user enters the String “END”.

The program should then print how many numbers were positive, negative, or zero. Write the program using (a) if. . . else clauses first and then using (b) the ternary operator. Is there any difference? In which case it is easier to write the program? In which case does it look clearer to you?
 */
import java.util.Scanner;

public class Day3_ExD_TillTheEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPos = 0; int countNeg = 0; int countZero = 0;
        
        while (true) {
            System.out.print("Enter number (type 'END' to end): ");
                String userInput = scanner.nextLine();     
                String input2UpperCase = userInput.toUpperCase();
                if (input2UpperCase.equals ("END")){
                    System.out.println("Positive: "+countPos + "\nNegative: " + countNeg + "\nZero: "+countZero);
                    break;
                    
                   
                    //The program should then print how many numbers were positive, negative, or zero. Write the program using (a) if. . . else clauses first and then using (b) the ternary operator. Is there any difference? In which case it is easier to write the program? In which case does it look clearer to you?


                } else {
                    int num = Integer.parseInt(input2UpperCase);
                   if (num == 0){
                    countZero++;
                    
                   } else if (num >1) {
                    countPos++;

                   } else if (num < 0) {
                    countNeg++;
                   }
                }   
                }    

                    

       
    }

    
}
