import java.util.*;

/**
 * https://birkbeckuol-my.sharepoint.com/personal/g_kortsaridis_bbk_ac_uk/_layouts/15/stream.aspx?id=%2Fpersonal%2Fg_kortsaridis_bbk_ac_uk%2FDocuments%2FRecordings%2FProgramming%20in%20Java-20231201_174832-Meeting%20Recording%2Emp4&referrer=StreamWebApp%2EWeb&referrerScenario=AddressBarCopied%2Eview
 * This is example of creating an array of elements (progLang) and assigning that array
 * to a Set
 * HashSet - Don't care about ordering
 * LinkedHashed - order that we added
 * TreeSet - ordered
 *
 */

public class ProgLangs {
    public static void main(String[] args) {

        // Assigns the arrays (progLang) to the Hashset or LinkedHashSet
        HashSet <String>mySet1 = new HashSet<>(progLang);
        System.out.println(mySet1);
        LinkedHashSet<String>mySet2 = new LinkedHashSet<>(progLang);
        System.out.println(mySet2);
        TreeSet<Double> mySet3 = new TreeSet<>(ratios);
        System.out.println(mySet3);
    }
    // Iterates
    private static void printSet(Set<String> set){
        for (String item : set){
            System.out.println(item);
        }
    }

        // Creates the variables for the array
        private static List<String> progLang = Arrays.asList("Java","C","PHP","Javascript","Python","Rust","Haskell");
        private static List<String> r = Arrays.asList( "Alice","Bob","Alice","Charile","Bob","Alice");

        public static List<Double> ratios = Arrays.asList(29.0,792.8,45.9,3.14,87.465,1.9);
}

