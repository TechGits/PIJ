import java.util.Scanner;

public class BASICS_Maths_Abs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int yourNUm = scan.nextInt();
        System.out.println("You entered " + yourNUm);

        int absoluteValue = Math.abs(yourNUm);
        System.out.println("Absolute value is "+absoluteValue);
        
    }
    
}
