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


/*
Function isPalindrome (String, yourString)  // Boolean returns true / false

startLetter = 0
endLetter = yourString - 1

While (start < end) //This while loop iterates through the word …
		if yourString.(startLetter) != yourString.(endLetter)
			return false
		end of loop

		Increment startLetter (startLetter++)
		Decrement endLetter (endLetter --)
// if the loop keeps returning false (after incrementing and decrementing,  until the end, then it is not a palindrome, and the while loop ends.

end while loop

return true

 */