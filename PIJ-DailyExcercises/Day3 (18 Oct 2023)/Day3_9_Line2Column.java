import java.util.Scanner;

/*
 * Part 1 Write a program that reads some text from the user and then writes the same text on screen, but each letter on a different line.
 */

public class Day3_9_Line2Column {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter some words...: ");
       // String str = scanner.nextLine();
       String str = ("voodee merister baby");


        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            System.out.println("\n"+x);
            
        }
       

    }
    
}
