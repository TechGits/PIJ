import java.util.Scanner;

public class BASICS_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yourText = scanner.nextLine();
        System.out.print("Enter Text: ");

        if (isPalinDrome(yourText)){
            System.out.println(yourText + " is a Palindrome.");
        } else {
            System.out.println(yourText + " is not a Palindrome.");
        }
    }

    static boolean isPalinDrome (String yourText) {
        int left = 0;
        int right = yourText.length() -1;
        while (left < right) {
            if (yourText.charAt(left) != (yourText.charAt(right))) {
                return false;
                }
            left++;
            right--;
        }
        return true;

    }
    
}
