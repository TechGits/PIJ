import java.util.Scanner;

public class Day3_ExB_SwitchLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Press 1 for Billing");
        System.out.println("Press 2 for Customer service");
        System.out.println("Press 3 for Technical Support");
        System.out.println("Press 4 for Cancellations");
        int choice = scanner.nextInt();

            if (choice > 4 || choice < 1) {
                System.out.println("Invalid input. Please try again");
            } else {

                switch (choice) {
                    case 1:
                        System.out.println("Welcome to billing");
                        break;
                    case 2:
                        System.out.println("You are in a queue");
                        break;
                    case 3:
                        System.out.println("Switch it on and off again");
                        break;
                    case 4:
                        System.out.println("bye-bye !");
                        break;
                } break;
            }
        }


    }

}
