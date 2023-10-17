import java.util.Scanner;

public class BASICS_Ternary_SentCase {
    public static void main(String[] args) {
        int i = 5;
        String myString = (i < 5) ? "Bigger\n" : "Smaller\n";
        System.out.println(myString);

        //Ternary for Int
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter name: ");
        String yourName = scanner.nextLine();

        // Converts yourName to sentence case (whatever vrsion of "RiCkI is entered")
        yourName = yourName.substring(0, 1).toUpperCase() + yourName.substring(1).toLowerCase();

        //Ternary for String - remeber.equals("yourstring")
        String isTrue = (yourName.equals("Ricki")) ? "That's a good name" : "Not me, bud";
        System.out.println(isTrue);



        
    }
    
}
