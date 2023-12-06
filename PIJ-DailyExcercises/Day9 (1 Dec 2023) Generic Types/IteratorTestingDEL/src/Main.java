import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map <Integer,String> myMap = new HashMap<>(Arrays.asList(22,"wseer")) {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String get(Object key) {
                return null;
            }

            @Override
            public String put(Integer key, String value) {
                return null;
            }

            @Override
            public String remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends Integer, ? extends String> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<Integer> keySet() {
                return null;
            }

            @Override
            public Collection<String> values() {
                return null;
            }

            @Override
            public Set<Entry<Integer, String>> entrySet() {
                return null;
            }
        }
    }

//        ArrayList<String> fruit = new ArrayList<>(Arrays.asList("orange", "pear"));
//
//        for (String currentFruit : fruit) {
//            System.out.println(currentFruit);
//        }
//
//        Queue<String>myString = new LinkedList<>(Arrays.asList("School", "to","goes","ricki"));
//        System.out.println(myString.element());;
//    }
}
