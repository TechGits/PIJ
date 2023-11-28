
public interface Animal {

  void  type (String type); //phyla - (mammal, reptile, insect, fish, avian, etc)
  void breed (String breed); // goose, robin, crow, chihuaha, etc
  void name (String name); // The animal's pet name
  void age (int age); // The animal's age

    void breathe();

    void eat();
    void sleep();
    void speak();
    void getAnimalBehaviour(String adverb); // Physical Action: pawing, scratching, sniffing, rolling over ,sniffing...

    void getMood(String mood); // can be angry, playful, curios: in a "...." mood.
    void getActionSound();
    void setActionSound(String actionSound);


    void wantsTo (String wantsToDo); // play, sleep, eat, go for a walk, hide,etc

}




