import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap <String, Integer> empIds = new HashMap<>();
        empIds.put("John",40000);
        empIds.put("Carl",56000);
        empIds.put("Anna",35000);

        System.out.println(empIds.hashCode());
//        System.out.println(empIds.containsKey("Carl"));

    }
   }