import java.util.Scanner;

public class Day3_1_TernaryOver18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentYear = 2024;
        System.out.print("When were you born?: ");
        int birthYear = scanner.nextInt();
        int ageAprox = currentYear - birthYear;
        String result = (ageAprox > 17) ? "" : "not ";
        System.out.println("It seems you are " + result + "an adult. ");
        
    }
    
}
