public class Dog extends Animal{
    String animalName;
    String breed;

    Dog(String animalName, String breed) {
        super(animalName, breed);
    }


    @Override
    void makeNoise(String animalNoise) {
        super.makeNoise(animalNoise);
    }
}
