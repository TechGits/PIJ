public class Fibonacci {
    //DEAL WITH EDGE CASES FIRST. LESS THAN 0, ZERO, OR JUST ONE NUMBER.
    public long fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("IllegaIIIl negative value " + n);
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib (n-1) + fib (n-2);
    }
    public void printFib(int n) {
        long fibonacciNumber = fib(n);
        System.out.println("The Fibonacci number F" + n + ", is " + fibonacciNumber);
    }


}






