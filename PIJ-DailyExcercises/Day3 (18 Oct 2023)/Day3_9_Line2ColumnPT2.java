import java.util.Scanner;

/*
 * Part 2 Write a program that reads some text from the user and then writes the same text on screen, but each letter on a different line.
 
 Now modify your program to write each word (as defined by spaces) rather than letter on a different line.
  */
public class Day3_9_Line2ColumnPT2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String inputText = scanner.nextLine();

        // Split the input text into words using space as the delimiter
        String[] words = inputText.split(" ");

        // Print each word on a separate line
        for (String word : words) {
            System.out.println(word);
        }

    }
    
}
