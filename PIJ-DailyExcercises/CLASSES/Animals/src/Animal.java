public class Animal {
    private String type; // Mammal, Avian, Insect

    private String color;
    private String speech;
    private int numberOfLegs;
    private boolean predator;
    private int fearsomeRating;
    private String statusPred;

    //Constructor
    public Animal(String type, String color,String speech, int numberOfLegs, boolean predator, int fearsomeRating) {
        this.type = type;
        this.color = color;
        this.speech = speech;
        this.numberOfLegs = numberOfLegs;
        this.predator = predator;
        this.fearsomeRating = fearsomeRating;

    }

    // Getters and setters for common properties

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound () {
        System.out.println(type.toString() + " "+speech.toString()+"s");

    }



    public boolean isPredator() {

        if (predator) {
            statusPred = ("is a predator");
            System.out.println(statusPred.toString());
            return true;
        } else {
            statusPred = ("is not a predator");
            System.out.println(statusPred.toString());
        } return false;
    }
    public void animalProperties() {
        System.out.println("This is a "+type+". It is "+color+", has "+numberOfLegs+" legs, and .\nIt has a fear factor of level "+fearsomeRating+", and "+speech+"s at you, saying 'hello'.");
    }

}