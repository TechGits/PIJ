package Noahs_Ark;
public class Salmon extends Fish {
    public Salmon(String name) {
        super(name);
    }
    @Override
    public void call(String animalType) {
        super.call(animalType);
        System.out.println(name + " the "+ animalType+" will not come.");
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}