public class Day4_4d_NF_Dec2Bin {
    public static void main(String[] args) {
//       int binString2DecConv = bin2Dec("10000");
//       System.out.println(binString2DecConv);

        int decInt2BinConv = dec2Bin(5);
        System.out.println(decInt2BinConv);
    }

    static int dec2Bin (int yourInt){
        int binConv = 0;
        int binaryLength = String.valueOf(yourInt).length();

        for (int i = 0; i < binaryLength; i++) {
            int digit = (yourInt / power(10, binaryLength - 1 - i)) % 10;
            binConv += digit * power(2, binaryLength - 1 - i);
        }

        return binConv;

    }
    static int bin2Dec (String yourString) {
        // Takes binary number in decimal String and coverts to binary
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
