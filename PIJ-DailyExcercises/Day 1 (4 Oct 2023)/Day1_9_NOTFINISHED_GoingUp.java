/*
Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. At that point, print “Yes” if the numbers were consecutive and increasing and “No” otherwise. For example, the sequences “1,2,3,4,-1” and “5,6,7,8,9,10,11,-1” should lead to the output “Yes”, but “2,3,5,6,7,-1”, “10,9,8,7,-1”, and “1,1,2,3,4,5,-1” should lead to the output ”No”.
 */
import java.util.Scanner;

public class Day1_9_NOTFINISHED_GoingUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean finished = false;
        while (!finished) {
        System.out.print("Please enter a number (end with -1): ");
        int num = scanner.nextInt();
       
        if (num != -1) {
        total = total + num;
            if (num > num){
                
                System.out.println("The number currently is " + total+". Yes");
            } else {
                System.out.println("No");

        }

        } else {
        finished = true;
        System.out.println("you entered  numbers.");
        }
        }

    }
    
}
