package Noahs_Ark;

public class Frog extends Amphibians {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void call(String animalType) {
        super.call(animalType);
        System.out.println(name + " the "+ animalType+" is coming.");
    }
}