import java.util.Scanner;

/**
NUMBER PYRAMIDS
 Write a program that outputs a number pyramid like the one below, going on forever (until you press Ctrl-C to stop the program).
 1
 22
 333
 4444
 55555
 666666
 7777777
 */
public class Day1_11a_PyramidRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int yourNum = scanner.nextInt();
        for (int i = 1; i <= yourNum; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(" " +i);
         }
            System.out.println();// Rows (new line for each row)
        }

        }
    }



