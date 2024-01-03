public class Main {
    public static void main(String[] args) {

        PrimeMethodClass primeChecker = new PrimeMethodClass();
        int num2Check = 2;
        String result = (primeChecker.isPrime(num2Check)) ?  num2Check + " is a prime number" : num2Check+ " is not a prime number";
        System.out.println(result);

    }
}
