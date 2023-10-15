import java.util.Scanner;


public class BASICS_Splitting_Words {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String yourInput = scanner.nextLine();

        // Split the input text into words using space as the delimiter
        String[] words = yourInput.split(" ");

        // Print each word on a separate line
        for (String word : words) {
            System.out.println(word);
        }

    }
    
}
