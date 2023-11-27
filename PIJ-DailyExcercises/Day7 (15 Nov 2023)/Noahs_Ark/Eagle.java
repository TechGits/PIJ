package Noahs_Ark;

public class Eagle extends Birds {


    public Eagle(String name) {

        super(name);
    }

    @Override
    public void call(String animalType) {
        super.call(animalType);
        System.out.println(name + " the "+ animalType+" will not come.");
    }
}