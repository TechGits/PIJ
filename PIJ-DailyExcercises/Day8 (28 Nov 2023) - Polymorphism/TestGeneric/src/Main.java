public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Corky");
        myCat.printCatName();

        TypeCast<Integer> myNewTypCast = new TypeCast(23);
        myNewTypCast.printMyType();

        TypeCast<String> myString = new TypeCast<>("sdds");
        myString.printMyType();

        TypeCast<Double> myDoub = new TypeCast<>(4.4);
        myDoub.printMyType();

//        TypeCast.Shout(44);
    }

}