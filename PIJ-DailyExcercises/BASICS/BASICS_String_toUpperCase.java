import java.util.Scanner;

public class BASICS_String_toUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String yourInput = scanner.nextLine();
        String ammendedUpperCase = yourInput.toUpperCase();

        System.out.println("Original text: " + yourInput);
        System.out.println("Uppercase text: " + ammendedUpperCase);
    }
}