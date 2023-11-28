public class Cat extends Mammal {
    static String type = "Feline";
    static String breed;
    static String name;
    static int age;

    Cat(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;

    @Override
    public void type(String type) {
        super.type(type);
    }

    @Override
    public void breed(String breed) {
        super.breed(breed);
    }
}