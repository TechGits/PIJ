import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    /*

Create a class PrimeDivisorList. Integers (as in class Integer)
can be added to / removed from the list. If a null number is passed to
the add(Integer) method, a NullPointerException must be thrown.
If a non-prime number is added, an IllegalArgumentException must be thrown.

     */
    public static void main(String[] args) {

        Map <Double,Integer> map = TreeMapM<>
        PrimeDivisorList primeChecker = new PrimeDivisorList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer num2Check = scanner.nextInt();
        try{
            PrimeDivisorList.add(1);
            PrimeDivisorList.add(null);
            boolean PrimeDivisorList;
            System.out.println(primeChecker.toString());

        } catch (NullPointerException e){
            e.printStackTrace();
        }



              String result = (primeChecker.isPrime(num2Check)) ?  num2Check + " is a prime number" : num2Check+ " is not a prime number";
        System.out.println(result);

    }
}
