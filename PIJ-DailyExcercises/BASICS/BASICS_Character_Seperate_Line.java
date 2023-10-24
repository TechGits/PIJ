import java.util.Scanner;

public class BASICS_Character_Seperate_Line {
    public static void main(String[] args) {
        readText();
    }

    public static void readText(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String yourText = scanner.nextLine();
        // yourText.substring(i, i + 1)  extracts individual
        // characters from the input string, and then we print each
        // character on a separate line as you intended.
        for (int i=0;i < yourText.length(); i++){
            String lettter = yourText.substring(i, 1+i);
            System.out.println(lettter);
        }

    }
}{
}
