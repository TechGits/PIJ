public class Day4_4c_Bin2Dec {
    public static void main(String[] args) {
        int conversion = dec2Num("10000");
        System.out.println(conversion);
    }
    static int dec2Num(String yourString) {
        int decConv = 0;
        int binaryLength = yourString.length();
        for (int i = 0; i < binaryLength; i++) {
            char digit = yourString.charAt(i);
            if (digit == '1') {
                decConv += power(2, binaryLength - 1 - i);
            }
        }
        return decConv;
    }

        static int power ( int base, int exponent){
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }



}
