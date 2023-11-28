package Noahs_Ark;

public class Main {
    public static void main(String[] args) {
        Bear grizzlyBear = new Bear("Yogi");
        Eagle eagle = new Eagle("Eddie");
        Fly mosquito = new Fly("Bibi");
        Frog toad = new Frog("Froggie");
        Salmon salmon = new Salmon("Wanda");

        grizzlyBear.call("Bear");
        eagle.call("Eagle");
        mosquito.call("Fly");
        toad.call("Frog");
        salmon.call("Salmon");


    }
}
