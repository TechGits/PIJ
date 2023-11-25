public class Dog extends Mammal{
  static String type = "Dawg";
  static String breed;
  static String name;
  static int age;



    Dog(String breed, String name, int age) {

        this.breed = breed;
        this.name = name;
        this.age = age;



    }



    @Override
    public void breathe() {

    }

    @Override
    public void getMood(String mood) {
        super.getMood(mood);
    }

    @Override
    public void speak() {

    }

    @Override
    public void getAnimalBehaviour(String name) {

    }

    @Override
    public void setActionSound(String actionSound) {

    }

    @Override
    public void wantsTo(String wantsToDo) {

    }

    void stats (){

        System.out.println("Type: "+ Dog.type.toString() +"\n"+"Breed: "+Dog.breed+"\nName: "+Dog.name+"\nAge: "+Dog.age);

}}
