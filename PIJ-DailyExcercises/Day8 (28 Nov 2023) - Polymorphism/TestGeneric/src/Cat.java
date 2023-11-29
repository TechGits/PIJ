public class Cat {
String name;

Cat (String name){
    this.name = name;
}

void printCatName(){
    System.out.println("Hi. My name is "+name+". I am a "+getClass().getName());
}
}
