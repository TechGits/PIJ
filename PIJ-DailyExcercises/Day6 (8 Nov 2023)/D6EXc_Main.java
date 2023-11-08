import java.util.Scanner;

public class D6EXc_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Mark (0-100). Press '-1' to finish: ");
        int userNum;
         D6Exc_ReadList myMarksCount = new D6Exc_ReadList();

        do {
         userNum = scanner.nextInt();
         System.out.print("Input a mark: " + userNum +"\n");
         myMarksCount.calcMarks(userNum);
        } while (userNum != -1);
        System.out.println("Distinctions: " +myMarksCount.getPass());

        myMarksCount.getMerit();
        myMarksCount.getPass();
        myMarksCount.getPass();

        myMarksCount.calcMarks(userNum);


    
        

    }
    
}
