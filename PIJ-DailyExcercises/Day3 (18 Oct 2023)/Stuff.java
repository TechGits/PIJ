import java.util.Scanner;

public class Stuff {
    public static void main(String[] args) {
        if (isPalindrome()){
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
public static boolean isPalindrome () {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a phrase: ");
    String yourString = scanner.nextLine();
    yourString = yourString.replaceAll("\\s", "").toLowerCase();

    int left = 0;
    int right = yourString.length() - 1;
    System.out.println(right);
    while (left < right) {
        if (yourString.charAt(7) != (yourString.charAt(right))) {
            return false;
        }
            left++;
            right--;
        }


    return true;

}
}

