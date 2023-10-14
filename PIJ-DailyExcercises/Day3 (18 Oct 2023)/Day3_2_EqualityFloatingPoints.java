/* Look at the following code. What does it do? What will it print on the screen?
 * Execute the program. Does it print what you expected it to print? Why? (Hint: print the values of d1
and d2; why do they have these values?). If the program is not behaving correctly, fix it.

ANSWER: Floating point precision. add the Math.abs to correct it.
 */
public class Day3_2_EqualityFloatingPoints {
    public static void main(String[] args) {

        double d1 = Math.abs(1.255);
double d2 = d1 + Math.abs(7 - 4 - 3);
    System.out.println("d1 equals " + d1);
    System.out.println("d2 equals " + d2);
 if (d1 == d2) {

 System.out.println("1.255 is equal to 1.255 plus 7 minus 7");
 } else {
 System.out.println("1.255 is NOT equal to 1.255 plus 7 minus 7");
 }
        
    }
    
}
