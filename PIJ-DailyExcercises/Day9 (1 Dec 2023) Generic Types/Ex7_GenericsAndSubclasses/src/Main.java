import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     List<? extends Animal> pussy = new ArrayList<Cat>();
     new Cat("korky");
        System.out.println(pussy.size());
    }
}