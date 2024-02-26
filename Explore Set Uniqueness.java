
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Set<Integer> newSet = new HashSet<>();
        newSet.add(2);
        newSet.add(4);
        newSet.add(4);
        newSet.add(5);
        newSet.add(6);


        System.out.println("Set of Integers:" + newSet);// it will remove all duplicate values

    }
}