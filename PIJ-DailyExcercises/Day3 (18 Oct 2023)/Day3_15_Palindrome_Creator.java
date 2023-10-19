import java.util.Scanner;

public class Day3_15_Palindrome_Creator {
    public static void main(String[] args) {
            
            String input = "ici";

            if (isPalindrome(input)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }

        // Function to check if a string is a palindrome
        public static boolean isPalindrome(String str) {
            // Remove spaces and convert to lowercase for case-insensitive comparison
            str = str.replaceAll("\\s", "").toLowerCase();
            
            int left = 0;
            int right = str.length() - 1;
            System.out.println(right);
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
    }
    
}
