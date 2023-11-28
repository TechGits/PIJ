package Noahs_Ark;

public class Insects implements Animal {
    String name;
    String animalType;

    public Insects(String name) {
        this.name = name;
        this.animalType = animalType;
    }


    @Override
    public void getName() {
        System.out.println(name);

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void eat() {
    }

    @Override
    public void call(String animalType) {

    }


    @Override
    public void reproduce() {
        System.out.println("lay eggs");

    }

    @Override
    public void makeSound() {
        System.out.println("buzzzes");
    }
}