import java.util.Scanner;

public class BASICS_Palindrome {
    public static void main(String[] args) {
        String yourString = "aibba";
        String result = isPal(yourString) ? yourString + " is a palindrome." : yourString + " is not a palindrome.";
        System.out.println(result);     

    }

    static boolean isPal (String yourString){
        int left = 0;
        int right = yourString.length() -1;
        while (left < right){
            if (yourString.charAt(left) != (yourString.charAt(right))){
                return false;
                
            }
            left++;
            right--;

        }  return true;


    }
    
}
