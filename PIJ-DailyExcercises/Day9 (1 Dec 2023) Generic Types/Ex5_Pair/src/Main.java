public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Ricki", 42);
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());

        Pair<String, Integer> pair2 = new Pair<>(pair1);
        System.out.println(pair2.getFirst() + " " + pair2.getSecond());

        Pair<Integer, String> pair3 = pair1.swap();
        System.out.println(pair3.getFirst() + " " + pair3.getSecond());



    }
}