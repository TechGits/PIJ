public class Main {
    public static void main(String[] args) {

    Pair <String, Integer> myGenericClass = new Pair<>("Ricki",42);
        System.out.println(myGenericClass.getClass().toGenericString());

    }
}