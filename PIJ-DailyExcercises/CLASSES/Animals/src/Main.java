public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog","black and white","bark",4,false,3);
        Animal tiger = new Animal("tiger","orange","growl",4,true,1);
        Animal bird = new Animal("bird","silver","chirp",2,false,5);


        tiger.isPredator();
        dog.animalProperties();
    }
}





