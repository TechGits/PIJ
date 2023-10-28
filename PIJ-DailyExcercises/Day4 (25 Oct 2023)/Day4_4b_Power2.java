public class Day4_4b_Power2 {
    public static void main(String[] args) {
        System.out.println(power(2,5));
        System.out.println(power2(16));
    }

    static int power(int base, int exponent) {
    int result = 1;
    for (int i = 0; i < exponent;i++){
        result *= base;
        }
        return result;
    }

    static int power2 (int exponent){
        return power(2,exponent);
    }
}