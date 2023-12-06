package Noahs_Ark;
public class Fly extends Insects {
    public Fly(String name) {

        super(name);
    }
    @Override
    public void call(String animalType) {
        super.call(animalType);
        System.out.println(name + " the "+ animalType+" "+speaks+", and says he will not come.");
    }
}


