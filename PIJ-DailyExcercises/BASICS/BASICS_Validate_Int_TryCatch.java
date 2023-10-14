import java.util.Scanner;
import java.util.InputMismatchException;

public class BASICS_Validate_Int_TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    

int age = 0;
        while (true) {
            try {
                System.out.print("Enter your age: ");
                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();
                    if (age >= 18 && age <= 82) {
                        break;
                    } else {
                        System.out.println("Age must be between 18 and 82.\n");
                    }
                } else {
                    System.out.println("Invalid Input. Please enter a number");
                    scanner.next();
                }
            } catch (InputMismatchException e) {

            }
}
System.out.println("Invalid Input. Please enter a valid number. \n");
scanner.next();

    }
}