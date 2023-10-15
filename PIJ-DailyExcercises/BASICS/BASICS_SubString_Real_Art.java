public class BASICS_SubString_Real_Art {
    public static void main(String[] args) {
        String mySubString = "artificial reality";
        System.out.println(mySubString.substring(11,15) + " " + mySubString.substring(0,3));
        int length = mySubString.substring(11).length();
        System.out.println(length);
    }
}
