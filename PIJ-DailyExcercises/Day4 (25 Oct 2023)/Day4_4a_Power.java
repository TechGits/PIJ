public class Day4_4a_Power {
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }

    static int power(int base, int exponent) {
    int result = 1;
    for (int i = 0; i < exponent;i++){
        result *= base;
        }
        return result;
    }
}