import java.util.Scanner;
public class Birkbeck {
    public static void main(String[] args) {
   int myNumber = 0;
        System.out.println("Starting program, my number is " + myNumber);
        add1000(myNumber);
        System.out.println("After the method is used, my number is " + myNumber);
    }
        static void add1000(int number) {
            System.out.println("Starting method, parameter is "+ number);
                    number = number + 500;
            System.out.println("In the middle of method, parameter is " + number);
            number = number + 500;
            System.out.println("Ending method, parameter is " + number);
        }



}
