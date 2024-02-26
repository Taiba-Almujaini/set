
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Set<Integer> newSet = new HashSet<>();
        newSet.add(1);
        newSet.add(2);
        newSet.add(3);
        newSet.add(4);


        System.out.println("Set before remove 3 :" + newSet);
        newSet.remove(3);
        System.out.println("set after remove 3 :" + newSet);




    }
}