

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Set<String> newSet = new HashSet<>();
        newSet.add("Taiba");
        newSet.add("Maryam");
        newSet.add("Ahmed");
        newSet.add("Ali");
        newSet.add("John");

        if (newSet.contains("John")) {
            System.out.println("Found John");
        } else {
            System.out.println("John is not in the Set");
        }

    }
}