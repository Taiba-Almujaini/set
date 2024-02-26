import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> fruitsSet = new HashSet<>();


        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Cherry");
        fruitsSet.add("Orange");
        fruitsSet.add("Grape");
        
        System.out.println("Fruits in the set:");
        for (String fruit : fruitsSet) {
            System.out.println(fruit);
        }
    }
}
