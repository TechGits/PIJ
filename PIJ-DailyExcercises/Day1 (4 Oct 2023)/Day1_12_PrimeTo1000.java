public class Day1_12_PrimeTo1000 {
    public static void main(String[] args) {
        for (int number = 2; number <= 1000; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
