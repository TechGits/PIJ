import java.util.Scanner;

public class Day3_15_Palindrome_Creator {
    public static void main(String[] args) {


            String input = "aBba";

            if (isPalindrome(input)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }

        public static boolean isPalindrome(String str) {
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
